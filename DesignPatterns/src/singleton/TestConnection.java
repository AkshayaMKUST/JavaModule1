package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();
		if(con1.equals(con2)) //if(con1.hashcode()==con2.hashcode())
			System.out.println("Singleton");
		else
			System.out.println("Not singleton");
		}

	}

}
