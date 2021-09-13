package org.generation.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		
		Usuario usuario = new Usuario(0, "Caio Saldanha", "meuUsuario", "senhasegura123");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "Borges Silva", "borgesUsuario", "senhasegura123");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "Cleitin Silva", "cleitinUsuario", "senhasegura123");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "Junin Silva", "juninUsuario", "senhasegura123");
		
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			usuarioRepository.save(usuario);
	}
	
	@Test
	@DisplayName("💾 Retorna Nome")
	public void findByRetornaNome() {
		
		Usuario usuario = usuarioRepository.findByNome("Caio Saldanha");
		assertTrue(usuario.getNome().equals("Caio Saldanha"));
	}
	
	@Test
	@DisplayName("💾 Retorna 3 Usuários")
	public void findAllByNomeContainingIgnoreCaseRetornaTresUsuarios() {
		
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());
	}
	
	@AfterAll
	public void end() {

		System.out.println("Teste finalizado!");

	}
}
