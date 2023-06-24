package Services;

import Dao.Generics.IGenericDAO;
import Dao.IClienteDAO;
import Domain.Cliente;
import Exceptions.TipoChaveNaoEncontradaException;
import Services.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO dao) {
        super((IGenericDAO<Cliente, Long>) dao);
        this.clienteDAO = dao;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

    @Override
    public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);

    }

    @Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
		clienteDAO.alterar(cliente);
	}
}
