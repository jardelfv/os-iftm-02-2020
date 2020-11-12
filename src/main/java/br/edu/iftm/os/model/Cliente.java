package br.edu.iftm.os.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Getter @Setter
@ToString(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //id
    @Column(name="nome_fantasia")
    @ToString.Include
    private String nomeFantasia; //nome_fantasia
    @Column(name="sobremenome_razao")
    @ToString.Include
    private String sobrenomeRazao;//sobremenome_razao
    @Column(name="data_nascimento")
    private Date dataNascimento;
    @Column(name="data_cadastro")
    private Date dataCadastro;
    @Column(name="cpf_cnpj")
    private String cpfCnpj;
    @Column(name="rg_inscricao")
    private String rgInscricao;
    private String email;
    private String sexo;

}
