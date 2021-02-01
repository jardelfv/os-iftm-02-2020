package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.CaixaLogic;
import br.edu.iftm.os.model.Caixa;
import br.edu.iftm.os.model.OS;
import br.edu.iftm.os.util.Transacao;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;


@Named
@SessionScoped
@Getter
public class CaixaBean extends CrudBean<Caixa, CaixaLogic> {

    @Inject
    private CaixaLogic logic;
    
    private Caixa caixaEntidade;
    private OS osEntidade;

    public CaixaBean() {
        super(Caixa.class);
    }
    
    public void adicionarOs() {
        this.osEntidade.setCodigoOS(getOsEntidade().getCodigoOS());
        this.osEntidade = new OS();
    }
    
    @Override
    public void novo(){
        super.novo();
        this.caixaEntidade = new Caixa();
    }

    @Override
    public void salvar() {
        super.salvar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Caixa entidade) {
        super.editar(entidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transacao
    public void deletar(Caixa entidade) {
        super.deletar(entidade); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public CaixaLogic getLogic() {
        return this.logic;
    }

    
}
