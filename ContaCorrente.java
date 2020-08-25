package ProjetoLpooSistemaDeBanco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String numero,String agencia,String nomeagencia,double saldo,Cliente titular) {
		super(numero, agencia, nomeagencia, saldo, titular);
	}
	public void realizasaque(double saque) {
		if((this.saldo - saque)>=0) {
			this.saldo = this.saldo - saque;
		}
	}
	public  void realizadeposito(double deposito) {
		this.saldo = this.saldo + deposito;
	}
}
