package com.authenticator.jwt.service;

import com.authenticator.jwt.dto.request.UserRequest;
import com.authenticator.jwt.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();


}
