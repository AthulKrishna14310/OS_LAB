import java.io.*;
import java.net.*;
import java.util.*;

class UDPServer2{
  public static void main(String args[])throws Exception{
    DatagramSocket serverSocket=new DatagramSocket(9856);
    DatagramSocket clientSocket=new DatagramSocket();
    InetAddress    ipAddress   = InetAddress.getByName("localhost");

       while(true){

         byte[] receiveData =new byte[1024];
         DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
         serverSocket.receive(receivePacket);
         String sentence=new String(receivePacket.getData());
         System.out.println(sentence);

         if(sentence.contentEquals("exit")){
           return;
         }

         System.out.println("Enter the message :: ");
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         DatagramPacket sendPacket=new DatagramPacket(s.getBytes(),
         s.getBytes().length,ipAddress,9857);
         clientSocket.send(sendPacket);

         }

    }

}
