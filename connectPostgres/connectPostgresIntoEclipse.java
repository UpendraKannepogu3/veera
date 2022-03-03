package connectPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectPostgresIntoEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String jdbcURL = "jdbc:postgresql://localhost:5432/schoolmanagement";
   String username = "postgres";
   String password = "admin";
   try {
	Connection connection = DriverManager.getConnection(jdbcURL,username,password);
	System.out.println("Connected to postgreSQL server");
	
	/*String sql = "INSERT INTO students (idno,fname, lname, email)"
	+"VALUES (1,'uppi','kanne','uppi.kanne@gmail')";
	
	Statement statement = connection.createStatement();
	
	int rows = statement.executeUpdate(sql);
	if(rows > 0) {
		System.out.println("student details inserted");
		
	}*/
	
	connection.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.out.println("Error in connection to postgreSQL server");
	e.printStackTrace();
}
	}

}
