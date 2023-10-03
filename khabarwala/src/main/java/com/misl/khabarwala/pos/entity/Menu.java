package com.misl.khabarwala.pos.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private Long id;
    private Date date;
    FoodItem foodItem;
    private Double pricePerUnit;

}
