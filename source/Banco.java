package source;

public class Banco {
	
	private String agencia;
	private String nomeagencia;
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(final String agencia) {
		this.agencia = agencia;
	}

	public String getNomeagencia() {
		return nomeagencia;
	}

	public void setNomeagencia(final String nomeagencia) {
		this.nomeagencia = nomeagencia;
	}

	public Banco(final String agencia, final String nomeagencia) {
		this.agencia = agencia;
		this.nomeagencia = nomeagencia;
	}

}
