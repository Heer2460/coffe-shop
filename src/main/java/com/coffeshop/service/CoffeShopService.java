package com.coffeshop.service;


import com.coffeshop.dto.CoffeShopDto;

import java.util.List;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
public interface CoffeShopService {

    CoffeShopDto createCoffeShop(CoffeShopDto coffeShopDto);

    CoffeShopDto getShopDetailById(Long id);

    List<CoffeShopDto> getAllCoffeShops();

}
