package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "Medico")
@AllArgsConstructor
@NoArgsConstructor
public class Medico {

    @Id
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private SalaConsultorioMedico salaConsultorioMedico;
    private Sala sala;
    private Endereco endereco;


    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.sala = dados.sala();
        this.salaConsultorioMedico = dados.salaConsultorioMedico();
        this.endereco = new Endereco(dados.endereco());
    }
}

