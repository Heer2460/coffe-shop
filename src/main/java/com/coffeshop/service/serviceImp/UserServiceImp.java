package com.coffeshop.service.serviceImp;

import com.coffeshop.dto.UserDto;
import com.coffeshop.exception.KnownException;
import com.coffeshop.exception.KnownExceptionMsgEnum;
import com.coffeshop.mapper.UserMapper;
import com.coffeshop.model.User;
import com.coffeshop.repository.UserRepository;
import com.coffeshop.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Log4j2
@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDto registerUser(UserDto userDto) {
        log.info("saveUser method calling..");
        User user = null;
        if (userRepository.existsById(userDto.getId())){
            throw new KnownException(KnownExceptionMsgEnum.DUPLICATE_EMAIL);
        }
        user = userMapper.UserDtoToEntity(userDto);
        userRepository.save(user);

         return userDto;
    }
    @Override
    public UserDto getUserById(Long id) {
        log.info("getUserById method calling..");

        if (id ==null){
            throw new KnownException(KnownExceptionMsgEnum.INVALID_ID);
        }
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()){
            throw new KnownException(KnownExceptionMsgEnum.USER_NOT_FOUND);
        }
        UserDto userDto = userMapper.EntityUserDto(user.get());
        return userDto;
    }
}
