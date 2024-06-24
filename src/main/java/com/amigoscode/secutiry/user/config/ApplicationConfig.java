package com.amigoscode.secutiry.user.config;

import com.amigoscode.secutiry.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserRepository userRepository;

    @Bean
    public UserDetailsService  userDetailsService(){
        return username -> userRepository.findByEmail(username)
                .orElseThrow(()-> new  UsernameNotFoundException("Usuário não encontrado"));
    }

}
