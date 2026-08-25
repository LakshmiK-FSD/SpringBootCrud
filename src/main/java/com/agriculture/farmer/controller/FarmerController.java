package com.agriculture.farmer.controller;
import com.agriculture.farmer.model.Farmers;
import com.agriculture.farmer.service.FarmerService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmers")
public class FarmerController {
    @Autowired
    private FarmerService farmServ;
    @GetMapping
    public List<Farmers> home(){
        return farmServ.farmDetail();
    }
    @GetMapping("/{id}")
    public Farmers search(@PathVariable int id){
        return farmServ.search(id);
    }
    @PostMapping
    public String addObj(@RequestBody Farmers getF){
        return farmServ.addObj(getF);
    }
    @DeleteMapping("/{delId}")
    public String delletobj(@PathVariable("delId") int id){
        return farmServ.delletObj(id);
    }
    @PutMapping("/update/{id}")
    public String upDate( @PathVariable("id") int id,@RequestBody Farmers farmUD){
        return farmServ.upDate(id,farmUD);
    }
    @PutMapping("/update")
    public String upDat(@RequestBody Farmers upFarm){
        return farmServ.upDat(upFarm);
    }
}