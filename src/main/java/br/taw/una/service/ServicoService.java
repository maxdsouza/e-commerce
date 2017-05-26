package br.taw.una.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.taw.una.model.Servico;
import br.taw.una.repository.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	ServicoRepository servicoRepository;
	
	public Servico salvar(Servico servico) {
		return servicoRepository.save(servico);
	}
}
