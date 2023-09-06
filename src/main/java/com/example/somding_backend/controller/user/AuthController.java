package com.example.somding_backend.controller.user;

import com.example.somding_backend.dto.request.user.LoginRequest;
import com.example.somding_backend.dto.response.user.LoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "user Auth 관련 Controller", description = "사용자 로그인/로그아웃 API")
public class AuthController {
    @PostMapping ("/login")
    @Operation(description = "로그인 Controller", summary = "솜딩 로그인 요청합니다.")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.builder()
                .id(loginRequest.getId())
                .pw(loginRequest.getPw())
                .build();
        return new ResponseEntity<>(loginResponse, HttpStatus.OK);
    }

    @PostMapping("/logout")
    @Operation(description = "로그아웃 Controller", summary = "솜딩 로그아웃 요청합니다.")
    public ResponseEntity<Void> logout(HttpServletRequest httpServletRequest){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
