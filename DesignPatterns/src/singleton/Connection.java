package singleton;

import java.util.Optional;

public class Connection {
	
	static Connection con;
	
	private Connection() {
		
	}
	
	public static Connection getConnection() {
		
		Optional<Object> optional=Optional.ofNullable(con);
		if(optional.isPresent()) {
			
			return con;}
		else 
		{
			
			con=new Connection();
			return con;}
		}
//		return new Connection();
//		
	}

