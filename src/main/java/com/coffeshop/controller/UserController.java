package com.coffeshop.controller;


import com.coffeshop.dto.UserDto;
import com.coffeshop.helper.ActionResult;
import com.coffeshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public ActionResult<UserDto> registerUser(@RequestBody @Validated UserDto userDto) {
        UserDto users = null;
        users = userService.registerUser(userDto);
        return ActionResult.success(users);
    }
    @GetMapping("/{id}")
    public ActionResult<UserDto> getUserById(@PathVariable("id") Long id) {
        UserDto users = null;
        users = userService.getUserById(id);
        return ActionResult.success(users);
    }
}
