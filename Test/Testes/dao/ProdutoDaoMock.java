package Testes.dao;

import Dao.IProdutoDAO;
import Domain.Cliente;
import Domain.Produto;
import Exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return null;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {

    }
}
