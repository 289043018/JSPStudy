package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.UserDao;
import com.hand.entity.User;

public class UserDaoImpl implements UserDao {
//保存用户信息
	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps = (PreparedStatement) conn.prepareCall("INSERT INTO tbl_user(name,password,email)values(?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2,user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
		
	}
//根据用户指定的ID更新用户信息
	public void update(Connection conn, long id, User user) throws SQLException {
		String updatesql= "UPDATE tbl_user set name=?,password=?,email=? WHERE id =?";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(updatesql);
		
		ps.setString(1, user.getName());
		ps.setString(2,user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, id);
		ps.execute();
	}
//删除指定的用户信息
	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps = (PreparedStatement) conn.prepareCall("DELETE FROM tbl_user WHERE name=?");
//		ps.setLong(1, user.getId());
		ps.setString(1, user.getName());
		ps.execute();

	}
	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		PreparedStatement ps= conn.prepareStatement("select * from tbl_user where name = ? and password= ? ;");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		return ps.executeQuery();
	}

}
