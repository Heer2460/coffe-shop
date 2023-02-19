package com.coffeshop.dto;

import lombok.Data;
import lombok.NonNull;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Data
public class LoginDTO {

    @NonNull
    private Long id;
    @NonNull
    private String email;
    @NonNull
    private String password;
}
