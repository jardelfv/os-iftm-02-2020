
package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.StatusLogic;
import br.edu.iftm.os.model.Status;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;

/**
 *
 * @author jardel
 */
@Named
@SessionScoped
@Getter
public class StatusBean extends CrudBean<Status, StatusLogic> {
    
    @Inject
    private StatusLogic logic;
    
    private Status statusEntidade;
    
    public StatusBean() {
        super(Status.class);
    }


}
