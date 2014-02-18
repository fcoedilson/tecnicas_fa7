package br.fa7.tecnicas.modelo;

public class Suco {
	
	private String marca;
	private String sabor;
	
	public Suco(){
		sabor = "Uva";
		marca = "Q-suco";
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
