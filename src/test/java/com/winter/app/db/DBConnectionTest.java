package com.winter.app.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DBConnectionTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	void dbTest() throws Exception {
		Connection connection = dataSource.getConnection();
		//연결되어있음 null은 아님
		assertNotNull(connection);
	}
}
