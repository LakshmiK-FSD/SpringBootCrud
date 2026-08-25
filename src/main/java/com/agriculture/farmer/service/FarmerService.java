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
                Farmers dlet=farmers.remove(sarchf.getId()-1);
                return "succsessfully delleted"+" "+dlet.getFarmerName();
            }
        }
                return "Not found this Id";


    }

    public String upDate(int getID,Farmers getFarm) {
        if (getID-1>0 && getID<farmers.size()){
        farmers.set(getID-1,getFarm);
        return "Updated Succsessfully for "+getID;}
        return "The Details with id "+getID+" not match";
    }

    public String upDat(Farmers upFarm) {
        for (Farmers f:farmers){
            if (f.getId()==upFarm.getId()){
                farmers.set(f.getId()-1,upFarm);
                return "Updated Succsessfully for "+ f.getId();
            }
        }
        return "The Details with id "+upFarm.getId()+" not match";
    }
}