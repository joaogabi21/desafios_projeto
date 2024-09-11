package desafio_projeto_banco;

public class Banco {	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("João");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupança(cliente);
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
