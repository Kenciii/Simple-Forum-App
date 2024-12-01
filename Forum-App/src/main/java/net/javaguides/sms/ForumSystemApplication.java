package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.sms.repository.ForumRepository;

@SpringBootApplication
public class ForumSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ForumSystemApplication.class, args);
	}

	@Autowired
	private ForumRepository forumRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		
	}

}
