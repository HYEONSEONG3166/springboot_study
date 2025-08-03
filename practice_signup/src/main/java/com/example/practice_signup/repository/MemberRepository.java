package com.example.practice_signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice_signup.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // Additional query methods can be defined here if needed
}
