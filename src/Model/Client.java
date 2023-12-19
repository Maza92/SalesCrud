/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import lombok.Data;

/**
 *
 * @author Luis
 */
@Data
public class Client {
    
    private int id;
    private String name;
    private String lasName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
    private int saleId;
}
