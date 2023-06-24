package Dao;

import Domain.Cliente;
import Exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IClienteDAO {
    public default Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return true;
    }

    public default Cliente consultar(Long cpf) {

        return null;
    }

    public default void excluir(Long cpf) {
    }

    public default void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
    }

    public default Collection<Cliente> buscarTodos() {

        return null;
    }
}
