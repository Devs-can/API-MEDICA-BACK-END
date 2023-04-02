package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.controller.Exception.MedicoNaoEncontradoException;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedicos;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
    @GetMapping
    public Page<DadosListagemMedicos> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedicos::new);
    }

    @GetMapping("/{id}")
    public Medico buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(MedicoNaoEncontradoException::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public Medico atualizar(@PathVariable Long id, @RequestBody DadosCadastroMedico dados) {
        return repository.findById(id)
                .map(medicos -> {
                    medicos.atualizar(dados);
                    return medicos;
                })
                .orElseThrow(MedicoNaoEncontradoException::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public Medico remover(@PathVariable Long id) {
        return repository.findById(id)
                .map(medico -> {
                    repository.delete(medico);
                    return medico;
                })
                .orElseThrow(MedicoNaoEncontradoException::new);
    }
}