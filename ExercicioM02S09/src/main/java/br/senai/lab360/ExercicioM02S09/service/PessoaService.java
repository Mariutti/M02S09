package br.senai.lab360.ExercicioM02S09.service;

import br.senai.lab360.ExercicioM02S09.entity.Pessoa;
import br.senai.lab360.ExercicioM02S09.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    public Pessoa addPessoa(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return this.pessoaRepository.findAll();
    }
}
