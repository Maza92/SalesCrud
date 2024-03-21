package com.crud.Sales.model.user;


import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Component
@NamedNativeQuery(name = "User.findUserByEmail",
                  query = "SELECT u.user_Name AS userName, u.entri_Date AS dateEntri, u.exit_Date AS dateExit, u.user_Password AS password FROM user_admin AS u WHERE u.user_Email = ?1",
                  resultSetMapping = "Mapping.UserDTO")
@SqlResultSetMapping(name = "Mapping.UserDTO",
                     classes = @ConstructorResult(targetClass = UserDTO.class,
                        columns = {
                          @ColumnResult(name = "userName"),
                          @ColumnResult(name = "dateEntri"),
                          @ColumnResult(name = "dateExit"),
                          @ColumnResult(name = "password")
                        }))
@Entity
@Table(name = "user_admin")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_User")
  private Long id;

  @Column(name = "user_Name")
  private String name;

  @Column(name = "user_Password")
  private String password;

  @Column(name = "user_Email")
  private String email;
  
  @Column(name = "entri_Date")
  private Timestamp dateEntri;

  @Column(name = "exit_Date")
  private Timestamp dateExit;
}
