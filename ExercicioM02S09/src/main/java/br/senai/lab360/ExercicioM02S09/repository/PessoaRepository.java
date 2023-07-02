package br.senai.lab360.ExercicioM02S09.repository;

import br.senai.lab360.ExercicioM02S09.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    List<PessoaEntity> findByStatusTrue();

    //Implementação de método de pesquisa usando Native Query, usando ILIKE para busca por string case insensitive
//    @Query(value = "select * from pessoa where name ilike %:s% or email ilike %:s%", nativeQuery = true)
//    List<PessoaEntity> findAllByFilter(String s);

    //Implementação de método de pesquisa usando JPQL, usando concat para busca por string case insensitive
    @Query("select p from PessoaEntity p where lower(p.name) like lower(concat('%', :s,'%')) or lower(p.email) like lower(concat('%', :s,'%'))")
    List<PessoaEntity> findAllByFilter(String s);
}
