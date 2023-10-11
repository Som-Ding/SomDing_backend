package com.example.somding_backend.controller.auth;

import com.example.somding_backend.model.request.auth.LoginReq;
import com.example.somding_backend.model.response.auth.LoginRes;
import com.example.somding_backend.service.auth.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@Tag(name = "user Auth 관련 Controller", description = "사용자 로그인/로그아웃 API")
public class AuthController {
    private final AuthService authService;
    @PostMapping ("/login")
    @Operation(description = "로그인 Controller", summary = "솜딩 로그인 요청합니다.")
    public ResponseEntity<LoginRes> login(@RequestBody LoginReq loginReq){
        LoginRes loginResponse = authService.doLogin(loginReq);
        return new ResponseEntity<>(loginResponse, HttpStatus.OK);
    }

    @PostMapping("/logout")
    @Operation(description = "로그아웃 Controller", summary = "솜딩 로그아웃 요청합니다.")
    public ResponseEntity<Void> logout(HttpServletRequest httpServletRequest){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
