package com.crud.Sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Sales.model.user.User;
import com.crud.Sales.model.user.UserDTO;
import com.crud.Sales.model.user.UserLoginDTO;
import com.crud.Sales.service.UserService;

@RestController
public class UserController {
  
  @Autowired
  UserService userService;

  @PostMapping("/api/register")
  public ResponseEntity<User> SingUp(@RequestBody User user) {
    if (!userService.RegisterUser(user)) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @PostMapping("/api/login")
  public ResponseEntity<UserDTO> SingIn(@RequestBody UserLoginDTO userLogin) {
    UserDTO userDto = userService.LoginUser(userLogin.getEmail(), userLogin.getPassword());

    if (userDto == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    return ResponseEntity.ok(userDto);
  }
  
}
