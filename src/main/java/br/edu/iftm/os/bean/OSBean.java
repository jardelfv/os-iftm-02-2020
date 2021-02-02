package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.OSLogic;
import br.edu.iftm.os.model.OS;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;


@Named
@SessionScoped
@Getter
public class OSBean extends CrudBean<OS, OSLogic> {

    @Inject
    private OSLogic logic;
    
    private OS osEntidade;

    public OSBean() {
        super(OS.class);
    }
    
}
