package br.senai.lab360.ExercicioM02S09.repository;

import br.senai.lab360.ExercicioM02S09.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
