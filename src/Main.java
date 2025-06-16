public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Novo Banco");
        Cliente sam = new Cliente("Sam Torres");

        Conta cc = new ContaCorrente(sam);
        cc.depositar(100);
        banco.adicionarConta(cc);
                
        Conta cp = new ContaPoupanca(sam);
        cc.transferir(75, cp);
        banco.adicionarConta(cp);

        banco.listarContas();
    }
}
