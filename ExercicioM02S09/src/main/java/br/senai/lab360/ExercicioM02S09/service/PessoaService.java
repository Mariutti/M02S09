package br.senai.lab360.ExercicioM02S09.service;

import br.senai.lab360.ExercicioM02S09.entity.PessoaEntity;
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


    public PessoaEntity addPessoa(PessoaEntity pessoaEntity) {
        return this.pessoaRepository.save(pessoaEntity);
    }

    public List<PessoaEntity> getPessoas(String filter) {
        if (filter==null || filter.isEmpty()) {

            return this.pessoaRepository.findAll();
        }
        return this.pessoaRepository.findAllByFilter(filter);
    }

    public PessoaEntity getPessoaById(Long id) {
        Optional<PessoaEntity> byId = this.pessoaRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }


    public List<PessoaEntity> findByStatusTrue() {
        return this.pessoaRepository.findByStatusTrue();
    }

    public PessoaEntity updatePessoa(PessoaEntity pessoaEntity, Long id) {
        Optional<PessoaEntity> pessoaToUptade = this.pessoaRepository.findById(id);
        if (pessoaToUptade.isPresent()) {
            PessoaEntity pessoaEntityFound = pessoaToUptade.get();
            if (pessoaEntity.getName() != null) {
                pessoaEntityFound.setName(pessoaEntity.getName());
            }
            if (pessoaEntity.getEmail() != null) {
                pessoaEntityFound.setEmail(pessoaEntity.getEmail());
            }
            pessoaEntityFound.setStatus(pessoaEntity.isStatus());
            this.pessoaRepository.save(pessoaEntityFound);
            return pessoaEntityFound;
        }
        return null;
    }

    public void deletePessoaById(Long idPessoa) {
        this.pessoaRepository.deleteById(idPessoa);
    }


}
