package com.edu.qhu.tes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:beans.xml",
		"classpath:beans-jpa-h2.xml" })
public class CoreTest extends AbstractTransactionalTestNGSpringContextTests {

	@Test
	public void testDBConnection() throws SQLException {
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		Connection connection = dataSource.getConnection();
		assert connection != null;
		
	}
}
