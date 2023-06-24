package Dao;

import Dao.Generics.IGenericDAO;
import Domain.Produto;

import java.util.Collection;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    Class<Produto> getTipoClasse();

    void atualiarDados(Produto entity, Produto entityCadastrado);
}

