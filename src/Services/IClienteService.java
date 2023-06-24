package Services;

import Domain.Cliente;
import Exceptions.TipoChaveNaoEncontradaException;


    public interface IClienteService {

        Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

        Cliente buscarPorCPF(Long cpf);

        void excluir(Long cpf);

        void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    }