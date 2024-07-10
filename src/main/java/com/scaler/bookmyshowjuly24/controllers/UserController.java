package com.scaler.bookmyshowjuly24.controllers;

import com.scaler.bookmyshowjuly24.dtos.ResponseStatus;
import com.scaler.bookmyshowjuly24.dtos.SignUpRequestDto;
import com.scaler.bookmyshowjuly24.dtos.SignUpResponseDto;
import com.scaler.bookmyshowjuly24.models.User;
import com.scaler.bookmyshowjuly24.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            User user = userService.signUp(
                    requestDto.getName(),
                    requestDto.getEmail(),
                    requestDto.getPassword()
            );

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setUser(user);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
