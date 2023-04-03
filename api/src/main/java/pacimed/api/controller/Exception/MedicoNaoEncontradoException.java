package pacimed.api.controller.Exception;

public class MedicoNaoEncontradoException extends RuntimeException
{
    public MedicoNaoEncontradoException()
    {
        super("Médico não encontrado");
    }
}



