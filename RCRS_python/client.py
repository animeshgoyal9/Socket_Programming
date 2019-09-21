# import socket, pickle

# HOST = 'localhost'
# PORT = 5119
# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# s.connect((HOST, PORT))

# data = s.recv(4096)
# # data_arr = pickle.loads(data)
# # print ('Received', repr(data_arr))
# print(data)


# !/usr/bin/python 

# import socket #import socket module


# host = 'localhost' #Get the local machine name
# port = 9989	 
# size = 1024

# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM) #Create a socket object
# s.connect((host,port))

# message = s.recv(1024)
# print(message.decode("utf-8"))

# **********************************************************************
# import socket, pickle

# HOST = 'localhost'
# PORT = 5119
# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# s.connect((HOST, PORT))
# # arr = ([1,2,3,4,5,6],[1,2,3,4,5,6])
# # data_string = pickle.dumps(arr)
# # s.send(data_string)

# data = s.recv(4096)
# data_arr = pickle.loads(data)
# s.close()
# print ('Received', repr(data_arr))

# ******************************************************************

# #!/usr/bin/python           # This is client.py file
	
# import socket               # Import socket module

# s = socket.socket()         # Create a socket object
# host = socket.gethostname() # Get local machine name
# port = 12215                # Reserve a port for your service.

# s.connect((host, port))
# print (s.recv(1024))
# s.close()                     # Close the socket when done

# *********************************************************************

import socket

s = socket.socket()
s.connect(('localhost',1235))
while True:
    # str = input("298")
    s.send(b'936');
    # if(str == "Bye" or str == "bye"):
    #     break
    # print ("N:",s.recv(1024).decode())
    s.flush()
    s.close() 