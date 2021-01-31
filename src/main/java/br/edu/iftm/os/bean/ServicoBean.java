package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.ServicoLogic;
import br.edu.iftm.os.model.Servico;
import br.edu.iftm.os.util.Transacao;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;


@Named
@SessionScoped
@Getter
public class ServicoBean extends CrudBean<Servico, ServicoLogic> {

    @Inject
    private ServicoLogic logic;
    
    private Servico servico;

    public ServicoBean() {
        super(Servico.class);
    }
    
    @Override
    public void novo(){
        super.novo();
        this.servico = new Servico();
    }

    @Override
    public void salvar() {
        super.salvar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Servico entidade) {
        super.editar(entidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transacao
    public void deletar(Servico entidade) {
        super.deletar(entidade); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public ServicoLogic getLogic() {
        return this.logic;
    }

    /*
        Conferir - Model - Classee Servico
        Criar Repository - Classe responsavel por salvar no banco de dados
        Criar Logic - Classe responsável por comunicar o Bean com Repository - Regras de nogócio
        Criar o Bean - Classe reponsável por controlar xhtml
        Criar o xhtml - Página que usuário visualizará
    */
    

    
    
    
}
