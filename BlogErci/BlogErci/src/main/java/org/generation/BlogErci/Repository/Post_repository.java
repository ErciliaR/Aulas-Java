package org.generation.BlogErci.Repository;

import java.util.List;
import org.generation.BlogErci.Model.Post_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post_repository extends JpaRepository<Post_model, Long> {
	/* standardized queries */
	public List<Post_model> findAllBytitleContainingIgnoreCase(String title);
}
