package com.example.TokenTestProj.DTO.Request;
import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}