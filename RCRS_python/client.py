import socket, pickle

HOST = 'localhost'
PORT = 6318
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST, PORT))

data = s.recv(4096)
# data_arr = pickle.loads(data)
# print ('Received', repr(data_arr))
print(data.decode())


# !/usr/bin/python 

# import socket #import socket module


# host = 'localhost' #Get the local machine name
# port = 9989	 
# size = 1024

# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM) #Create a socket object
# s.connect((host,port))

# message = s.recv(1024)
# print(message.decode("utf-8"))


# import socket, pickle

# HOST = 'localhost'
# PORT = 5007
# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# s.connect((HOST, PORT))
# arr = ([1,2,3,4,5,6],[1,2,3,4,5,6])
# data_string = pickle.dumps(arr)
# s.send(data_string)

# data = s.recv(4096)
# data_arr = pickle.loads(data)
# s.close()
# print ('Received', repr(data_arr))
