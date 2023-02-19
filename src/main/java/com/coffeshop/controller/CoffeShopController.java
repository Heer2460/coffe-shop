package com.coffeshop.controller;

import com.coffeshop.dto.CoffeShopDto;
import com.coffeshop.helper.ActionResult;
import com.coffeshop.service.CoffeShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@RestController
@RequestMapping("api/shop")
public class CoffeShopController {
    @Autowired
    CoffeShopService coffeShopService;

    @PostMapping("/")
    public ActionResult<CoffeShopDto> createCoffeShop(@RequestBody @Validated CoffeShopDto coffeShopDto) {
        CoffeShopDto shopDto = null;
        shopDto = coffeShopService.createCoffeShop(coffeShopDto);
        return ActionResult.success(shopDto);
    }
    @GetMapping("/{id}")
    public ActionResult<CoffeShopDto> getShopDetailById(@PathVariable("id") Long id) {
        CoffeShopDto shopDto = null;
        shopDto = coffeShopService.getShopDetailById(id);
        return ActionResult.success(shopDto);
    }
    @GetMapping("/")
    public ActionResult<List<CoffeShopDto>> getAllCoffeShops() {
        List<CoffeShopDto> shopDto = null;
        shopDto = coffeShopService.getAllCoffeShops();
        return ActionResult.success(shopDto);
    }

}
