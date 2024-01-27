package com.convenientBook.api.controller;

import com.convenientBook.api.request.UserCreate;
import com.convenientBook.api.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String doLogin() {
        return "응 로그인";
    }

    @PostMapping("/join")
    public void join(@RequestBody UserCreate userCreate) {
        try {
            userService.createUser(userCreate);
            log.info("응 성공");
        } catch (Exception e) {
            log.error("응 실패");
        }

    }
}
