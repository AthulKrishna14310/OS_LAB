import java.io.*;
import java.net.*;
import java.util.*;

class UDPClient{
    public static void main(String args[])throws Exception{
    DatagramSocket clientSocket=new DatagramSocket();
    InetAddress    ipAddress= InetAddress.getByName("localhost");
    Scanner sc=new Scanner(System.in);
    while(true){
       System.out.println("Enter the message ::");
       String sentence=sc.next();

        if(sentence.contentEquals("exit")){
        System.out.println("Exiting from client.");
        return;
        }
        DatagramPacket datagramPacket=new DatagramPacket(
        sentence.getBytes(),
        sentence.getBytes().length,
        ipAddress,
        9856
        );
        clientSocket.send(datagramPacket);
      }
    }

}
