package br.com.AppRH2.AppRH2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.com.AppRH2.AppRH2.models.Candidato;
import br.com.AppRH2.AppRH2.models.Vaga;


public interface CandidatoRepository extends CrudRepository<Candidato,String> {
	Iterable<Candidato> findByVaga (Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
	

}
