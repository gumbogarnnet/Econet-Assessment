/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.service.Impl;

import com.econet.ggumbo.entity.Shop;
import com.econet.ggumbo.repository.ShopRepository;
import com.econet.ggumbo.service.ShopService;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */

@Slf4j
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopRepository shopRepository;

    @Override
    public List<Shop> getAll() {
        return shopRepository.findAll();
    }
    @Override
    public Shop getShopById(Long id) {
        Optional<Shop> optionalShop=shopRepository.findById(id);
        if(optionalShop.isPresent()){
            return optionalShop.get();
        }
        return null;
    }
    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);

    }
    @Override
    public List<Shop> getShopByAreaName(String areaName) {
        return shopRepository.findByAreaName(areaName);
    }
}
