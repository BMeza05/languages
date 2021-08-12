package com.brian.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

//importing from packages
import com.brian.languages.models.Language;
import com.brian.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	  private final LanguageRepository languageRepository;
	    
	    public LanguageService(LanguageRepository languageRepository) {
	        this.languageRepository = languageRepository;
	    }
	    
//------ returns all the languages
	    public List<Language> allLanguages() {
	        return languageRepository.findAll();
	    }
	    
//------- creates a language
	    public Language createLanguage(Language l) {
	        return languageRepository.save(l);
	    }
	    	    
//----------- retrieves a language
	    public Language findLanguage(Long id) {
	        Optional<Language> optionalLanguage = languageRepository.findById(id);
	        if(optionalLanguage.isPresent()) {
	            return optionalLanguage.get();
	        } else {
	            return null;
	        }
	    }
	    
//-------DELETE
		
		public void deleteLanguage(Long id) {
			languageRepository.deleteById(id);
}
	    
///-------------UPDATE
		public Language updateLanguage(Language l) {
			return languageRepository.save(l);
			}
}
