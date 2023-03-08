package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import dao.UserPosJavaDao;
import model.UserPosJava;

public class testeBancoJdbc {
	@Test
	public void initBanco() {
		UserPosJavaDao userPosJavaDao = new UserPosJavaDao();
		UserPosJava userPosJava = new UserPosJava();
		
		userPosJavaDao.salvar(userPosJava);
	}
}