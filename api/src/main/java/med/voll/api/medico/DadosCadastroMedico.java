package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
//DTO
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  SalaConsultorioMedico salaConsultorioMedico, Sala sala, DadosEndereco endereco) {

}
