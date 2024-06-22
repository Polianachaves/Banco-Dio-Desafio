public class DadosCliente {
    
    public static void main(String[] args) {
		Cliente poliana = new Cliente();
		poliana.setNome("Poliana");
		
		Conta cc = new ContaCorrente(poliana);
		Conta poupanca = new ContaPoupanca(poliana);

		cc.depositar(300);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
