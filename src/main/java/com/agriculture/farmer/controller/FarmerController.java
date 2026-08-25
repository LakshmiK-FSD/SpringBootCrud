package com.agriculture.farmer.controller;
import com.agriculture.farmer.model.Farmers;
import com.agriculture.farmer.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FarmerController {
    @Autowired
    private FarmerService farmServ;
    @GetMapping("/")
    public List<Farmers> home(){
        return farmServ.farmDetail();
    }
}