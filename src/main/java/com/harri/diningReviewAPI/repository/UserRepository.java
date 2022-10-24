package com.harri.diningReviewAPI.repository;

import com.harri.diningReviewAPI.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByDisplayName(String displayName);
}
