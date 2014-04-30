package br.com.cardetails.entity;

import java.util.Date;

public class Abastecimento {
	
	private Integer veiculo;
	private String placa;
	private Float kmatual;
	private Float kmant;
	private Float quantidade;
	private Float valor;
	private Float consumo;
	private String posto;
	private Date data;
	private Date dataCadastro;

	public Integer getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Integer veiculo) {
		this.veiculo = veiculo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}


	public Float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getConsumo() {
		return consumo;
	}
	public void setConsumo(Float consumo) {
		this.consumo = consumo;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPosto() {
		return posto;
	}
	public void setPosto(String posto) {
		this.posto = posto;
	}
	public Float getKmatual() {
		return kmatual;
	}
	public void setKmatual(Float kmatual) {
		this.kmatual = kmatual;
	}
	public Float getKmant() {
		return kmant;
	}
	public void setKmant(Float kmant) {
		this.kmant = kmant;
	}
	
}
