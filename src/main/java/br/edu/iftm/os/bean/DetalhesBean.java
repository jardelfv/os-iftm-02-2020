package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.DetalhesLogic;
import br.edu.iftm.os.model.Detalhes;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;


@Named
@SessionScoped
@Getter
public class DetalhesBean extends CrudBean<Detalhes, DetalhesLogic> {

    @Inject
    private DetalhesLogic logic;
    
    private Detalhes detalhes;

    public DetalhesBean() {
        super(Detalhes.class);
    }
    
}
