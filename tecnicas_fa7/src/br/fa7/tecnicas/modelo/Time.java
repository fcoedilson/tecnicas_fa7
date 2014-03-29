package br.fa7.tecnicas.modelo;

public class Time {
	
	private String nome;
	private String tecnico;
	private Integer torcedores;
	private String divisao;
	private String estado;
	
	
	public Time(){
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getDivisao() {
		return divisao;
	}
	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getTorcedores() {
		return torcedores;
	}

	public void setTorcedores(Integer torcedores) {
		this.torcedores = torcedores;
	}
	

}
