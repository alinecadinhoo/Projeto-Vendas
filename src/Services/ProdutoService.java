package Services;

import Dao.IProdutoDAO;
import Domain.Cliente;
import Domain.Produto;
import Exceptions.TipoChaveNaoEncontradaException;
import Services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return true;
    }
}


