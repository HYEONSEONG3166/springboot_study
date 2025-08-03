package com.example.practice_signup.service;

import org.springframework.stereotype.Service;

import com.example.practice_signup.entity.Member;
import com.example.practice_signup.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
        
        memberRepository.save(member);
        return "Member registered successfully: " + id;
    }
    
}
