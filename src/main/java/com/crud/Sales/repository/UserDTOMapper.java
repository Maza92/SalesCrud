package com.crud.Sales.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.crud.Sales.model.UserDTO;

public class UserDTOMapper implements RowMapper<UserDTO> {

    @Override
    public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UserDTO(
            rs.getString("userName"),
            rs.getTimestamp("dateEntri"),
            rs.getTimestamp("dateExit"),
            rs.getString("password")
        );
    }
}
