package accounts;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class UserProfile implements Serializable {
    private static final long serialVersionUID = 666L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login", unique = true, updatable = false)
    private String login;

    @Column(name = "password")
    private String password;

    public UserProfile() {
    }

    public UserProfile(String login, String password) {
        this.setId(-1L);
        this.setLogin(login);
        this.setPassword(password);
    }

    public UserProfile(String login) {
        this.setId(-1L);
        this.setLogin(login);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
