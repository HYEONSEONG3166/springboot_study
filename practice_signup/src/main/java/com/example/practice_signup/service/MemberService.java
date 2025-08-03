package com.example.practice_signup.service;

import com.example.practice_signup.dto.JoinRequest;

public interface MemberService {
    
    String join(JoinRequest joinRequest);
}
