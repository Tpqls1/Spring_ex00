package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

//	스프링에서 JDBC 라이브러리를 로딩하는지 테스트
@Log4j
public class JDBCTests {
	//	JDBC 트라이버 클래스를 로딩
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//	메소드 영역으로 로딩
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false",
				"study","mystudy")){
			log.info(conn);		//	테스트 성공 (스프링에서 데이터베이스 연동 가능)
		}catch(Exception e) {
			fail(e.getMessage());	//	예외가 발생하면 테스트가 실패
		}
	}
}
