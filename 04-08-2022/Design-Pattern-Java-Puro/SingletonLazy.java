/**
 * Singleton "preguiçoso"
 *
 * @author Marco Novaes 
 * @version 04/08/2022
 */
public class SingletonLazy
{
  private static SingletonLazy instancia;
  
  private SingletonLazy(){
      super();
    }
    
    public static SingletonLazy getInstancia(){
        if(instancia == null){ 
            instancia = new SingletonLazy();
        }
            return instancia;
        
    }
}
