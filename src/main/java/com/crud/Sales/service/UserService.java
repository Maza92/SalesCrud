package com.crud.Sales.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.Sales.model.User;
import com.crud.Sales.model.UserDTO;
import com.crud.Sales.repository.UserRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;

@Service
public class UserService {
  UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean RegisterUser(User user) {
    final String pass = user.getPassword();

    user.setPassword(EncodePassword(pass));

    return userRepository.save(user) != null;
  }

  @Transactional
  public UserDTO LoginUser(String email, String password) {

    UserDTO dto = userRepository.findUserByEmail(email);

    System.out.println(dto.getUserName());
    
    BCrypt.Result result = BCrypt
      .verifyer()
      .verify(password.toCharArray(), dto.getPassword());

    if (!result.verified == true) {
      return null;
    }

    return dto;
  }

  private String EncodePassword(String pass) {
    return BCrypt
      .withDefaults()
      .hashToString(4, pass.toCharArray());
  }
}
