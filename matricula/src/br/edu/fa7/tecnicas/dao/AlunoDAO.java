package br.edu.fa7.tecnicas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AlunoDAO {
	
	public void insertAluno(String nome, String matricula) {
		Context context = null;
		Context envContext = null;
		DataSource ds = null;
		Connection conn = null;
		//Statement stmt = null;
		
		PreparedStatement ps = null;
		
		try {

			context = new InitialContext();
			envContext = (Context) context.lookup("java:comp/env");
			ds = (DataSource) envContext.lookup("jdbc/tecnicas");
			conn = ds.getConnection();
			//stmt = conn.createStatement();
			//stmt.executeUpdate("INSERT INTO alunos(id, nome, matricula) VALUES(NULL, 'Eduardo', '0220738')");
			
			ps = conn.prepareStatement("insert into alunos(nome,matricula) values(?,?)");
			ps.setString(1, nome);
			ps.setString(2, matricula);
			
			ps.execute();
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
