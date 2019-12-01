import java.net.*;
import java.io.*;
import java.util.Scanner;
class client
{
	public static void main(String arg[]) throws Exception
	{
	String str=null;
	String st="exit" ;
	Socket s=new Socket("localhost",5000);

	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	Scanner myObj = new Scanner(System.in);

	while(true){

	 System.out.print("client: ");
	 str=myObj.nextLine();
          dos.writeUTF(str);

	 if(str.contentEquals("exit")){
               s.close();
		 return;
		  }
   }

	}
}
