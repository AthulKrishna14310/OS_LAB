import java.net.*;
import java.io.*;
class echoserver{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(5000);
String st=" ";
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
while(!st.contentEquals("exit"))
{
st=dis.readUTF();
dos.writeUTF(st);
System.out.println("client: "+st);
}
dis.close();
s.close();
ss.close();
}
}
