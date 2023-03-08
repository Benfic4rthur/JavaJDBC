package dao;

//Importa a classe Connection do pacote java.sql
import java.sql.Connection;
import java.sql.PreparedStatement;

import conexaoJdbc.SingleConnection;
import model.UserPosJava;

//Cria a classe UserPosJavaDao
public class UserPosJavaDao {
	// Declara a variável connection como uma Connection
	private Connection connection;

	// Cria o construtor da classe
	public UserPosJavaDao() {
		// Atribui à variável connection uma instância de Connection obtida através do
		// método getConnection() da classe SingleConnection
		connection = SingleConnection.getConnection();
	}
	public void salvar(UserPosJava userposjava) {
		try {
		String sql = "insert into userposjava (id, nome, email) values (?, ?, ?)";
		PreparedStatement insert = connection.prepareStatement(sql);
		insert.setLong(1, 3);
		insert.setString(2, "Alex Egidio");
		insert.setString(3, "alex.egidio@gmail.com");
		insert.execute();
		connection.commit(); //salva no banco
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}