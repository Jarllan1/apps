package paelito.jarllan.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);

}
