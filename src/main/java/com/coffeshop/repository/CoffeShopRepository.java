package com.coffeshop.repository;

import com.coffeshop.model.CoffeShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeShopRepository extends JpaRepository<CoffeShop,Long> {
}
