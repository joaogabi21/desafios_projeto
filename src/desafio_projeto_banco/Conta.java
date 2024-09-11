package desafio_projeto_banco;

public abstract class Conta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if(saldo < valor)
			System.out.println("Não foi possível realizar o saque.");
		else {
			saldo -= valor;
			System.out.println("Saque feito com sucesso.");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito feito com sucesso.");
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if(valor < saldo)
			contaDestino.depositar(valor);
	}
	
	protected void imprimirExtrato() {
		System.out.println("---- Extrato da Conta ----");
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Numero: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}
}
