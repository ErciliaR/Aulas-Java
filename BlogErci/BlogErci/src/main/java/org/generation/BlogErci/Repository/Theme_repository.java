package org.generation.BlogErci.Repository;

import java.util.List;

import org.generation.BlogErci.Model.Theme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Theme_repository extends JpaRepository<Theme, Long> {
	public List<Theme> findAllByDescricaoContainingIgnoreCase( String descricao);
}
