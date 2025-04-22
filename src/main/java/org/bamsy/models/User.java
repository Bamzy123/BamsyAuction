package org.bamsy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public abstract class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String role;

    public boolean isAdmin() {
        return "ADMIN".equalsIgnoreCase(this.role);
    }

    public boolean isUser() {
        return "USER".equalsIgnoreCase(this.role);
    }
}
