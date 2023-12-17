
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Sales {
    private int id;
    private LocalDate date;
    private LocalDateTime hour;
    private ArrayList<Product> soldProducts;
    private double unitPrice;
    private double totalSale;
    private Client client;
    private Payment paymentMethod;
    private String shippingAddress;
    private String state;
}
