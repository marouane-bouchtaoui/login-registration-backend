package com.bouchtaouimarouane.registerlogin.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LoginMessage {
    private String message;
    private Boolean status;
}
