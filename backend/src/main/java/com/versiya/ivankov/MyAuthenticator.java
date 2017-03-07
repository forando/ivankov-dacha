package com.versiya.ivankov;

import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.Authenticator;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Andreylogoshko on 13.05.2016.
 */
public class MyAuthenticator implements Authenticator {
    @Override
    public User authenticate(HttpServletRequest request) {
        return new User("1", "forando");
    }
}
