package com.exercicio.lojaGames.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exercicio.lojaGames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
		public Optional<Usuario> findByUsuario(String usuario);
}
