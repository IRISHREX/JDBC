package myconn;

import java.sql.Connection;
import java.sql.DriverManager;
public final class ConnectionProvider
{
private ConnectionProvider()
{
	
}
public static Connection getConnection()
{
	Connection con=null;
	try {
		Class.forName(DatabaseDetails.D_DRIVER);
		con=DriverManager.getConnection(DatabaseDetails.D_URL,DatabaseDetails.D_USER,DatabaseDetails.D_PASS);
	}
	catch (Exception E)
	{
		E.printStackTrace();
	}
	return con;
}
}
