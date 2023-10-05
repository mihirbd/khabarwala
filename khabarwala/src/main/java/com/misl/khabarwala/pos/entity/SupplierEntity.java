package com.misl.khabarwala.pos.entity;

import com.misl.khabarwala.pos.domain.enm.MaterialType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.envers.Audited;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Audited
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String organization;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private MaterialType materialType;
}
