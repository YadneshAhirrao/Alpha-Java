import socket
import threading
import math 

def factorial(x):
    if x == 1:
        return 1
    else:
        return (x * factorial(x-1))

def task1(input_num):
    sqRoot = math.pow(input_num, 2)
    return sqRoot
 
def task2(input_num):
    return factorial(int(input_num))
 
def task3(input_num):
    if int(input_num) % 2 == 0:
        return "Even"
    else:
        return "Odd"
 
def handle_client(client_socket, input_num):
    thread_results = []
 
    thread1 = threading.Thread(
        target=lambda: thread_results.append(str(task1(float(input_num)))))
    thread2 = threading.Thread(
        target=lambda: thread_results.append(str(task2(int(input_num)))))
    thread3 = threading.Thread(
        target=lambda: thread_results.append(task3(input_num)))
 
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
    server_port = 4422
 
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind((server_host, server_port))
    server.listen(5)
    print(f"Server listening on {server_host}:{server_port}")
 
    while True:
        client_socket, client_address = server.accept()
        print(f"Accepted connection from {client_address}")
 
        input_num = client_socket.recv(1024).decode('utf-8')
        print(f"Received input string from client: {input_num}")
 
        client_thread = threading.Thread(
            target=handle_client, args=(client_socket, input_num))
        client_thread.start()
 
if __name__ == '__main__':
    main()
