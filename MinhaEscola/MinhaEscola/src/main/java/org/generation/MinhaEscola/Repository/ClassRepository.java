package org.generation.MinhaEscola.Repository;

import java.util.List;
import org.generation.MinhaEscola.Model.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassModel, Long> {
	/* standardized queries */
	public List<ClassModel> findAllByClassIdContainingIgnoreCase(String classId);
}
