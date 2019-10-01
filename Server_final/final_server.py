import socket, pickle, json, subprocess


s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
port = 2021
s.bind(('localhost', port))
s.listen(5)
while True:
	c, addr = s.accept()
	print ("Socket Up and running with a connection from",addr)
	rcvdData = c.recv(1024)
	final = bytes(rcvdData).decode("utf-8")
	string_of_ids = check_output(["echo", final], universal_newlines=True)
	final_1 = string_of_ids.split(", ")
	final_2 = final_1[1:-1]
	test_list = []
	for i in range(len(final_2)): 
		test_list.append(int(final_2[i])) 
	str_list = str(test_list)[1:4]
	byte_str = bytes(str_list, encoding="utf-8")
	print(byte_str)
	c.send(byte_str)
	c.close()