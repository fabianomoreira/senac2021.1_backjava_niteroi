package filmes.appREST.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import filmes.appREST.model.Categoria;

public class CategoriaDAO {
	@SuppressWarnings("finally")
	public List<Categoria> listar(){
		Connection conexao = Dao.getConexao();
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("SELECT * FROM categoria;");
		
		PreparedStatement ps;
		
		List<Categoria> lista = new ArrayList<Categoria>();

		Categoria categoria;
		
		try {
			ps = conexao.prepareStatement(sql.toString());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				categoria = new Categoria();
				categoria.setId(rs.getInt("id"));
				categoria.setTitulo(rs.getString("titulo"));
				categoria.setImagePath(rs.getString("imagePath"));
				
				lista.add(categoria);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return lista;
		}
		
	}
}
