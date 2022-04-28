package com.sedatbsp.springbootmicroserviceapigateway3.security.jwt;

import com.sedatbsp.springbootmicroserviceapigateway3.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
