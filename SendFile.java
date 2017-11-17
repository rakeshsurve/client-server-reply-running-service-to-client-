import java.net.*;
import java.io.*;
public class SendFile 
{
	public static void main(String[] args) throws Exception 
	{

		ServerSocket se=new ServerSocket(5005);
		Socket q=se.accept();
		System.out.println("Connection established successfully");
		BufferedReader v=new BufferedReader(new InputStreamReader(q.getInputStream()));
		DataOutputStream dr=new DataOutputStream(q.getOutputStream());
                String g=v.readLine();
		FileReader f=null;
		BufferedReader ff=null;
		boolean b;
		try
		{
			Process p = Runtime.getRuntime().exec("cp /etc/services /home/rakesh/Desktop/Services");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
               File r=new File(g);
	       f=new FileReader("Services");
               ff=new BufferedReader(f);
	       String qq;
	       while((qq=ff.readLine())!=null)
		{
                    dr.writeBytes(qq+"\n");

                }

                     dr.close();

                     ff.close();

                     v.close();

                     se.close();

                     q.close();

                     f.close();

                                  

       }

}
