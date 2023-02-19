package com.coffeshop.mapper;

import com.coffeshop.dto.CoffeShopDto;
import com.coffeshop.model.CoffeShop;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Component
public class CoffeShopMapper {

    public CoffeShop CoffeShopDtoToEntityMapper(CoffeShopDto coffeShopDto){

        CoffeShop shop = new CoffeShop();
        shop.setShopLocation(coffeShopDto.getShopLocation());
        shop.setCoffeName(coffeShopDto.getCoffeName());
        shop.setPrice(coffeShopDto.getPrice());
        shop.setQunatity(coffeShopDto.getQunatity());
        shop.setCreatedOn(ZonedDateTime.now());
        shop.setUpdatedOn(ZonedDateTime.now());
        return shop;
    }
    public CoffeShopDto entityToCoffeShopDtoMapper(CoffeShop coffeShopDto){

        CoffeShopDto shop = new CoffeShopDto();
        shop.setShopLocation(coffeShopDto.getShopLocation());
        shop.setCoffeName(coffeShopDto.getCoffeName());
        shop.setPrice(coffeShopDto.getPrice());
        shop.setQunatity(coffeShopDto.getQunatity());
        return shop;
    }

    public List<CoffeShopDto> entityListToCoffeShopDtoMapper(List<CoffeShop> coffeShopDtoList){
        List<CoffeShopDto> dtoList = new ArrayList<>();
        for ( CoffeShop coffeShopDto:coffeShopDtoList) {
            CoffeShopDto shop = new CoffeShopDto();
            shop.setShopLocation(coffeShopDto.getShopLocation());
            shop.setCoffeName(coffeShopDto.getCoffeName());
            shop.setPrice(coffeShopDto.getPrice());
            shop.setQunatity(coffeShopDto.getQunatity());
            dtoList.add(shop);
        }
        return dtoList;
    }
}
