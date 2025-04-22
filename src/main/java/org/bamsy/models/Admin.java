package org.bamsy.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class Admin extends User{
    public Admin(String userId, String userName, String email, String password) {
        super(userId, userName, email, password);
    }
}
