package com.brian.languages.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brian.languages.models.Language;
import com.brian.languages.services.LanguageService;

@Controller
public class LanguagesController {
    private final LanguageService languageService;
    
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    
    @RequestMapping("/languages")
    public String index(Model model) {
        List<Language> books = languageService.allLanguages();
        model.addAttribute("languages", language);
        return "/languages/index.jsp";
    }
    
    @RequestMapping("/languages/new")
    public String newBook(@ModelAttribute("language") Language language) {
        return "/languages/new.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
	    languageService.deleteLanguage(id);
	    return "redirect:/books";
	}
    
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/language/new.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages"; }
        }
    
    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
  
    }
}