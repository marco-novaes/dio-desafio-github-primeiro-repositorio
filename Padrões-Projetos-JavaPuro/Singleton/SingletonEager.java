/**
 * Singleton "apressado"
 * 
 * @author Marco Novaes 
 * @version 04/08/2022
 */
public class SingletonEager
{
    private static SingletonEager instancia = new SingletonEager();
    
    private SingletonEager(){
        super();
    }
    
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
