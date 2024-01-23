import socket
import threading
 
 
def task1(input_str):
    input_str = input_str.replace('sh', 'rao')
    return input_str
 
 
def task2(input_str):
    return input_str.lower()
 
 
def task3(input_str):
    return input_str[::-1]
 
 
def handle_client(client_socket, input_str):
    thread_results = []
 
    thread1 = threading.Thread(
        target=lambda: thread_results.append(task1(input_str)))
    thread2 = threading.Thread(
        target=lambda: thread_results.append(task2(input_str)))
    thread3 = threading.Thread(
        target=lambda: thread_results.append(task3(input_str)))
 
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
    server_port = 1234
 
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind((server_host, server_port))
    server.listen(5)
    print(f"Server listening on {server_host}:{server_port}")
 
    while True:
        client_socket, client_address = server.accept()
        print(f"Accepted connection from {client_address}")
 
        input_str = client_socket.recv(1024).decode('utf-8')
        print(f"Received input string from client: {input_str}")
 
        client_thread = threading.Thread(
            target=handle_client, args=(client_socket, input_str))
        client_thread.start()
 
 
if __name__ == '__main__':
    main()