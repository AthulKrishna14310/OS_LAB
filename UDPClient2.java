import java.io.*;
import java.net.*;
import java.util.*;

class UDPClient2{
    public static void main(String args[])throws Exception{
    DatagramSocket clientSocket=new DatagramSocket();
    DatagramSocket serverSocket=new DatagramSocket(9857);

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

        byte[] receiveData=new byte[1024];
        DatagramPacket receivePacket=
        new DatagramPacket(receiveData,receiveData.length);
        serverSocket.receive(receivePacket);
        sentence=new String(receivePacket.getData());
        if(sentence.contentEquals("exit")){
          System.out.println("Exiting ..");
          return;
        }
        System.out.println(sentence);
      }
    }

}
