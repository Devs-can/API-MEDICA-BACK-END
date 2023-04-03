package pacimed.api.controller.Exception;

public class PacienteNaoEncontrado extends RuntimeException{
    public PacienteNaoEncontrado(String paciente_não_encontrado)
    {
        super("Paciente não encontrado");
    }
}