package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	void add(Language language);
	void update(int id,Language language);
	void delete(int id);
	
	List<Language> getAll();
	Language getById(int id) throws Exception;
	
}
