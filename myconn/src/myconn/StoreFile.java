package myconn;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StoreFile {
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into filestore values (?,?)");
			String file= System.getProperty("user.dir");
			file=file+"\\src\\myconn\\MetaData.java";
			File f=new File (file);
			FileReader fr=new FileReader(f);
			ps.setInt(1, 3489);
			ps.setCharacterStream(2, fr, (int)f.length());
			int i=ps.executeUpdate();
			System.out.println(i + "img is Stored....");
			con.close();

}catch (Exception e) {e.printStackTrace();}
}
}