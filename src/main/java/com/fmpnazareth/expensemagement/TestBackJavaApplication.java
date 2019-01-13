package com.fmpnazareth.expensemagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fmpnazareth.expensemagement.entity.User;
import com.fmpnazareth.expensemagement.enums.ProfileEnum;
import com.fmpnazareth.expensemagement.repository.UserRepository;

@SpringBootApplication
public class TestBackJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBackJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};

	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User admin = new User();
		admin.setCodUser("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		admin.setProfile(ProfileEnum.SYSTEM);

		User find = userRepository.findByCodUser("admin");
		if (find == null) {
			userRepository.save(admin);
		}
	}
}
