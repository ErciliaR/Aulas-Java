package org.generation.MinhaEscola.Repository;

import org.generation.MinhaEscola.Model.StudentsModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<StudentsModel, Long> {

}
