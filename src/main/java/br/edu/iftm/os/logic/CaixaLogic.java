/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.Caixa;
import br.edu.iftm.os.repository.CaixaRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jardel
 */
public class CaixaLogic implements CrudLogic<Caixa> {
    
    @Inject
    private CaixaRepository repository;

    @Override
    @Transacao
    public Caixa salvar(Caixa entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.salvar(entidade);
    }

    @Override
    @Transacao
    public void deletar(Caixa entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public Caixa buscarPorId(Caixa entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.buscarPorId(entidade.getId());
    }

    @Override
    public List<Caixa> buscar(Caixa entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }
    
}
