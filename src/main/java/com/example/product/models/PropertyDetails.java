package com.example.product.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Entity
@Table(name = "property_details")
@Getter
@Setter
public class PropertyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_detail_id")
    private int propertyDetailID;
    @Column(name = "property_detail_code")
    private String propertyDetailCode;
    @Column(name = "property_detail_detail")
    private String propertyDetailDetail;
    @OneToMany(mappedBy = "ppd",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<PDPD> pdpdSet;
    @ManyToOne
    @JoinColumn(name = "property_id",referencedColumnName = "property_id",foreignKey = @ForeignKey(name = "fk_ppd_pp"))
    private Properties pp;
}
