import socket
import pickle  # For serializing data

# Define the server host and port
SERVER_HOST = 'localhost'  # Change to the server's IP address
SERVER_PORT = 12345

def perform_operation(operation, value):
    try:
        # Create a socket object and connect to the server
        client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        client_socket.connect((SERVER_HOST, SERVER_PORT))

        # Serialize the operation and value as a tuple and send it to the server
        data = pickle.dumps((operation, value))
        client_socket.send(data)

        # Receive the result from the server
        result = pickle.loads(client_socket.recv(1024))
        return result
    except Exception as e:
        print(f"Error: {e}")
    finally:
        # Close the client socket
        client_socket.close()

# Example usage:
if __name__ == "__main__":
    try:
        value = 5

        square_result = perform_operation('square', value)
        print(f"Square of {value} is {square_result}")

        square_root_result = perform_operation('square_root', value)
        print(f"Square root of {value} is {square_root_result}")

        factorial_result = perform_operation('factorial', value)
        print(f"Factorial of {value} is {factorial_result}")
    except KeyboardInterrupt:
        print("Client terminated.")
