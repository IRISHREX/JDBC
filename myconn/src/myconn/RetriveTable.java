package myconn;

import java.io.FileOutputStream;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveTable {
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			PreparedStatement ps=con.prepareStatement("select*from filestore");
			ResultSet rs=ps.executeQuery();
			rs.next();
			Clob c=rs.getClob(2);
			Reader r=c.getCharacterStream();
			String file= System.getProperty("user.dir");
			file=file+"\\src\\myconn\\conection.java";
			FileOutputStream fout=new FileOutputStream (file);
			
			while (true)
			{
				int i=r.read();
				
					fout.write((char)i);
					if(i==-1)
				break;
				
			}
			fout.close();
			con.close();
			System.out.println("data copied...");
}catch (Exception e) {e.printStackTrace();}
	}
}
