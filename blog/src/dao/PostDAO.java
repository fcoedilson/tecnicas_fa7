package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import model.Post;

public class PostDAO extends DAO<Post>{
	
	
	public boolean save(Post post) throws NamingException, SQLException{
		
		conectar();
		
		PreparedStatement stmt = this.conn.prepareStatement("insert into posts(titulo, texto) values (?, ?)");
		stmt.setString(1, post.getTitulo());
		stmt.setString(2, post.getTexto());
		boolean sucess =  stmt.execute();
		
		closeResources(stmt, conn);
		return sucess;
		
	}
	
	
	public List<Post> listAll() throws NamingException, SQLException{

		conectar();
		
		List<Post> all = new ArrayList<Post>();
		PreparedStatement stmt = this.conn.prepareStatement("select id, titulo, texto, data_cadastro from posts");
	    ResultSet rs = 	stmt.executeQuery();
	    
	    while(rs.next()){
	    	Post p = new Post();
	    	p.setId(rs.getInt(1));
	    	p.setTitulo(rs.getString(2));
	    	p.setTexto(rs.getString(3));
	    	p.setData(rs.getDate(4));
	    	all.add(p);
	    }
	    
	    closeResources(stmt, conn);
		
		return all;
	}

}
