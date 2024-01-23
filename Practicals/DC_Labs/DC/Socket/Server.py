import socket
import math
import pickle
import threading  # For serializing data

# Define the server host and port
SERVER_HOST = 'localhost'  # Listen on all available network interfaces
SERVER_PORT = 12345

# Create a socket object and bind it to the server address
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind((SERVER_HOST, SERVER_PORT))

# Listen for incoming connections
server_socket.listen(5)
print(f"Server is listening on {SERVER_HOST}:{SERVER_PORT}")

def handle_client(client_socket):
    try:
        # Receive data from the client
        data = client_socket.recv(1024)
        if not data:
            return

        # Deserialize the received data (expects a tuple: (operation, value))
        operation, value = pickle.loads(data)

        result = None
        if operation == 'square':
            result = value ** 2
        elif operation == 'square_root':
            result = math.sqrt(value)
        elif operation == 'factorial':
            result = math.factorial(value)

        # Send the result back to the client
        client_socket.send(pickle.dumps(result))
    except Exception as e:
        print(f"Error: {e}")
    finally:
        # Close the client socket
        client_socket.close()

while True:
    # Accept a connection from a client
    client_socket, client_address = server_socket.accept()
    print(f"Accepted connection from {client_address}")

    # Handle the client's request in a new thread (for concurrent connections)
    client_handler = threading.Thread(target=handle_client, args=(client_socket,))
    client_handler.start()
