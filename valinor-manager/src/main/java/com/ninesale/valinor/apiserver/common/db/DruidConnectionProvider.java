package com.ninesale.valinor.apiserver.common.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * druid连接池provider
 * 
 * @author hawk
 *
 */
public class DruidConnectionProvider implements ConnectionProvider {
	private DruidDataSource dataSource;

	public DruidConnectionProvider(Properties properties) {
		dataSource = new DruidDataSource();
		dataSource.setUrl(properties.getProperty("jdbcUrl"));
		dataSource.setUsername(properties.getProperty("username"));
		dataSource.setPassword(properties.getProperty("password"));
		dataSource.setInitialSize(1);
		dataSource.setMaxActive(20);
		dataSource.setMinIdle(20);
		dataSource.setMaxWait(60000L);
		dataSource.setValidationQuery("select 'x'");
		dataSource.setTestWhileIdle(true);
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);
		dataSource.setTimeBetweenEvictionRunsMillis(60000L);
		dataSource.setMinEvictableIdleTimeMillis(300000L);
	}

	@Override
	public boolean isPooled() {
		return true;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	@Override
	public void start() {

	}

	@Override
	public void restart() throws SQLException {
		dataSource.restart();

	}

	@Override
	public void destroy() {
		dataSource.close();
	}
}
