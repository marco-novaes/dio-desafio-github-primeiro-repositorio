
/**
 * 
 * @author Marco Novaes 
 * @version 02/08/2022
 */
public class ContaCorrente extends Conta
{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
   @Override
   public void imprimirExtrato(){
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }
    
 }
