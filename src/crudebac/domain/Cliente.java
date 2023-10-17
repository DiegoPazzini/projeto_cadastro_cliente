package crudebac.domain; // Pacote que contém as classes relacionadas aos dados do cliente.

import java.util.Objects; // Importação da classe Objects para lidar com operações em objetos.

/**
 * Classe que representa um cliente.
 * @author Diego Pazzini
 */
public class Cliente {
    
    private String nome; // Declaração do atributo nome para armazenar o nome do cliente.
    private Long cpf; // Declaração do atributo cpf para armazenar o CPF do cliente.
    private Long telefone; // Declaração do atributo telefone para armazenar o número de telefone do cliente.
    private String endereco; // Declaração do atributo endereco para armazenar o endereço do cliente.
    private Integer numero; // Declaração do atributo numero para armazenar o número do endereço do cliente.
    private String cidade; // Declaração do atributo cidade para armazenar a cidade do cliente.
    private String estado; // Declaração do atributo estado para armazenar o estado do cliente.

    public Cliente() {
    }
    
    // Construtor da classe Cliente que aceita os detalhes do cliente.
    public Cliente(String nome, String cpf, String telefone, String endereco, String numero, String cidade, String estado) {
        this.nome = nome; // Inicialização do atributo nome com o valor fornecido.
        this.cpf = Long.valueOf(cpf.trim()); // Conversão e inicialização do atributo cpf com o valor fornecido.
        this.telefone = Long.valueOf(telefone.trim()); // Conversão e inicialização do atributo telefone com o valor fornecido.
        this.endereco = endereco; // Inicialização do atributo endereco com o valor fornecido.
        this.numero = Integer.valueOf(numero.trim()); // Conversão e inicialização do atributo numero com o valor fornecido.
        this.cidade = cidade; // Inicialização do atributo cidade com o valor fornecido.
        this.estado = estado; // Inicialização do atributo estado com o valor fornecido.
    }

    // Métodos getters e setters para o atributo nome.
    public String getNome() {
        return nome; // Retorna o valor do atributo nome.
    }

    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo nome com o valor fornecido.
    }

    // Métodos getters e setters para o atributo cpf.
    public Long getCpf() {
        return cpf; // Retorna o valor do atributo cpf.
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf; // Define o valor do atributo cpf com o valor fornecido.
    }

    // Métodos getters e setters para o atributo telefone.
    public Long getTelefone() {
        return telefone; // Retorna o valor do atributo telefone.
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone; // Define o valor do atributo telefone com o valor fornecido.
    }

    // Métodos getters e setters para o atributo endereco.
    public String getEndereco() {
        return endereco; // Retorna o valor do atributo endereco.
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; // Define o valor do atributo endereco com o valor fornecido.
    }

    // Métodos getters e setters para o atributo numero.
    public Integer getNumero() {
        return numero; // Retorna o valor do atributo numero.
    }

    public void setNumero(Integer numero) {
        this.numero = numero; // Define o valor do atributo numero com o valor fornecido.
    }

    // Métodos getters e setters para o atributo cidade.
    public String getCidade() {
        return cidade; // Retorna o valor do atributo cidade.
    }

    public void setCidade(String cidade) {
        this.cidade = cidade; // Define o valor do atributo cidade com o valor fornecido.
    }

    // Métodos getters e setters para o atributo estado.
    public String getEstado() {
        return estado; // Retorna o valor do atributo estado.
    }

    public void setEstado(String estado) {
        this.estado = estado; // Define o valor do atributo estado com o valor fornecido.
    }

    // Sobrescrita do método toString para retornar uma representação em String dos detalhes do cliente.
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco=" + endereco + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + '}';
    }

    // Sobrescrita do método hashCode para gerar um valor hash baseado nos atributos do cliente.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.telefone);
        hash = 97 * hash + Objects.hashCode(this.endereco);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.cidade);
        hash = 97 * hash + Objects.hashCode(this.estado);
        return hash; // Retorna o valor de hash calculado.
    }

    // Sobrescrita do método equals para verificar se dois objetos Cliente são iguais com base em seus atributos.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Retorna verdadeiro se os objetos forem os mesmos.
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Retorna falso se o objeto fornecido for nulo ou não for uma instância de Cliente.
        }
        Cliente other = (Cliente) obj; // Converte o objeto fornecido para a classe Cliente.
        return Objects.equals(this.nome, other.nome) && Objects.equals(this.cpf, other.cpf) && Objects.equals(this.telefone, other.telefone) && Objects.equals(this.endereco, other.endereco) && Objects.equals(this.numero, other.numero) && Objects.equals(this.cidade, other.cidade) && Objects.equals(this.estado, other.estado);
        // Retorna verdadeiro se os atributos de ambos os objetos Cliente forem iguais.
    }
}
