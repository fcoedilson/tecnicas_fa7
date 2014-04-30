package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public abstract class DAO<E> {


	final String CONTEXT = "java:comp/env"; 
	Context ctx = null;
	Context env = null;
	DataSource ds = null;
	Connection conn = null;


	public Connection getConnection(String jndi)
			throws NamingException, SQLException{

		ctx = new InitialContext();
		env = (Context) ctx.lookup(CONTEXT);
		ds = (DataSource) env.lookup(jndi);
		conn = ds.getConnection();

		return conn;
	}
	
	public void conectar() throws NamingException, SQLException{
		this.conn = getConnection("jdbc/blog");
	}
	
	public void closeResources(Statement stmt, Connection conn) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeResources(ResultSet rs, Statement stmt, Connection conn) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeResources(stmt, conn);
	}
	

}
