package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
@Repository
public class inMemoryLanguageRepository implements LanguageRepository {
		
	List<Language> languages;
	
	public inMemoryLanguageRepository() {
			languages = new ArrayList<Language>();
			languages.add(new Language (1,"Java"));
			languages.add(new Language (2,"C#"));
			languages.add(new Language (3,"Phyton"));

			
		
	}
	

	@Override
	public void add(Language language) {
				languages.add(language);
				
	}

	@Override
	public void update(int id, Language language) {
			languages.set(id, language);
			
		
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getById(int id) {
		
		Language returnLanguage = null;
		for(Language language: languages) {
			if(language.getId()==id)
			{	returnLanguage = language;
			}
		}
		return returnLanguage;
	}
}
