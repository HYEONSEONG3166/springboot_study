package com.example.practice_signup.service;

import org.springframework.stereotype.Service;

import com.example.practice_signup.dto.JoinRequest;
import com.example.practice_signup.entity.Member;
import com.example.practice_signup.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();

        memberRepository.save(member);
        return "Member registered successfully: " + joinRequest.getId();
    }

}
