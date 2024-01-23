import socket
 
 
def main():
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect(('localhost', 1234))
 
    input_str = input("Enter a string: ")
    client.send(input_str.encode('utf-8'))
 
    response = client.recv(1024).decode('utf-8')
    print(f"Received from server:\n{response}")
 
 
if __name__ == "__main__":
    main()