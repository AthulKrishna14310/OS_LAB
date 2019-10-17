import java.net.*;
import java.io.*;
import java.util.Scanner;
class echoclient
{
	public static void main(String arg[]) throws Exception
	{
		//create socket
        String str=null;
	String st="exit" ;
	Socket s=new Socket("localhost",5000);
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	DataInputStream dis=new DataInputStream(s.getInputStream());
	Scanner myObj = new Scanner(System.in);
        do
	{
	System.out.print("client: ");
	str=myObj.nextLine();
	dos.writeUTF(str);
	str=dis.readUTF();
	System.out.println("server:"+str);
	}while(str.equals(st)==false);
	dos.close();
	s.close();
	}
}
