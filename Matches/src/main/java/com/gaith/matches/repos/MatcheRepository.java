package com.gaith.matches.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.gaith.matches.entities.Typematche;


@RepositoryRestResource(path = "rest")
public interface MatcheRepository extends JpaRepository<Match, Long> {

	List<Match> findByNomMatch(String nomEquipes);
	List<Match> findByNomMatchContains(String nomEquipes);
	@Query("select m from Matchm m where m.nomEquip like %:nom and m.Profit > :Profit")
	List<Match> findByNomCout (@Param("nom") String nom,@Param("Profit") Double Profit);
	
	@Query("select m from Match m where m.typematche = ?1")
	List<Match> findByDomaine (Typematche typematch);
	
	List<Match> findByTypematcheIdType(Long id);
	
	List<Match> findByOrderByNomMatchAsc();
	
	@Query("select p from Match p order by p.nomMatch ASC, p.Cout DESC")
	List<Match> trierMatchsNomsCout();
}