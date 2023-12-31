package com.example.somding_backend.model.request.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "로그인 관련 Request")
public class LoginReq {
    @Schema(description = "아이디")
    private String id;
    @Schema(description = "비밀번호")
    private String pw;
}
