package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;


@Entity(name = "Medico")
@AllArgsConstructor
@NoArgsConstructor
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Enumerated(EnumType.STRING)
    private Consultorio consultorio;
    @Enumerated(EnumType.STRING)
    private Sala sala;
    private Endereco endereco;


    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.consultorio = dados.consultorio();
        this.sala = dados.sala();
        this.endereco = new Endereco(dados.endereco());
    }
}
