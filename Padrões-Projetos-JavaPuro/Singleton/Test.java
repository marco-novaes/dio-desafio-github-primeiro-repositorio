/**
 * Classe para testar o Singleton
 * 
 * @author Marco Novaes 
 * @version 04/08/2022
 */
public class Test
{
    public static void main(String[] args){
        
        //Testes relacionados ao Design Pattern Singleton:
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);
    
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    
    }
    
}
