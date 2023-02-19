package com.coffeshop.service.serviceImp;


import com.coffeshop.dto.CoffeShopDto;
import com.coffeshop.exception.DataValidationException;
import com.coffeshop.exception.KnownException;
import com.coffeshop.exception.KnownExceptionMsgEnum;
import com.coffeshop.mapper.CoffeShopMapper;
import com.coffeshop.model.CoffeShop;
import com.coffeshop.repository.CoffeShopRepository;
import com.coffeshop.service.CoffeShopService;
import com.coffeshop.utility.AppUtility;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Arif Heer
 * @date 2023/02/18
 */
@Log4j2
@Service
public class CoffeShopServiceImp implements CoffeShopService {
    @Autowired
    CoffeShopRepository coffeShopRepository;

    @Autowired
    CoffeShopMapper coffeShopMapper;
    @Override
    public CoffeShopDto createCoffeShop(CoffeShopDto coffeShopDto) {
        log.info("createCoffeShop method calling..");

        CoffeShop shop =coffeShopMapper.CoffeShopDtoToEntityMapper(coffeShopDto);
        coffeShopRepository.save(shop);
        return coffeShopDto;
    }

    @Override
    public CoffeShopDto getShopDetailById(Long id) {
        log.info("getShopDetailById method calling..");

        CoffeShopDto shopDto = null;
        if (id == null){
            throw new KnownException(KnownExceptionMsgEnum.INVALID_ID);
        }
        Optional<CoffeShop> coffeShop = coffeShopRepository.findById(id);
       if (!coffeShop.isPresent()){
           throw new KnownException(KnownExceptionMsgEnum.USER_NOT_FOUND);
       }
           shopDto= coffeShopMapper.entityToCoffeShopDtoMapper(coffeShop.get());

        return shopDto;
    }

    @Override
    public List<CoffeShopDto> getAllCoffeShops() {
        log.info("getAllCoffeShops method calling..");

        List<CoffeShopDto> dtoList = null;
        List<CoffeShop> shopList = coffeShopRepository.findAll();

        if (shopList == null)
            throw new KnownException(KnownExceptionMsgEnum.API_GROUP_NOT_EMPTY);

        dtoList = coffeShopMapper.entityListToCoffeShopDtoMapper(shopList);
        return dtoList;
    }
}
