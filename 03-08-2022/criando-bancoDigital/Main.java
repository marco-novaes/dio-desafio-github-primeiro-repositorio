
/**
 * 
 * @author Marco Novaes
 * @version 03/08/2022
 */
public class Main
{
    public static void main(String[] args) {
        Cliente marco = new Cliente();
        marco.setNome("marco");
        
        Conta cc = new ContaCorrente(marco);
        Conta poupanca = new ContaPoupanca(marco);
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
