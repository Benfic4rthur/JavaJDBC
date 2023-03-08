package dao;

//Importa a classe Connection do pacote java.sql
import java.sql.Connection;

//Importa a classe SingleConnection do pacote conexaoJdbc
import conexaoJdbc.SingleConnection;

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
}