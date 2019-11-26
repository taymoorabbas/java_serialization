/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 26-Nov-19
Time: 8:56 PM
Lau ji Ghauri aya fir
*/

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static final String filename = "wrestler.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileIO fileIO = new FileIO(filename);

        ArrayList<Wrestler> arrayList = fileIO.deserializeAll();

        if(arrayList != null){

            for(Wrestler wrestler : arrayList){

                System.out.println(wrestler.getName());
            }
        }
    }
}
