package pacimed.api.paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pacimed.api.endereco.Endereco;

import lombok.Getter;

@Getter
@Entity(name = "Paciente")
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastroPaciente dado) {
        this.nome = dado.nome();
        this.email = dado.email();
        this.telefone = dado.telefone();
        this.cpf = dado.cpf();
        this.endereco = new Endereco(dado.endereco());
    }

    public void atualizar(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }
}