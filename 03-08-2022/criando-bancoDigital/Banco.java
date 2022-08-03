import java.util.List;

/**
 * 
 * @author Marco Novaes 
 * @version 02/08/2022
 */
public class Banco
{
    private String nome;
    private List<Conta> contas;
    
    
    //Listar todos os clientes
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas(){
        return contas;
    }
    
    public void setContas(List<Conta> contas){
        this.contas = contas;
    }
}
