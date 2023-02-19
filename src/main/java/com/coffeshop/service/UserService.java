package com.coffeshop.service;


import com.coffeshop.dto.LoginDTO;
import com.coffeshop.dto.UserDto;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
public interface UserService {

    UserDto registerUser(UserDto userDto);
    UserDto getUserById(Long id);

}
