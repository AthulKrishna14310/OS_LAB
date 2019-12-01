import java.net.*;
import java.io.*;
class Server{

public static void main(String args[])throws Exception
{
  //ServerSocket ss=new ServerSocket(5000);
  //Socket s=ss.accept();
  
ServerSocket ss=new ServerSocket(5000);
String st=" ";
Socket s=ss.accept();
  
//DataInputStream dis=new DataInputStream(s.getInputStream());
//str=dis.readUTF();  
DataInputStream dis=new DataInputStream(s.getInputStream());

while(!st.contentEquals("exit"))
{
st=dis.readUTF();
System.out.println("client: "+st);
}
dis.close();
s.close();
ss.close();
}
}
