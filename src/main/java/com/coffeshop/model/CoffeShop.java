package com.coffeshop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Data
@Entity
@Table(name = "coffe_shop")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = false)
public class CoffeShop extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "coffe_name")
    private String coffeName;
    @Column(name = "price")
    private double price;
    @Column(name = "qunatity")
    private String qunatity;
    @Column(name = "shop_location")
    private String shopLocation;

}
