package com.countries.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//@SpringBootApplication(scanBasePackages= {"com.countries.CRUD.repositories"})

import com.countries.CRUD.entities.Country;
import com.countries.CRUD.repositories.CountryRepository;
/*
@SpringBootApplication 
public class CountriesApplication implements CommandLineRunner { 
	
	@Autowired
	private CountryRepository countryRepo; 
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}
	 @Autowired
	public void run(String... args) throws Exception {
		countryRepo.save(new Country("Earth", "World"));
		countryRepo.save(new Country("China", "Peking"));
		countryRepo.save(new Country("Germany", "Berlin"));
		countryRepo.save(new Country("USA", "Washington DC"));
		countryRepo.save(new Country("Russia", "Moscow"));
		countryRepo.save(new Country("Namibia", "Windhoek"));
		countryRepo.save(new Country("Earth", "World"));
		countryRepo.save(new Country("China", "Peking"));
		countryRepo.save(new Country("Germany", "Berlin"));
		countryRepo.save(new Country("USA", "Washington DC"));
		countryRepo.save(new Country("Russia", "Moscow"));
		countryRepo.save(new Country("Namibia", "Windhoek"));
		List<Country> countries = countryRepo.findAll();
		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}

}
}
*/
@SpringBootApplication
public class CountriesApplication implements CommandLineRunner { 

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("China", "Peking"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("USA", "Washington DC"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("India", "New Delhi"));
		countryRepository.save(new Country("North Korea", "Pyongyang"));
		countryRepository.save(new Country("Kenya", "Nairobi"));
		countryRepository.save(new Country("Canada", "Ottawa"));
		countryRepository.save(new Country("Jamaica", "Kingston"));
		countryRepository.save(new Country("Brazil", "Brasilia"));
		countryRepository.save(new Country("Egypt", "Cairo"));
		countryRepository.save(new Country("Nigeria", "Abuja"));
		countryRepository.save(new Country("Jordan", "Amman"));
		countryRepository.save(new Country("Curacao", "Willemstad"));
		countryRepository.save(new Country("Sao Tome Principe", "Sao Tome"));
	}
}