package com.example.practice_signup.member;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.practice_signup.entity.Member;
import com.example.practice_signup.repository.MemberRepository;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void crudTest() {
        Member member = Member.builder()
                .id("testUser")
                .name("Test User")
                .phoneNumber("123-456-7890")
                .build();

        // create test
        Member savedMember = memberRepository.save(member); // 저장 후 반환값 사용

        // get test
        Member foundMember = memberRepository.findById(savedMember.getIndex())
                .orElseThrow(() -> new RuntimeException("Member not found"));

        assertNotNull(foundMember);
        assertEquals("testUser", foundMember.getId());
    }
}
