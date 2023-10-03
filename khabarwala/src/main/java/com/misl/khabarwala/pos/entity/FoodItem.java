package com.misl.khabarwala.pos.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem extends BaseEntity{

    private String name;
    private String code;
    private Double stock;
    private String unit;
    Category category;
}
