package filmes.appREST.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection getConexao() {
		Connection cnx = null;
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "db_filmes";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			String user = "root";
			String password = "";
			
			cnx = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar ao banco de dados");
			e.printStackTrace();
			return null;
		}
		
		return cnx;
	}
}
