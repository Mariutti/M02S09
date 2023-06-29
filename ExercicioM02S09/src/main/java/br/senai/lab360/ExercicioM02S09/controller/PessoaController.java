package br.senai.lab360.ExercicioM02S09.controller;

import br.senai.lab360.ExercicioM02S09.entity.Pessoa;
import br.senai.lab360.ExercicioM02S09.repository.PessoaRepository;
import br.senai.lab360.ExercicioM02S09.service.PessoaService;
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
    public Pessoa addPessoa(@RequestBody Pessoa pessoa){
        return this.pessoaService.addPessoa(pessoa);
    }

    @GetMapping
    public List<Pessoa> getPessoas(){
        return this.pessoaService.getPessoas();
    }

}
