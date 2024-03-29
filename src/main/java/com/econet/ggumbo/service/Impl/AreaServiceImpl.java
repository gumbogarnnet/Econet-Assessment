/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.service.Impl;

import com.econet.ggumbo.entity.Area;
import com.econet.ggumbo.repository.AreaRepository;
import com.econet.ggumbo.service.AreaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaRepository areaRepository;

    @Override
    public List<Area> getAll() {
        return areaRepository.findAll();
    }
    @Override
    public Area getAreaById(Long id) {
        Optional<Area> optionalArea=areaRepository.findById(id);
        if(optionalArea.isPresent()){
            return optionalArea.get();
        }
        return null;
    }
    @Override
    public Area save(Area area) {
        return areaRepository.save(area);

    }
}
