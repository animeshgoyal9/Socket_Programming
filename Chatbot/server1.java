import java.io.*;
import java.net.*;

public class server1 {

    public static void main(String[] args) throws Exception
    {
        server1 myServer = new server1();
        myServer.run();
    }

    public void run() throws Exception
    {

        //Initializes the port the serverSocket will be on
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("The Server is waiting for a client on port 9999");
        //Accepts the connection for the client socket
        Socket socket = serverSocket.accept();

        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String message;
        //= br.readLine();
        //Confirms that the message was received

    //When this while is here.  The match fails and it goes to the else statement.
    //Without the while statement it will work and print "Received our hello message." 
    //when the client says HELLO.
        PrintStream ps = new PrintStream(socket.getOutputStream());
        while((message =br.readLine())!=null)
         {
             System.out.println(message);
                if(message.equals("HELLO"))
                {

                    ps.println("Received our hello message.");
                }
                if(message.equals("END"))
                {
                    ps.println("Client ended the connection");
                    break;
                }
                else
                {

                    ps.println("Did not receive your hello message");
                }
        }
        ps.close();
        br.close();
        ir.close();
        serverSocket.close();
    }
}