package com.coffeshop.mapper;


import com.coffeshop.dto.UserDto;
import com.coffeshop.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Component
public class UserMapper {

    public User UserDtoToEntity(UserDto userDto){
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setMobileNumber(userDto.getMobileNumber());
        user.setAddress(userDto.getAddress());
        user.setPassword(new BCryptPasswordEncoder().encode(userDto.getPassword()));
        user.setCreatedOn(ZonedDateTime.now());
        user.setUpdatedOn(ZonedDateTime.now());

        return user;
    }

    public UserDto EntityUserDto(User userDto){
        UserDto user = new UserDto();
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setCreatedOn(ZonedDateTime.now());
        user.setUpdatedOn(ZonedDateTime.now());
        return user;
    }
}
