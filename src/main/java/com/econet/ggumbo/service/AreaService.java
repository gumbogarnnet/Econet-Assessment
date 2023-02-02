/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.service;

import com.econet.ggumbo.entity.Area;
import java.util.List;

/**
 *
 * @author admin
 */
public interface AreaService {
    public List<Area> getAll();
    public Area getAreaById(Long id);
    public Area save(Area area);
}
