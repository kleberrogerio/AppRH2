package br.com.AppRH2.AppRH2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.AppRH2.AppRH2.models.Funcionario;

import br.com.AppRH2.AppRH2.models.Dependentes;

public interface DependentesRepository  extends JpaRepository<Dependentes, Long> {
	Iterable<Dependentes> findByFuncionario(Funcionario funcionario);

	// para o método delete por CPF
	Dependentes findBycpf(String cpf);
	
	Dependentes findById(long id);
	List<Dependentes> findBynome(String nome);

	// Query para a busca
	//@Query(value = "select u from Dependentes u where u.funcdepnome like %?1%")
	//List<Dependentes> findByFuncdepnomesdependentes(String funcdepnome);


}
