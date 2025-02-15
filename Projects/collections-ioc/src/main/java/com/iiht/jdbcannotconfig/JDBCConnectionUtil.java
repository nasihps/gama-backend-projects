package com.iiht.jdbcannotconfig;



public class JDBCConnectionUtil {

	private String jdbcUrl;
	private String username;
	private String password;
	
	public JDBCConnectionUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public JDBCConnectionUtil(String jdbcUrl, String username, String password) {
		super();
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}
	
	

	public String getJdbcUrl() {
		return jdbcUrl;
	}



	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "JDBCConnectionUtil [jdbcUrl=" + jdbcUrl + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}
