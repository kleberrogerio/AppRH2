package br.com.AppRH2.AppRH2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.com.AppRH2.AppRH2.models.Vaga;


public interface VagaRepository extends CrudRepository <Vaga,String>{
	Vaga findByCodigo(long codigo);
	List<Vaga> finfByNome(String nome);

}
