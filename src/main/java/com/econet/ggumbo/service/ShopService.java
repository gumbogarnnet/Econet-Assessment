/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.service;

import com.econet.ggumbo.entity.Shop;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ShopService {
    public List<Shop> getAll();
    public Shop getShopById(Long id);
    public Shop save(Shop shop);
    public List<Shop> getShopByAreaName(String areaName);
}
