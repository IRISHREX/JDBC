package myconn;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileOutputStream;
public class RetrivingImage {
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			PreparedStatement ps=con.prepareStatement("select*from imgtable");
			ResultSet rs=ps.executeQuery();
			rs.next();
			Blob b=rs.getBlob(2);
			byte barr[]=new byte [(int)b.length()];
			barr=b.getBytes(1, (int)b.length());
			String file= System.getProperty("user.dir");
			file=file+"\\src\\myconn\\lovely.png";
			FileOutputStream fout=new FileOutputStream (file);
			fout.write(barr);
			fout.close();
			System.out.println("image downloaded..");
}catch (Exception e) {e.printStackTrace();
}
}
}
