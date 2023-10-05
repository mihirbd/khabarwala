package com.misl.khabarwala.pos.domain;

import com.misl.khabarwala.pos.domain.enm.MeasurementUnits;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RawGoods {

    private Long id;
    private String name;
    private String code;
    private Double stock;
    @Enumerated(EnumType.STRING)
    private MeasurementUnits unit;

}
