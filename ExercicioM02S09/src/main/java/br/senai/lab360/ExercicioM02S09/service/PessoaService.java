package br.senai.lab360.ExercicioM02S09.service;

import br.senai.lab360.ExercicioM02S09.entity.Pessoa;
import br.senai.lab360.ExercicioM02S09.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Pessoa> getPessoaById(Long id) {
        return this.pessoaRepository.findById(id);
    }


    public List<Pessoa> findByStatusTrue() {
        return this.pessoaRepository.findByStatusTrue();
    }

    public Pessoa updatePessoa(Pessoa pessoa, Long id) {
        Optional<Pessoa> pessoaToUptade = this.pessoaRepository.findById(id);
        if (pessoaToUptade.isPresent()) {
            Pessoa pessoaFound = pessoaToUptade.get();
            if (pessoa.getName() != null){
                pessoaFound.setName(pessoa.getName());
            }
            if(pessoa.getEmail() != null){
                pessoaFound.setEmail(pessoa.getEmail());
            }
            pessoaFound.setStatus(pessoa.isStatus());
            this.pessoaRepository.save(pessoaFound);
            return pessoaFound;
        }
        return null;
    }

    public void deletePessoaById(Long idPessoa) {
        this.pessoaRepository.deleteById(idPessoa);
    }
}
