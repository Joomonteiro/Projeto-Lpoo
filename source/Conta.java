package ProjetoLpooSistemaDeBanco;

public abstract class Conta implements InterfaceConta {
	public String numero;
	public String agencia;
	public String nomeagencia;
	public double saldo;
	Cliente titular;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeagencia() {
		return nomeagencia;
	}
	public void setNomeagencia(String nomeagencia) {
		this.nomeagencia = nomeagencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Conta(String numero,String agencia,String nomeagencia,double saldo,Cliente titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeagencia = nomeagencia;
		this.saldo = saldo;
		this.titular = titular;
		
	}
	
	
	
}
