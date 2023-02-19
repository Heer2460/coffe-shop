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
@Table(name = "USER")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "PASSWORD")
    private String password;
}

