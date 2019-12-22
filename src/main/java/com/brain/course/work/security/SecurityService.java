package com.brain.course.work.security;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
