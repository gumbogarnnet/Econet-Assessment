/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.econet.ggumbo.controller;

import com.econet.ggumbo.entity.Area;
import com.econet.ggumbo.service.AreaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */

@RestController
@RequestMapping("/api")
public class AreaController {

    @Autowired
    AreaService areaService;

    @PostMapping("/area")
    public ResponseEntity<Area> saveArea(@RequestBody Area area){
        return new ResponseEntity<Area>(areaService.save(area),HttpStatus.CREATED);
    }
    @GetMapping("/getallarea")
    public List<Area> getAll(){
        return areaService.getAll();
    }
    @GetMapping("/getareabyid/{id}")
    public ResponseEntity<Area> getAreaById(@PathVariable("id") Long areaId){
        return new ResponseEntity<>(areaService.getAreaById(areaId), HttpStatus.OK);
    }

}
