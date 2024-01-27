package com.convenientBook.api.service;

import com.convenientBook.api.domain.User;
import com.convenientBook.api.repository.UserRepository;
import com.convenientBook.api.request.UserCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserCreate userCreate) {
        User user = new User();
        user.setMemberId(userCreate.getMemberId());
        user.setMemberPassword(userCreate.getMemberPassword());
        userRepository.save(user);
    }



}
