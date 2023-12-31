package com.misl.khabarwala.pos.entity.invoice;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FinishFoodsPurchaseInvoice {

    @Id
    private Long id;
    private String code;
    private Date purchaseDate;
    private Date expiryDate;
    private Double quantity;
    private String unit;

}
