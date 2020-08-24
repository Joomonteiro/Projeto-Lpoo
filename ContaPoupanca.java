package ProjetoLpooSistemaDeBanco;

public class ContaPoupanca extends Conta {
	
	public double juros=1.1;
	
	public ContaPoupanca(String numero,String agencia,String nomeagencia,String nome,double saldo,String cpf) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeagencia = nomeagencia;
		this.nome = nome;
		this.saldo = saldo;
		this.cpf = cpf;
	}
	public void realizasaque(double saque) {
		if((this.saldo - saque)>=0) {
			this.saldo = this.saldo - saque;
		}
	}
	public  void realizadeposito(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	public void renderjuros() {
		this.saldo = this.saldo*juros; 
	}

}
