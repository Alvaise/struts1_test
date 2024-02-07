package it.alpitour.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private String jdbcUrl;
	private String user;
	private String password;
	
	public Database(String jdbcUrl, String user, String password) {
		this.jdbcUrl = jdbcUrl;
		this.user = user;
		this.password = password;
	}

	/**
	 * @return the jdbcUrl
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	/**
	 * @param jdbcUrl the jdbcUrl to set
	 */
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Connection connection() {
		
		try {
			return DriverManager.getConnection(getJdbcUrl(), getUser(), getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
