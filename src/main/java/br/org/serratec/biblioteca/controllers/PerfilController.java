package br.org.serratec.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.biblioteca.dtos.PerfilResumidoDto;
import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.services.PerfilService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

	@Autowired
	PerfilService perfilService;

	@GetMapping
	public ResponseEntity<List<Perfil>> findAll() {
		return new ResponseEntity<>(perfilService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/perfil-resumido")
	public ResponseEntity<List<PerfilResumidoDto>> findAllPerfilResumido() {
		return new ResponseEntity<>(perfilService.findAllPerfilResumido(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Perfil> findById(@PathVariable Integer id) {
		Perfil perfil = perfilService.findById(id);

		if (perfil == null)
			return new ResponseEntity<>(perfil, HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(perfil, HttpStatus.OK);
	}

	@GetMapping("/perfil-resumido/{id}")
	public ResponseEntity<PerfilResumidoDto> findByIdResumido(@PathVariable Integer id) {
		PerfilResumidoDto perfilDto = null;
		// try {
		perfilDto = perfilService.findByIdResumido(id);
		// } catch (IllegalArgumentException e) {
		// throw new IllegalArgumentException("Ocorreu uma exceção: " + e);
		// }

		if (perfilDto == null)
			return new ResponseEntity<>(perfilService.findByIdResumido(id), HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(perfilService.findByIdResumido(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Perfil> save(@Valid @RequestBody Perfil perfil) {
		return new ResponseEntity<>(perfilService.save(perfil), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Perfil> update(@RequestBody Perfil perfil) {
		return new ResponseEntity<>(perfilService.update(perfil), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		Boolean deletado = perfilService.delete(id);
		if (deletado)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	/*
	 * @ExceptionHandler(IllegalArgumentException.class)
	 * 
	 * @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) public ResponseEntity<?>
	 * handleIllegalArgumentException( IllegalArgumentException exception,
	 * WebRequest request) {
	 * 
	 * ProblemDetail pd =
	 * ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR,
	 * "Ocorreu um erro: " + exception.getLocalizedMessage());
	 * pd.setType(URI.create("http://localhost:8080/errors/internal-server-error"));
	 * pd.setTitle("Erro Interno"); pd.setProperty("hostname", "localhost");
	 * //pd.setDetail("Detalhe da excessão"); return
	 * ResponseEntity.status(500).body(pd); }
	 */

}
