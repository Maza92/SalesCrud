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
public class Product {
   private int id;
   private String name;
   private String description;
   private double price;
   private int stock;
   private LocalDate date;
   private String state;
   private int idCategory;
   private int idSupplier;
}
