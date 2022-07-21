package br.com.alura.languagesapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
    
    @Autowired
    private LanguagesRepository repository;

    @GetMapping("/languages")
    public List<Language> getLanguages() {
        return repository.findAll();
    }

    @PostMapping("/languages")    
    public Language saveLanguage(@RequestBody Language language) {
        Language languageSaved = repository.save(language);
        return languageSaved;
    }
    
}
