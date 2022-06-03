package woowacourse.shoppingcart.domain;

import java.util.Objects;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Customer {
    private final Long id;
    private final String email;
    private final String name;
    private final String password;

    public Customer(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public Customer(String email, String name, String password) {
        this(null, email, name, password);
    }

    public boolean validatePassword(String inputPassword, PasswordEncoder passwordEncoder) {
        return passwordEncoder.matches(inputPassword, this.password);
    }

    public Customer changeName(String name) {
        return new Customer(this.id, this.email, name, this.password);
    }

    public Customer changePassword(String password) {
        return new Customer(this.id, this.email, this.name, password);
    }

    public boolean isNew() {
        return Objects.isNull(this.id);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
