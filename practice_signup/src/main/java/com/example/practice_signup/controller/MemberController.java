package com.example.practice_signup.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.practice_signup.dto.JoinRequest;
import com.example.practice_signup.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, User!";
    }

    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest) {
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();

        String result = memberService.join(id, name, phoneNumber);

        if(result.equalsIgnoreCase(result)) {
            return "Member registered successfully: " + id;
        } else {
            return "Registration failed for member: " + id;
        }

    }

}
