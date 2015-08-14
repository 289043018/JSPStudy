package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.entity.User;

public interface UserDao {
	public void save(Connection conn,User user)throws SQLException;
	
	public void update(Connection conn,long id,User user)throws SQLException;
	
	public void delete(Connection conn,User user)throws SQLException;
	
	public ResultSet get(Connection conn,User user)throws SQLException;
}
