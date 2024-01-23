import socket

def main():
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect(('localhost', 4444))

    input_nums = input("Enter two numbers separated by space: ")
    client.send(input_nums.encode('utf-8'))  # Encode the input as bytes before sending

    response = client.recv(1024)
    print(f"Received from server:\n{response.decode('utf-8')}")  # Decode the received bytes

if __name__ == "__main__":
    main()
