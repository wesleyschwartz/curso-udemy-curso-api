package br.com.compass.config;

import br.com.compass.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import br.com.compass.repositories.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public void startDB() {
        User u1 = new User(null,"Wesley","wesley@email.com","12345");
        User u2 = new User(null,"Luis","luis@email.com","12345");

        userRepository.save(u1);
        userRepository.save(u2);
    }
}
