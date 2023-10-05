package com.misl.khabarwala.pos.domain;


import com.misl.khabarwala.pos.domain.enm.MaterialType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.Accessors;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Supplier {

    private Long id;
    private String name;
    private String organization;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private MaterialType materialType;
}

