package com.misl.khabarwala.pos.entity;

import com.misl.khabarwala.pos.domain.enm.MeasurementUnits;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RawGoodsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private Double stock;
    @Enumerated(EnumType.STRING)
    private MeasurementUnits unit;

}
