package com.coffeshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.ZonedDateTime;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    @NonNull
    private String userName;
    @NonNull
    private String mobileNumber;
    @NonNull
    private String email;
    @NonNull
    private String address;
    @NonNull
    private String password;
    private ZonedDateTime createdOn;
    private ZonedDateTime updatedOn;
}
