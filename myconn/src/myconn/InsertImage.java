package myconn;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertImage {
	
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			String file= System.getProperty("user.dir");
			file=file+"\\src\\myconn\\priti.png";
			PreparedStatement ps=con.prepareStatement("insert into imgtable values (?,?)");
			FileInputStream fin= new FileInputStream(file);
			ps.setString(1,"img");
			ps.setBinaryStream(2,fin,fin.available());
			
            long i=ps.executeUpdate();
			
			
			if(i==1)
			{
				System.out.println(" row created..");
			
			}
			else
			{
				System.out.println(" no row created..");
			} 
				

}catch (Exception e) {e.printStackTrace();}
}
}