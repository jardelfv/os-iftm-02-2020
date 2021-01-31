/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jarde
 */

@Getter @Setter
public class CrudBean extends JsfUtil{
    
    
    private Status status = Status.BUSCA;
    
    private enum Status{
        BUSCA,
        NOVO,
        EDITA
    }
    
    public void novo(){
        status = Status.NOVO;
    }
    
    public void salvar(){
        addMensagemInfo("Salvo com sucesso");
        buscar();
    }
    
    public void buscar(){
        if (status.equals(Status.BUSCA)) {
            addMensagemAviso("Nenhum dado cadastrado.");
        }
        status = Status.BUSCA;
    }
    
    public void editar(){
        status = Status.EDITA;
    }
    
    public void hello(){
        //FacesMessage message = new FacesMessage("Hello");
        //FacesContext.getCurrentInstance().addMessage(null, message);
        status = status.equals(Status.NOVO)?Status.BUSCA:Status.NOVO;
    }
}
