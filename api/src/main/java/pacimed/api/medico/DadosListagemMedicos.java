package pacimed.api.medico;

public record DadosListagemMedicos(Long id, String nome, String email, String telefone, String crm, Especialidade especialidade, Consultorio consultorio, Sala sala) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade(), medico.getConsultorio(), medico.getSala());
    }



}