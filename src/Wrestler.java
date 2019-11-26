/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 26-Nov-19
Time: 9:01 PM
Lau ji Ghauri aya fir
*/

import java.io.Serializable;

public class Wrestler implements Serializable {

    private int id;
    private String name;
    private char gender;
    private String maneuver;
    private int championships;

    public Wrestler(){}

    public Wrestler(int id, String name, char gender, String maneuver, int championships) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.maneuver = maneuver;
        this.championships = championships;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getManeuver() {
        return maneuver;
    }

    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }
}
