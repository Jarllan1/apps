package paelito.jarllan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.User;


public interface  UserRepository extends JpaRepository <User, Long>{

}
