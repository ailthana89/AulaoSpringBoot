package com.devsuperior.myfirtsproject;

import com.devsuperior.myfirtsproject.entities.Category;
import com.devsuperior.myfirtsproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirtsprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;



	public static void main(String[] args) {
		SpringApplication.run(MyfirtsprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}
}
