package com.hand.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.hand.dao.UserDao;
import com.hand.dao.impl.UserDaoImpl;
import com.hand.entity.User;
import com.hand.util.ConnectionFactory;
import com.sun.org.apache.regexp.internal.recompile;

public class CheckUserService {

	private UserDao userDao = new UserDaoImpl();
	
	public boolean check(User user){
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			ResultSet rs = userDao.get(conn, user);
			
			while (rs.next()) {
				return true;
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}finally{
			try {
				conn.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		return false;
	}
	
}
