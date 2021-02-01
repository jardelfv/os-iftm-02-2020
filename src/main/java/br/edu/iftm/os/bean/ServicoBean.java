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
    public ServicoLogic getLogic() {
        return this.logic;
    }

}
