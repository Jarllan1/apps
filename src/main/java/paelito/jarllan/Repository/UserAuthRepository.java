package paelito.jarllan.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth,Long> {
    Optional<UserAuth> findByEmail(String email);
    Optional<UserAuth> findByUserName(String userName);
    Optional<UserAuth> findByUsernameOrEmail(String email, String username);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username); 

}
