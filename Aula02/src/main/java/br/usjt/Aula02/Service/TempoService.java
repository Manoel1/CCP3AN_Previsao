package br.usjt.Aula02.Service;

import java.util.List;


import br.usjt.Aula02.model.Tempo;
import br.usjt.Aula02.repository.TempoRepository;

public class TempoService {

	private TempoRepository tempoResp;
	
	public void salvar (Tempo tempo) {
		tempoResp.save(tempo);
	}
	public List <Tempo> listarTodos (){
		return tempoResp.findAll();
	}
	
}
