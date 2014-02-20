package br.fa7.tecnicas.modelo;

import java.io.Serializable;
import java.util.Date;

public class Curriculum implements Serializable{

	private String nome;
	private String rg;
	private String cpf;
	private String telefone;
	private String email;
	private Date dataNascimento;
	private String naturalidade;
	private String sexo;
	
	private String endereco;
	private String empresa;
	private String cargo;
	private String competencias;
	private Date admissao;
	private Date desligamento;
	
	private String propostaSalarial;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCompetencias() {
		return competencias;
	}
	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getDesligamento() {
		return desligamento;
	}
	public void setDesligamento(Date desligamento) {
		this.desligamento = desligamento;
	}
	public String getPropostaSalarial() {
		return propostaSalarial;
	}
	public void setPropostaSalarial(String propostaSalarial) {
		this.propostaSalarial = propostaSalarial;
	}
	
}
