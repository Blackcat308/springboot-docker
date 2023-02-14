package org.sbd.t.web;

import lombok.AllArgsConstructor;
import org.sbd.t.entity.User;
import org.sbd.t.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: @see
 * @author: LaoCat
 * @date: 2023/2/14
 */
@RestController
@AllArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @GetMapping("/ping")
    public List<User> user() {
        return userService.user();
    }
}
