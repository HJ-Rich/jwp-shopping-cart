package woowacourse.auth.ui.dto;

import javax.validation.constraints.NotBlank;

public class TokenRequest {
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    public TokenRequest() {
    }

    public TokenRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
