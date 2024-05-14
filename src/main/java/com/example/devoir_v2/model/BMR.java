package com.example.devoir_v2.model;

public class BMR {
    int poids, taille, age, activityLvl;
    String sex;


    public BMR(int poids, int taille, int age, int activityLvl, String sex) {
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.activityLvl = activityLvl;
        this.sex = sex;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public int getActivityLvl() {
        return activityLvl;
    }

    public String getSex() {
        return sex;
    }


    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActivityLvl(int activityLvl) {
        this.activityLvl = activityLvl;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
