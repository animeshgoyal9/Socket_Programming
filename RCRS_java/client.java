import java.io.*;
import java.net.*;
import java.util.*;
 
// class client{

//     public static void main(String args[])
//     { 
        
//         try{
//             Socket socket = new Socket("localhost", 6318);
            
//             ArrayList<String> myList;
            
//             ObjectInputStream objectInputStream = 
//                 new ObjectInputStream(socket.getInputStream());
//             try{
//                 Object object = objectInputStream.readObject();
//                 myList = (ArrayList<String>)object;
                    
//                 for (String s : myList) {
//                     System.out.println(isParseInt(s));
//                 }
                    
//             } catch(ClassNotFoundException ex){
//                 System.out.println(ex.toString());
//             }

//             socket.close();            
//         }catch(UnknownHostException e){
//             System.out.println(e.toString());
//         }catch(IOException e){
//             System.out.println(e.toString());
//         }

//     }

//     private static int isParseInt(String str){
        
//         int num = -1;
//         try{
//              num = Integer.parseInt(str);
//         } catch (NumberFormatException e) {
//         }
        
//         return num;
//     }
    
// }


public class client {
    public static void main(String args[]) throws IOException {
 
        Socket s = new Socket("localhost", 5007);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("298");
        pr.flush();
        pr.close();
        
    }
}

// public class client {
//     public static void main(String args[]) throws IOException {
        

//         ArrayList<Integer> targets1 = new ArrayList<Integer>();

//         targets1.add(298);
//         targets1.add(936);

//         try{
//             Socket s = new Socket("localhost", 1235);
//             OutputStream os = s.getOutputStream();
//             ObjectOutputStream oos = new ObjectOutputStream(os);
//             oos.writeObject(targets1);
//             oos.flush();
//             oos.close();
//             os.close();
//             s.close();
//         } catch (IOException ioe){
//                 ioe.printStackTrace();
//         }
        
//     }
// }

// ***********************************************************************
//  class client{
//  public static void main(String[] args) throws IOException{
//      ServerSocket ss = new ServerSocket(6318);
//      Socket sss = ss.accept();

//      System.out.println("client connected");

//      InputStreamReader in = new InputStreamReader(sss.getInputStream());
//      BufferedReader bf = new BufferedReader(in);

//      String str = bf.readLine();
//      System.out.println("client: " + str);

//      // PrintWriter pr = new PrintWriter(s.getOutputStream());
//   //       pr.println("Yes");
//   //       pr.flush();
//  }
// }

// *************************************************************************

