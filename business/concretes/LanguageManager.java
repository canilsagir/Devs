package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService{

		private LanguageRepository languageRepository;
		
	public LanguageManager(LanguageRepository languageRepository) {
			
			this.languageRepository = languageRepository;
		}

	@Override
	public void add(Language language) {
		if(language.equals(null)) {
			System.out.println("Mevcut Proglamlama dilini Belirtin");
		}else {
			languageRepository.add(language);
			System.out.println(language + " Başarıyla giriş yapıldı.");
		}
		
	}

	@Override
	public void update(int id, Language language) {
		if(language.equals(language)) {
			System.out.println("Bu Program dili mevcut, başka bir program dili girin.");
		}else {
				languageRepository.update(id, language);
				System.out.println(language + "Basarıyla Bilgiler Güncellendi");
			
		}
		
	}

	@Override
	public void delete(int id) {
		String LanguageName = languageRepository.getById(id).getName();
		languageRepository.delete(id);
		System.out.println(LanguageName + " Kayıt Basarı ile SİLİNDİ.");
		
		
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) throws Exception {
		Language language = languageRepository.getById(id);
		if(language==null) {
			System.out.println("Sisteme kayıtlı proglamlama dili yok");
		}else {
			System.out.println(language.getName()+ "Sistemdeki dil getirildi");
		}
		return language;
	}

}
