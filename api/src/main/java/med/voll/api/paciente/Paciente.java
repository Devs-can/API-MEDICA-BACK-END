package med.voll.api.paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

import lombok.Getter;
import org.hibernate.Hibernate;
import java.util.Objects;

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

}