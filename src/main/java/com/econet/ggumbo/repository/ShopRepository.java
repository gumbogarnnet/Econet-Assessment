/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.econet.ggumbo.repository;

import com.econet.ggumbo.entity.Area;
import com.econet.ggumbo.entity.Shop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {

    public List<Shop> findByAreaName(String areaName);
    
}

