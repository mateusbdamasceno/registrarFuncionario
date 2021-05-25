package br.register.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import br.register.bean.Funcionario;
import br.register.services.FuncionarioService;

@Path("/funcionario")
public class FuncionarioResource {
	
	private FuncionarioService service;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> create(@RequestBody Funcionario funcionario) {
		funcionario = service.insertFuncionario(funcionario);
    	return ResponseEntity.ok(funcionario);
    }
	
	@PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> put(Funcionario funcionario){
		funcionario = service.updateFuncionario(funcionario);
		return ResponseEntity.ok(funcionario);
		
	}
	
	@DELETE
    @Path("{id}")
    public ResponseEntity<?> delete(@PathParam("id") int id, Funcionario funcionario){
		service.delete(id);
    	return ResponseEntity.ok("Funcionario deletado com sucesso.");
		
	}

}
