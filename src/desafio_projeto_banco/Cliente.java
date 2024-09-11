package desafio_projeto_banco;

public class Cliente {
	private String nome;
	private long cpf;

	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}
