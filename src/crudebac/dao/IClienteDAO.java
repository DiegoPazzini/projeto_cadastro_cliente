
package crudebac.dao;

import crudebac.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author Wendell Marcos
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(Long cpf);
    
    public Collection<Cliente> buscarTodos();
    
}
