
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Sale {
    private int id;
    private LocalDate date;
    private double unitPrice;
    private double totalSale;
    private int idClient;
    private int idpaymentMethod;
    private String shippingAddress;
    private String state;
}
