package br.edu.iftm.os.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
@Getter @Setter
@ToString(onlyExplicitlyIncluded = true)
public class Endereco implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ToString.Include
    private String descricao;
    @ToString.Include
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    @ToString.Include
    private String cidade;
    private String estado;
    private Cliente cliente;
    
}
