package com.iiht.jdbcannotconfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAO {

	Logger logger = Logger.getLogger("DAO");
	@Autowired
	JDBCConnectionUtil util;
	
	public void insert() {
		
	}
	
	public void update() {
		
	}
	
	
	public void delete() {
		
	}
	
	public void select() throws SQLException{
		Connection con = util.getConnection();
		Statement st = con.createStatement();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			logger.info(rs.getString(1) + rs.getString(2) + rs.getString(3));
		}
	}
	
}
