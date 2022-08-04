
/**
 * 
 * @author Marco Novaes 
 * @version 04/08/2022
 */
public class Robo
{
    //Strategy
    private Comportamento comportamento;
    
    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }
    
    public void mover(){
        comportamento.mover();
    }
}
