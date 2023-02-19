package com.coffeshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeShopDto {
    @NonNull
    private String coffeName;
    @NonNull
    private String shopLocation;
    @NonNull
    private double price;
    @NonNull
    private String qunatity;
}
