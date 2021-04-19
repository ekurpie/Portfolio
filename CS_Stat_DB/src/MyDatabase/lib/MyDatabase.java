package MyDatabase.lib;

import java.io.Console;
import java.sql.*;
import java.util.Scanner;


public class MyDatabase {

	public static Connection establish_connection(String URL, String DBname, String Username, String Password) {
		
		Connection myConn = null;
		
		try {
			System.out.println("Establishing Connection with Local Host");
			myConn = DriverManager.getConnection("jdbc:mysql://"+ URL +":3306/" + DBname, Username, Password);
		}
		catch(Exception exc) {
			System.out.print("Ya done goofed");
		}
		return myConn;
	}
	
	private static void use_database(Connection conn) {
        try {
        // Do something with the Connection
            Statement stmt = conn.createStatement();
            String tablenames = "Show tables";
            ResultSet tables = stmt.executeQuery(tablenames);
            while(tables.next())
            	System.out.println(tables.getString(1));
            	

            //Execute a query - which will return a result set
            ResultSet rset = stmt.executeQuery("SELECT * from player");

            //Iterate over the result set and process each tuple
            ResultSetMetaData columns = rset.getMetaData();
            int columnCount = columns.getColumnCount();
           for (int i = 1;i <= columnCount; i++) {
        	   String Column = columns.getColumnName(i);
        	   System.out.print(Column + "  ");
           }
            
            while (rset.next()) {
            	System.out.println();
            	for(int i = 1; i <= columnCount; i++) {
                    System.out.print(rset.getString(i) + "         ");
            	}  
            
            }
        
            // Clean up
            rset.close();
            stmt.close();
            // Normally, you would close the connection when done
            // The connection is being left open in this example 
            // so that it does not have to re-established 
        }

    
    catch (SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        System.out.println("SQLState:     " + e.getSQLState());
        System.out.println("VendorError:  " + e.getErrorCode());
    	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Please provide the URL");
	            String URL = s.nextLine();
	        	System.out.println("Please provide the database name: ");
	            String database_name = s.nextLine();
	            System.out.println("Please provide the username");
	            String username = s.nextLine();
	            System.out.println("Please provide the password ");
	            String password = s.nextLine();
	        Connection conn = establish_connection(URL,database_name, username, password);
	        use_database(conn);
	        conn.close();
	        s.close();
		}
		catch (SQLException e){
		System.out.println("ya done goofed");
		}
	        
	}

}
