package model;

import java.io.Serializable;
import java.util.Date;

public class Post  implements Serializable{

	private Integer id;
	private String texto;
	private String titulo;
	private Date data;
	
	public Post(){

	}
	
	public Post(Integer id, String titulo, String texto, Date Data){
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}

	public Post(String titulo, String texto, Date Data){
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}
	
	public Post(String titulo, String texto){
		this.titulo = titulo;
		this.texto = texto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}
