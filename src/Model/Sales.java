
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Sales {
    private int id;
    private LocalDate date;
    private ArrayList<Product> soldProducts;
    private double unitPrice;
    private double totalSale;
    private int idClient;
    private Payment paymentMethod;
    private String shippingAddress;
    private String state;
}
