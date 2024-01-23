import socket
import threading
import math

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return (a * b) // gcd(a, b)

def task1(num1, num2):
    return lcm(num1, num2)

def task2(num1, num2):
    return gcd(num1, num2)

def task3(num1, num2):
    return num1 * num2

def handle_client(client_socket, input_nums):
    num1, num2 = input_nums
    thread_results = []

    thread1 = threading.Thread(
        target=lambda: thread_results.append(str(task1(num1, num2))))
    thread2 = threading.Thread(
        target=lambda: thread_results.append(str(task2(num1, num2))))
    thread3 = threading.Thread(
        target=lambda: thread_results.append(str(task3(num1, num2))))

    thread1.start()
    thread2.start()
    thread3.start()

    thread1.join()
    thread2.join()
    thread3.join()

    response = "\n".join(thread_results)
    client_socket.send(response.encode('utf-8'))
    client_socket.close()

def main():
    server_host = '127.0.0.1'
    server_port = 4444

    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind((server_host, server_port))
    server.listen(5)
    print(f"Server listening on {server_host}:{server_port}")

    while True:
        client_socket, client_address = server.accept()
        print(f"Accepted connection from {client_address}")

        input_nums_str = client_socket.recv(1024).decode('utf-8')
        input_nums = list(map(int, input_nums_str.split()))
        print(f"Received input numbers from client: {input_nums}")

        client_thread = threading.Thread(
            target=handle_client, args=(client_socket, input_nums))
        client_thread.start()

if __name__ == '__main__':
    main()
