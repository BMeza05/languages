package com.brian.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brian.languages.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language>findAll();
	
	  List<Language> findByLanguageContaining(String search);
	    // this method counts how many titles contain a certain string
	    Long countByCreatorContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByCreatorStartingWith(String search);

}
