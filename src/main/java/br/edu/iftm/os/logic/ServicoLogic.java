/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.Servico;
import br.edu.iftm.os.repository.ServicoRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jardel
 */
public class ServicoLogic implements CrudLogic<Servico> {
    
    @Inject
    private ServicoRepository repository;

    @Override
    @Transacao
    public Servico salvar(Servico entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.salvar(entidade);
    }

    @Override
    @Transacao
    public void deletar(Servico entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public Servico buscarPorId(Servico entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.buscarPorId(entidade.getId());
    }

    @Override
    public List<Servico> buscar(Servico entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }
    
}
