package com.misl.khabarwala.pos.entity.invoice;

import com.misl.khabarwala.pos.entity.PurchaseRawGoodsEntity;
import com.misl.khabarwala.pos.entity.SupplierEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RawGoodsPurchaseInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceNo;
    private Date date;
    @OneToOne
    private SupplierEntity supplier;
    private String note;
    private String purchaser;
    private String createdBy;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<PurchaseRawGoodsEntity> purchaseRawGoods;

}
