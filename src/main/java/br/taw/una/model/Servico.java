package br.taw.una.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cod_servico;

	private Double nome_servico;

	public Long getCod_servico() {
		return cod_servico;
	}

	public void setCod_servico(Long cod_servico) {
		this.cod_servico = cod_servico;
	}

	public Double getNome_servico() {
		return nome_servico;
	}

	public void setNome_servico(Double nome_servico) {
		this.nome_servico = nome_servico;
	}

	@Override
	public String toString() {
		return "Servico [cod_servico=" + cod_servico + ", nome_servico=" + nome_servico + "]";
	}

}
