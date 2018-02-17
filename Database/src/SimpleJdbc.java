import java.sql.*;

public class SimpleJdbc {
	public static void main(String[] args)
		throws SQLException, ClassNotFoundException {
		//Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//connect to a database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "com-mys-mys-22751");
		System.out.println("Database connected");
		
		//create a statement
		Statement statement = connection.createStatement();
		
		//execute a statement
		ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from Student where lastName " + " = 'Smith'");
		
		//Iterate through the result and print the student names
		while (resultSet.next())
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
		
		//close the connection
		connection.close();
	}

}
