package filmes.appREST;

import java.sql.Connection;

import filmes.appREST.dao.Dao;
import filmes.appREST.service.CategoriaService;

public class App {

	public static void main(String[] args) {
		CategoriaService servico = new CategoriaService();
		
		System.out.println(servico.listarCategorias());
	}

}
