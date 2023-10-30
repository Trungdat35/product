package com.example.product.models;

import com.example.product.models.Products;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "properties")
@Getter
@Setter
public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id")
    private int propertyID;
    @Column(name = "property_name")
    private String propertyName;
    @Column(name = "property_sort")
    private int propertySort;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id",foreignKey = @ForeignKey(name = "fk_pp_pd"))
    private Products pd;
    @OneToMany(mappedBy = "pp",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<PropertyDetails> propertyDetailsSet;
}
