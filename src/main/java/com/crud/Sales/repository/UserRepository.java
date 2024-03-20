package com.crud.Sales.repository;


// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.jdbc.core.RowMapper;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.Sales.model.User;
import com.crud.Sales.model.UserDTO;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  @Transactional(readOnly = true)
  @Query(nativeQuery = true)
  UserDTO findUserByEmail(String email);
 
}
