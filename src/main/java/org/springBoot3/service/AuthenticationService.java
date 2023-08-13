package org.springBoot3.service;

import org.springBoot3.dao.request.SignUpRequest;
import org.springBoot3.dao.request.SigninRequest;
import org.springBoot3.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
