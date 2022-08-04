import subsistema1.CrmService;
import subsistema2.CepApi;
/**
 * 
 * @author Marco Novaes
 * @version 04/08/2022
 */
public class Facade
{
    public void migrarCliente(String nome, String cep)
    {
            String cidade = CepApi.getInstancia().recuperarCidade(cep);
            String estado = CepApi.getInstancia().recuperarEstado(cep);
            CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    
    
    }
