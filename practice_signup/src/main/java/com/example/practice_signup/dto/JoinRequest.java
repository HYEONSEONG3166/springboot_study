package com.example.practice_signup.dto;

import lombok.Data;

@Data
public class JoinRequest {
    
    private String id;
    private String name;
    private String phoneNumber;

    // You can add validation annotations here if needed, e.g., @NotBlank, @Size, etc.
}
