package com.frankmoley.security.app.auth;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LandonUserDetailsService implements UserDetailsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LandonUserDetailsService.class);

    private UserRepository userRepository;

    public LandonUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);

        if (user.isEmpty()) {
            String message = "Cannot find user for username: " + username;
            LOGGER.warn(message);
            throw new UsernameNotFoundException(message);
        }

        return new LandonUserPrincipal(user.get());
    }
}
