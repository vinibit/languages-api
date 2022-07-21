package br.com.alura.languagesapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguagesRepository extends MongoRepository<Language, String> {    
}
