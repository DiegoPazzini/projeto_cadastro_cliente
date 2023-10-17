package crudebac.dao; // Pacote que contém as classes relacionadas à manipulação de dados de clientes.

import crudebac.domain.Cliente; // Importação da classe Cliente do pacote crudebac.domain.
import java.util.Collection; // Importação da interface Collection do pacote java.util para uso genérico de coleções.

/**
 * Interface que representa as operações básicas de um DAO (Data Access Object) para a entidade Cliente.
 * @author Diego Pazzini
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente); // Método para cadastrar um cliente no banco de dados.

    public void excluir(Long cpf); // Método para excluir um cliente do banco de dados com base no CPF.

    public void alterar(Cliente cliente); // Método para alterar os detalhes de um cliente existente no banco de dados.

    public Cliente consultar(Long cpf); // Método para consultar e recuperar os detalhes de um cliente com base no CPF.

    public Collection<Cliente> buscarTodos(); // Método para buscar e retornar todos os clientes presentes no banco de dados.

}
