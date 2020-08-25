package ProjetoLpooSistemaDeBanco;

public class Cliente {
	
	public String rg;
	public String cpf;
	public String nome;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente (String rg,String cpf,String nome) {
		this.rg = rg;
		this.cpf = cpf;
		this.nome = nome;
	}
	

}
