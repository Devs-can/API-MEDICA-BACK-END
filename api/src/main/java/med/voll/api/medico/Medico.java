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

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    private SalaConsultorioMedico salaConsultorioMedico;

    private Sala sala;

    @Embedded
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Medico medico = (Medico) o;
        return id != null && Objects.equals(id, medico.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
//JPA
