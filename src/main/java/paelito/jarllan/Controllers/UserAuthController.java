package paelito.jarllan.Controllers;

import java.util.Collections;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paelito.jarllan.DTO.RegistrationRequest;
import paelito.jarllan.Model.Role;
import paelito.jarllan.Model.UserAuth;
import paelito.jarllan.Repository.RoleRepository;
import paelito.jarllan.Repository.UserAuthRepository;

@RestController
@RequestMapping
public class UserAuthController {

    @Autowired
    UserAuthRepository UserAuthRepository;

    @Autowired
    RoleRepository RoleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity <?> register (@RequestBody RegistrationRequest registrationRequest){

        if(UserAuthRepository.existsByUsername(registrationRequest.getUsername())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        if(UserAuthRepository.existsByEmail(registrationRequest.getEmail())){
            return new ResponseEntity<>("An account is already registered im this email",HttpStatus.BAD_REQUEST);
        }

        UserAuth user = new UserAuth(
            registrationRequest.getUsername(),
            registrationRequest.getEmail()
            passwordEncoder.encode(registrationRequest.getPassword())
        );

        Role role = RoleRepository.findByName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(role));

        UserAuthRepository.save(user);
        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }
}
