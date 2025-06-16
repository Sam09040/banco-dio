public class Main {
    public static void main(String[] args) {
        Cliente sam = new Cliente();
        sam.setNome("Sam");

        Conta cc = new ContaCorrente(sam);
        cc.depositar(100);
                
        Conta cp = new ContaPoupanca(sam);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
