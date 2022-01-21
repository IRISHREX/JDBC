package myconn;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaData {
	public static void main(String[]args)
	{
		
		try {
			
		
			Connection con=	ConnectionProvider.getConnection();
			
			
			Statement statement=con.createStatement();
			ResultSet rs =statement.executeQuery("select* from Emp");
			while(rs.next()) {
			System.out.println("name..."+rs.getString(2)+"   Employee id.."+rs.getInt(1));
			}
			//Result Set Meta Data
			ResultSetMetaData resultsetMetadata=rs.getMetaData();
			
			System.out.println(resultsetMetadata.getColumnCount());
			System.out.println(resultsetMetadata.getColumnName(1));
			System.out.println(resultsetMetadata.getColumnType(1));
			System.out.println(resultsetMetadata.getTableName(1));
			//Database Meta Data 
			DatabaseMetaData databaseMetaData=con.getMetaData();
			
			
			System.out.println(databaseMetaData.getDriverMajorVersion());
			System.out.println(databaseMetaData.getURL());
			System.out.println(databaseMetaData.getUserName());
			System.out.println(databaseMetaData.getTableTypes());
	
}catch (Exception e)
		{
	e.printStackTrace();
		}
}
}