package com.ninesale.valinor.apiserver.common.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

/**
 * druid连接池provider
 * 
 * @author hawk
 *
 */
public class BonecpConnectionProvider implements ConnectionProvider {
	private BoneCP dataSource;

	public BonecpConnectionProvider(Properties properties) {
		Properties props = new Properties();

		props.put("jdbcUrl", properties.getProperty("jdbcUrl"));
		props.put("username", properties.getProperty("username"));
		props.put("password", properties.getProperty("password"));
		props.put("partitionCount", 4);
		props.put("maxConnectionsPerPartition", 20);
		props.put("minConnectionsPerPartition", 10);

		BoneCPConfig config;
		try {
			config = new BoneCPConfig(props);
			dataSource = new BoneCP(config);

		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		// dataSource.restart();

	}

	@Override
	public void destroy() {
		dataSource.close();
	}
}
