import socket, pickle

HOST = 'localhost'
PORT = 5007
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST, PORT))
s.listen(5)
while True:
	conn, addr = s.accept()
	print ('Connected by', addr)
	# arr = ([1,2,3,4,5,6],[1,2,3,4,5,6])
	# data_string = pickle.dumps(arr)
	myList = "123"
	conn.send(bytes(myList))
# conn.close()
