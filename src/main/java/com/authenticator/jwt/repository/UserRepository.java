package com.authenticator.jwt.repository;

import com.authenticator.jwt.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
    UserInfo findFirstById(Long id);
}
