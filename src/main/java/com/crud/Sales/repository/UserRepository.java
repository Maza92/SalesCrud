package com.crud.Sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.Sales.model.user.User;
import com.crud.Sales.model.user.UserDTO;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  @Transactional(readOnly = true)
  @Query(nativeQuery = true)
  UserDTO findUserByEmail(String email);
 
}
