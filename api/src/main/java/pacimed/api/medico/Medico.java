package pacimed.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pacimed.api.endereco.Endereco;


@Entity(name = "Medico")
@AllArgsConstructor
@NoArgsConstructor

public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    private String telefone;
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
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.consultorio = dados.consultorio();
        this.sala = dados.sala();
        this.endereco = new Endereco(dados.endereco());
    }

    public Medico(DadosListagemMedicos dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public Sala getSala() {
        return sala;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void atualizar(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.consultorio = dados.consultorio();
        this.sala = dados.sala();
    }
}

