package com.agriculture.farmer.service;
import com.agriculture.farmer.model.Farmers;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class FarmerService {
    private List<Farmers> farmers = new ArrayList<>(Arrays.asList(
            new Farmers(1, 56, "Lakshmi", "Paddy"),
            new Farmers(2, 45, "Ravi", "Wheat"),
            new Farmers(3, 38, "Meena", "Sugarcane"),
            new Farmers(4, 50, "Arun", "Cotton"),
            new Farmers(5, 29, "Sita", "Maize"),
            new Farmers(6, 60, "Kumar", "Soybean")
    ));

    public List<Farmers> farmDetail() {
        return farmers;

    }

    private int i = 0;

    public Farmers search(int id) {
        for (Farmers sarchf : farmers) {
            if (sarchf.getId() == id) {
                return sarchf;
            }
        }
        return null;
    }

    public String addObj(Farmers newFarmer) {
        farmers.add(newFarmer);
        return "succsessfully added your detailsfarmer";
    }
    public String delletObj(int id) {
        for (Farmers sarchf : farmers) {
            if (sarchf.getId() == id) {
                farmers.remove(id);
                return "succsessfully delleted";
            }
        }
                return "Not found this Id";


    }
}