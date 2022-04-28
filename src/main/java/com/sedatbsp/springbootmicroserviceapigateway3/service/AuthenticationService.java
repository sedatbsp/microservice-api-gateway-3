package com.sedatbsp.springbootmicroserviceapigateway3.service;

import com.sedatbsp.springbootmicroserviceapigateway3.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
