package paelito.jarllan.Model;



import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"username"}),
    @UniqueConstraint(columnNames = {"email"})
})

public class UserAuth {

    private @Id
    @GeneratedValue Long id;
    String username;
    String email;
    String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name =  "user_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "role id", referencedColumnName = "id"))
        private Set <Role> roles;

        UserAuth(){}

        public Long getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public Set<Role> getRoles() {
            return roles;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setRoles(Set<Role> roles) {
            this.roles = roles;
        }

        
}
