package br.com.cardetails.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class AbastecimentoDAO {
	
	
	public DataSource dataSource() throws NamingException{
		
		Context context = new InitialContext();
		Context envContext = (Context) context.lookup("java:comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/cardetails");
		//Connection conn =  ds.getConnection();;
		return ds;
	}
	
	
	public void insertAbastecimento(String placa, Float kmatual, Float quant, Float valor, Date data, String posto) throws NamingException {

		DataSource ds = dataSource();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			conn = ds.getConnection();
			ps = conn.prepareStatement("insert into abastecimento(placa,km, quant, valor, dataabast, posto) values(?,?,?,?,?,?)");
			ps.setString(1, placa);
			ps.setFloat(2, kmatual);
			ps.setFloat(3, quant);
			ps.setFloat(4, valor);
			ps.setDate(5, (java.sql.Date) data);
			ps.setString(6, posto);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
