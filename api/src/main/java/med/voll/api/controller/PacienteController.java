package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.controller.Exception.MedicoNaoEncontradoException;
import med.voll.api.controller.Exception.PacienteNaoEncontrado;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        pacienteRepository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<Paciente> listar(@RequestParam(required = false, defaultValue = "0") int page,
                                 @RequestParam(required = false, defaultValue = "10") int size) {
        return pacienteRepository.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/{id}")
    public Paciente buscarPorId(@PathVariable int id) {
        return pacienteRepository.findById((long) id).orElse(null);
    }

    @PutMapping("/{id}")
    @Transactional
    public Paciente atualizar(@PathVariable int id, @RequestBody DadosCadastroPaciente dados) {
        return pacienteRepository.findById((long) id)
                .map(paciente -> {
                    paciente.atualizar(dados);
                    return paciente;
                })
                .orElseThrow( () -> new PacienteNaoEncontrado("Paciente não encontrado"));
    }


    @DeleteMapping("/{id}")
    @Transactional
    public Paciente remover(@PathVariable int id) {
        return pacienteRepository.findById((long) id)
                .map(paciente -> {
                    pacienteRepository.delete(paciente);
                    return paciente;
                })
                .orElseThrow( () -> new PacienteNaoEncontrado("Paciente não encontrado"));
    }


}