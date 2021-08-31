package com.exercicio.lojaGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercicio.lojaGames.model.Categoria;
import com.exercicio.lojaGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
	
}
