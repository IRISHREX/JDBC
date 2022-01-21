package myconn;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class JdbcProgram1
{
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			
PreparedStatement pstmn=con.prepareStatement("insert into student values(?,?,?,?,?)");
		
			
			pstmn.setString(1,"Jhilik");
			pstmn.setLong(2,20);
			pstmn.setLong(3,4);
			pstmn.setLong(4,5);
			pstmn.setString(5,"Voice ");
			long i=pstmn.executeUpdate();
			
			
			if(i==1)
			{
				System.out.println(" row created..");
			
			}
			else
			{
				System.out.println(" no row created..");
			} 
				
			
			
			
		}catch(Exception e) {  e.printStackTrace();}
		
		
	}
	}


