package com.ninesale.valinor.apiserver.common.db;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionProvider {
	public boolean isPooled();

	public Connection getConnection() throws SQLException;

	public void start();

	public void restart() throws SQLException;

	public void destroy();
}