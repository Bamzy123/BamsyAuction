package org.bamsy.repositories;

import org.bamsy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByRole(String role);

    Optional<User> findByUserName(String userName);
}
