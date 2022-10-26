package filmes.appREST.model;

public class Categoria {
	private Integer id;
	private String titulo;
	private String imagePath;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", titulo=" + titulo + ", imagePath=" + imagePath + "]";
	}
	
}
