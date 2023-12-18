/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author Luis
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private LocalDate entriDate;
    private LocalDate exitDate;
}
