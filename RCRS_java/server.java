import java.io.*;
import java.net.*;
import java.util.*;


// public class server {
    
//     static ArrayList<String> myList;

//     public static void main(String srgs[]) {

//         int count = 0;
        
//         initList();

//         //hard code to use port 8080
//         try (ServerSocket serverSocket = new ServerSocket(6318)) {
            
//             System.out.println("I'm waiting here: " + serverSocket.getLocalPort());
            
//             while (true) {
                
//                 try {
//                     Socket socket = serverSocket.accept();
                            
//                     count++;
//                     System.out.println("#" + count + " from "
//                             + socket.getInetAddress() + ":" 
//                             + socket.getPort());
                    
//                     HostThread myHostThread = new HostThread(socket, count);
//                     myHostThread.start();
                    
//                 } catch (IOException ex) {
//                     System.out.println(ex.toString());
//                 }
//             }
//         } catch (IOException ex) {
//             System.out.println(ex.toString());
//         }
//     }
    
//     private static class HostThread extends Thread{
        
//         private Socket hostThreadSocket;
//         int cnt;
        
//         HostThread(Socket socket, int c){
//             hostThreadSocket = socket;
//             cnt = c;
//         }

//         @Override
//         public void run() {
            
//             OutputStream outputStream;
//             try {
//                 outputStream = hostThreadSocket.getOutputStream();
//                 try (ObjectOutputStream objectOutputStream = 
//                     new ObjectOutputStream(outputStream)) {
//                         objectOutputStream.writeObject(myList);
//                 }
//             } catch (IOException ex) {
//                 System.out.println(ex.toString());
//             }finally{
//                 try {
//                     hostThreadSocket.close();
//                 } catch (IOException ex) {
//                     System.out.println(ex.toString());
//                 }
//             }

//         }
//     }
    
//     private static void initList(){
//         // init myList with dummy data
//         myList =  new ArrayList<String>();
//         myList.add("5");
//         myList.add("2");
//         // myList.add("from");
//         // myList.add("helloraspberrypi.blogspot.com");
//     }
// } 
 

public class server{
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(5007);
		Socket sss = ss.accept();

		System.out.println("client connected");

		InputStreamReader in = new InputStreamReader(sss.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		
		String str = bf.readLine();
		System.out.println("client: " + isParseInt(str));

		// PrintWriter pr = new PrintWriter(s.getOutputStream());
  //       pr.println("Yes");
  //       pr.flush();
	}

	public static int isParseInt(String str){
        
        int num = -1;
        try{
             num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
        }
        
        return num;
    }

}

