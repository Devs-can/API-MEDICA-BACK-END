package med.voll.api.paciente;

public record DadosListagemPacientes(Long id, String nome, String email, String telefone, String cpf, String rg, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep) {



    public DadosListagemPacientes(Long id, String nome, String email, String telefone, String cpf, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this(id, nome, email, telefone, cpf, null, logradouro, numero, complemento, bairro, cidade, estado, cep);
    }
}

