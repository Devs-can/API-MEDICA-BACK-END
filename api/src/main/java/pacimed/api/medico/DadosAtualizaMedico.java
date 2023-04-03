package pacimed.api.medico;

public record DadosAtualizaMedico(
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Consultorio consultorio,
        Sala sala) {

}
