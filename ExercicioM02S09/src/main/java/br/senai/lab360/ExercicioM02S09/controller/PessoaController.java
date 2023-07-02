package br.senai.lab360.ExercicioM02S09.controller;

import br.senai.lab360.ExercicioM02S09.entity.PessoaEntity;
import br.senai.lab360.ExercicioM02S09.service.PessoaService;
import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public PessoaEntity addPessoa(@RequestBody PessoaEntity pessoaEntity) {
        return this.pessoaService.addPessoa(pessoaEntity);
    }

    @GetMapping
    public List<PessoaEntity> getPessoas(@Nullable @RequestParam String filter) {
        return this.pessoaService.getPessoas(filter);
    }

    @GetMapping("/{id}")
    public PessoaEntity getPessoaById(@PathVariable Long id) {
        return this.pessoaService.getPessoaById(id);
    }

    @GetMapping("/true")
    public List<PessoaEntity> findByStatusTrue() {
        return this.pessoaService.findByStatusTrue();
    }

    @PutMapping("/{id}")
    public PessoaEntity updatePessoa(@RequestBody PessoaEntity pessoaEntity, @PathVariable Long id) {
        return this.pessoaService.updatePessoa(pessoaEntity, id);
    }

    @DeleteMapping("/{id}")
    public void deletePessoaById(@PathVariable("id") Long idPessoa) {
        this.pessoaService.deletePessoaById(idPessoa);

    }




}
