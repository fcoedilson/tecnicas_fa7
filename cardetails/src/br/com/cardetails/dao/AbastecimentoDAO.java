package br.com.cardetails.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import br.com.cardetails.entity.*;

public class AbastecimentoDAO {
	
	public DataSource dataSource() throws NamingException{
		
		Context context = new InitialContext();
		Context envContext = (Context) context.lookup("java:comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/cardetails");
		return ds;
	}
	
	
	public List<Abastecimento> list(){
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		List<Abastecimento> list = null;
		try {
			
			DataSource ds = dataSource();
			ps = conn.prepareStatement("select placa, km,km_ant, quant, valor, data, posto from abastecimento");
			ResultSet rs = ps.executeQuery();
			
			list = new ArrayList<Abastecimento>();
			while(rs.next()){
				Abastecimento a = new Abastecimento();
				a.setPlaca(rs.getString("palca"));
				a.setQuantidade(rs.getFloat("quant"));
				a.setKmatual(rs.getFloat("km"));
				a.setKmant(rs.getFloat("km_ant"));
				a.setData(rs.getDate("data"));
				a.setPosto(rs.getString("posto"));
				list.add(a);
			}
		
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public void insert(String placa, Float kmatual, Float quant, Float valor, Date data, String posto) throws NamingException {

		DataSource ds = dataSource();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			conn = ds.getConnection();
			ps = conn.prepareStatement("insert into abastecimento(placa, km, quant, valor, data, posto) values(?,?,?,?,?,?)");
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
