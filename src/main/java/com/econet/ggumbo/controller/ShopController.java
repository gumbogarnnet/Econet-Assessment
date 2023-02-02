/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.controller;

import com.econet.ggumbo.entity.Shop;
import com.econet.ggumbo.service.ShopService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api")
public class ShopController {
    @Autowired
    ShopService shopService;

    @PostMapping("/shop")
    public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){
        return new ResponseEntity<Shop>(shopService.save(shop),HttpStatus.CREATED);
    }
    @GetMapping("/shop")
    public List<Shop> getShop(@RequestParam(name ="area",required = false) String areaName){
        if (areaName!=null) return shopService.getShopByAreaName(areaName);
        else return shopService.getAll();
    }
}
