package br.com.AppRH2.AppRH2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.AppRH2.AppRH2.models.Funcionario;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	Funcionario findById(long id);
	
	List<Funcionario>findByNome(String nome);
	
	//Para Buscar
	@Query(value = "SELECT * FROM funcionario c", nativeQuery = true)
	List<Funcionario> findAll();
	
	// Query para a busca
	//@Query(value = "select u from funcionario u where u.funcnome like %?1%")
	//List<Funcionario>findByNomes(String nome);
		
}
