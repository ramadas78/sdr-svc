package com.sed.pms.sdr.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Getter
@Setter
@Table("suplier_info")
public class SuplierInfo {

    @PrimaryKey("suplierId")
    private int suplierId;
    @Column("suplierName")
    private String suplierName;
}
