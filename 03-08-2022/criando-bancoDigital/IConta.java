
/**
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public interface IConta
{
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor, IConta contaDestino);
    
    void imprimirExtrato();

}
