package com.example.devoir_v2.control;

import com.example.devoir_v2.model.BMR;

public class Calcule {
    public double CalculeBmr(BMR b){
        double bmrCalcule = 0;
        double activityModifier;

        switch (b.getActivityLvl()){
            case 0:
                activityModifier = 1.2;
            case 1:
                activityModifier = 1.375;
            case 2:
                activityModifier = 1.55;
            case 3:
                activityModifier = 1.725;
            case 4:
                activityModifier = 1.9;
            default:
                activityModifier = 1;
        }


        if (b.getSex()=="homme"){
            bmrCalcule = (66.47 + (13.75*b.getPoids())+(5.003*b.getTaille())-(6.755*b.getAge()))*activityModifier;
        }
        else {
            bmrCalcule = (655.1+(9.563*b.getPoids())+(1.85*b.getTaille())-(6.755*b.getAge()))*activityModifier;
        }
        System.out.println(bmrCalcule);
        System.out.println("je suis dans le Calcule");
        return bmrCalcule;
    }
}
