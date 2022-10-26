package filmes.appREST.service;

import java.util.List;

import filmes.appREST.dao.CategoriaDAO;
import filmes.appREST.model.Categoria;

public class CategoriaService {
	public List<Categoria> listarCategorias(){
		CategoriaDAO dao = new CategoriaDAO();
		
		List<Categoria> lista = dao.listar();
		
		return lista;
	}
}
