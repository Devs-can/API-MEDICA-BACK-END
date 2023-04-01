package med.voll.api.paciente;

public record DadosListagemPacientes(Long id, String nome, String email, String telefone, String cpf, String rg, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep) {

public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getRg(), paciente.getEndereco().getLogradouro(), paciente.getEndereco().getNumero(), paciente.getEndereco().getComplemento(), paciente.getEndereco().getBairro(), paciente.getEndereco().getCidade(), paciente.getEndereco().getEstado(), paciente.getEndereco().getCep());
    }

}

