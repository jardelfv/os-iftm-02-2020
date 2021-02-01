/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.Status;
import br.edu.iftm.os.repository.StatusRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jardel
 */
public class StatusLogic implements CrudLogic<Status> {
    
    @Inject
    private StatusRepository repository;
    

    @Override
    @Transacao
    public void deletar(Status entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public Status buscarPorId(Status entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.buscarPorId(entidade.getId());
    }

    @Override
    public List<Status> buscar(Status entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }

    @Override
    @Transacao
    public Status salvar(Status entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.salvar(entidade);
    }
    
}
