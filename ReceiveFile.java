import java.net.*;

import java.io.*;

public class ReceiveFile 
{
	public static void main(String[] args) throws Exception{
	Socket s=new Socket("localhost",5005);
	BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter file name:  ");
	String filename=k.readLine();
	DataOutputStream d=new DataOutputStream(s.getOutputStream());
	d.writeBytes(filename +"\n");
	BufferedReader i=new BufferedReader(new InputStreamReader(s.getInputStream()));
	String st;
	st=i.readLine();
	while((st=i.readLine())!=null)
	System.out.println(st);
	i.close();
	d.close();
	k.close();
	s.close();

          

}

}
