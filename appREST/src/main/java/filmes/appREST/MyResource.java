package filmes.appREST;

import java.util.List;

import filmes.appREST.model.Categoria;
import filmes.appREST.service.CategoriaService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("myresource")
public class MyResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("categorias")
    public Response getCategoria() {
    	CategoriaService servico = new CategoriaService();
    	
    	List<Categoria> lista = servico.listarCategorias();
    	
    	Response response = Response.ok().entity(lista).build();
    	
    	return response;
    }
}

