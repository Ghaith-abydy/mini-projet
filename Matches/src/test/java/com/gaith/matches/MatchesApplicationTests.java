package com.gaith.matches;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.gaith.matches.entities.Matche;
import com.gaith.matches.repos.MatcheRepository;

@SpringBootTest
class MatchesApplicationTests {

	@Autowired
	private MatcheRepository matcheRepository;
	@Test
	public void testCreateMatche() {
	Matche prod = new Matche("PC Dell",2200.500,new Date());
	matcheRepository.save(prod);
	}
	
	@Test
	public void testFindMatche()
	{
	Matche p = matcheRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateMatche()
	{
	Match m = matcheRepository.findById(1L).get();
	m.setProfit(1000.0);
	matcheRepository.save(m);
	}
	@Test
	public void testDeleteMatche()
	{
	matcheRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousMatches()
	{
	List<Matche> mts = MatcheRepository.findAll();
	for (Matche m : mts)
	{
	System.out.println(p);
	}
	}

}
