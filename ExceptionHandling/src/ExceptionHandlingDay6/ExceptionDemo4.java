package ExceptionHandlingDay6;

import java.sql.SQLException;

public class ExceptionDemo4 {
	
	static void method() throws SQLException{
		throw new SQLException("Connection failed");
	}
	
	public static void main(String[] args) throws SQLException {
		
		method();

	}

}
