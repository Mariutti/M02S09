package br.senai.lab360.ExercicioM02S09.controller;

import br.senai.lab360.ExercicioM02S09.entity.Pessoa;
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

    @GetMapping("/{id}")
    public Optional<Pessoa> getPessoaById(@PathVariable Long id){
        return this.pessoaService.getPessoaById(id);
    }

    @GetMapping("/true")
    public List<Pessoa> findByStatusTrue(){
        return this.pessoaService.findByStatusTrue();
    }

    @PutMapping("/{id}")
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa, @PathVariable Long id){
        return this.pessoaService.updatePessoa(pessoa, id);
    }

    //Implementação do método DELETE
    @DeleteMapping("/{id}")
    public void deletePessoaById(@PathVariable("id") Long idPessoa){
        this.pessoaService.deletePessoaById(idPessoa);

    }

}
