package crudebac.dao;

import crudebac.domain.Cliente;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Classe ClienteDAO responsável por gerenciar a persistência e manipulação de objetos Cliente.
 * Implementa a interface IClienteDAO.
 * @author Diego Pazzini
 */
public class ClienteDAO implements IClienteDAO {

    // Mapa que armazena os clientes usando o CPF como chave
    private final Map<Long, Cliente> map;

    // Construtor da classe ClienteDAO que inicializa o mapa
    public ClienteDAO() {
        map = new TreeMap<>();
    }

    // Método para cadastrar um cliente, retorna true se o cliente foi cadastrado com sucesso
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }

        map.put(cliente.getCpf(), cliente);
        return true;
    }

    // Método para excluir um cliente com base no CPF fornecido
    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    // Método para alterar os detalhes de um cliente existente com base no cliente fornecido
    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTelefone(cliente.getTelefone());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEndereco(cliente.getEndereco());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }

    // Método para consultar um cliente com base no CPF fornecido
    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    // Método para buscar todos os clientes cadastrados e retornar uma coleção de objetos Cliente
    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}