package com.crud.Sales.model.user;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class UserDTO {

  public UserDTO(String userName, 
      Timestamp dateEntri, Timestamp dateExit, String password) {
    this.userName = userName;
    this.dateEntri = dateEntri;
    this.dateExit = dateExit;
    this.password = password;
    
  }
  private String userName;
  private Timestamp dateEntri;
  private Timestamp dateExit;

  @JsonIgnore
  private String password;
}
