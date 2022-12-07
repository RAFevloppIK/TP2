import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements IDBConnection {
	    
		static String BDD = "nomBD";
		static String url = "jdbc:mysql://localhost:3306/" + BDD;
		static String user = "root";
		static String passwd = "";
	    private static Connection conn;
	    
	    public static DBConnection singleconnection = new DBConnection();
	    
        //you'll find above : connection informations
	    
	    private DBConnection(){}
	    
	    public static DBConnection getInstance() throws SQLException{
	    	conn=DriverManager.getConnection(url, user,passwd);
	    	return singleconnection;
	    
	    }
	    
	    

	    @Override
	    public Connection getConn() {
			return conn;
		}


		
	
}
