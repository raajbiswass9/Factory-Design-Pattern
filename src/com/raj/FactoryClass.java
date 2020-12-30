package com.raj;

public class FactoryClass {

    //Factory method
    public Configuration getObj(String ob){
        if(ob.equals("fuel")){
            return new FuelCar();
        }else if(ob.equals("electric")){
            return new ElectricCar();
        }else{
            return new HybridCar();
        }
    }
}
