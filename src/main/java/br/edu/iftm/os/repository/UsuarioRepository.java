/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.repository;

import br.edu.iftm.os.model.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jarde
 */
public class UsuarioRepository implements Serializable{
    
    public Usuario salvar(Usuario usuario){
        
        if(usuario.getDataCadastro() == null){
            usuario.setDataCadastro(new Date());
        }
        
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        usuario = em.merge(usuario);
        em.getTransaction().commit();
        em.close();
        return usuario;
    }
    
    public void deletar(Usuario usuario){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        usuario = em.find(Usuario.class, usuario.getId());
        em.remove(usuario);
        em.getTransaction().commit();
    }
    
    public List<Usuario> listar(){
        EntityManager em = getEntityManager();
        List<Usuario> usuarios = em.createQuery("select * from Usuario", Usuario.class).getResultList();
        return usuarios;
    }
    
    public EntityManager getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistemaospu");
        return emf.createEntityManager();
    }
}
