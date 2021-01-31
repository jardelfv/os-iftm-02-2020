/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.bean;

import br.edu.iftm.os.model.Usuario;
import br.edu.iftm.os.repository.UsuarioRepository;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.SessionMap;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jarde
 */
@Named
@SessionMap
@Getter @Setter
public class UsuarioBean implements Serializable{
    @Inject
    private UsuarioRepository repositorio;
    
    private Usuario usuario;
    private List<Usuario> usuarios;
    
    @PostConstruct
    public void init(){
        novo();
    }
    
    public void novo(){
        this.usuario = new Usuario();
    }
    
    public void salvar(){
        this.repositorio.salvar(this.usuario);
        novo();
    }
    
    public void deletar(Usuario usuario){
        this.repositorio.deletar(usuario);
        usuarios.remove(usuario);
    }
    
    public void editar(Usuario usuario){
        this.usuario = usuario;
    }
    
    public void listar(){
        this.usuarios = this.repositorio.listar();
    }
}
