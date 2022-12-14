package br.com.gethelp.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//nome do usuário do postgresql
	private static final String USERNAME = "postgres";
	//senha do banco
	private static final String PASSWORD = "udesc";
	//Caminho do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/gethelp";
	
	/*
	 * Conexão com banco de dados
	 */
	public static Connection createConnectionToPostgresql() throws Exception {
		//Faz com que a classe seja carregada pelo JVM
		Class.forName("org.postgresql.Driver");
		//cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	public static void main(String[] args) throws Exception {
		//recuperar uma conexão com banco de dados
		Connection con = createConnectionToPostgresql();
		
		
		//testar se a conexão é nula
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
		
		
	}
			
}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class ConnectionFactory {
//    private Connection con;
//    
//    public ConnectionFactory() {
//        String driver = "org.postgresql.Driver";
//        //nome do usuário do postgresql
//        String user = "postgres";
//        //senha de acesso
//        String senha = "udesc";
//        //Caminho do banco de dados, porta, nome do banco de dados
//        String url = "jdbc:postgresql://localhost:5432/plataforma-ead";
//
//        try {
//            Class.forName(driver);
//            this.con = (Connection) DriverManager.getConnection(url, user, senha);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//            System.exit(1);
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//            System.exit(1);
//        }  
//    }
//    
//    public Connection getConnection() {
//        return con;
//    }
//    
//    public void closeConnection(){
//        try {
//            this.con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//            System.exit(1);
//        }
//    }
//}
