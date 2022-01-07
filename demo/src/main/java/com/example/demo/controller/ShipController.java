package com.example.demo.controller;


import com.example.demo.entity.Ship;
import com.example.demo.service.IShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rsy
 * @since 2021-08-12
 */
@RestController
@RequestMapping("/ship")
public class ShipController {
@Autowired
private IShipService shipService;

@GetMapping("/sel")
public List<Ship> sel(){
    return shipService.selectAll();
}
}

