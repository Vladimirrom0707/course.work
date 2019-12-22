package com.brain.course.work.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ClientRepository {

    User findByEmail(String username);
}
