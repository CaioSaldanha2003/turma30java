package com.exercicio.lojaGames.seguranca;

import java.util.Optional;

import com.exercicio.lojaGames.model.Usuario;
import com.exercicio.lojaGames.seguranca.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exercicio.lojaGames.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));
		
		return user.map(UserDetailsImpl::new).get();
	}
}
