/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 26-Nov-19
Time: 9:21 PM
Lau ji Ghauri aya fir
*/

import java.io.*;
import java.util.ArrayList;

public class FileIO {

    private String filePath;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    public FileIO(String filePath){

        this.filePath = filePath;
    }

    public void serialize(Wrestler wrestler) throws IOException {

        boolean fileExist = new File(filePath).exists();
        FileOutputStream fileOutputStream = new FileOutputStream(this.filePath, true);

        if(fileExist){

            this.outputStream = new ObjectOutputStream(fileOutputStream){
                @Override
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            };
        }

        else{

            this.outputStream = new ObjectOutputStream(fileOutputStream);
        }

        this.outputStream.writeObject(wrestler);
    }

    public Object deserializeById(int id) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(this.filePath);
        this.inputStream = new ObjectInputStream(fileInputStream);

        while (fileInputStream.available() > 0) {

            Wrestler wrestler = (Wrestler) this.inputStream.readObject();

            if (wrestler.getId() == id) {

                return wrestler;
            }
        }

        fileInputStream.close();
        this.inputStream.close();
        return null;
    }

    public ArrayList<Wrestler> deserializeAll() throws IOException, ClassNotFoundException {

        ArrayList<Wrestler> arrayList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(this.filePath);

        this.inputStream = new ObjectInputStream(fileInputStream);

        while (fileInputStream.available() > 0){

            Wrestler wrestler = (Wrestler) this.inputStream.readObject();
            arrayList.add(wrestler);
        }

        fileInputStream.close();
        this.inputStream.close();
        return arrayList;
    }
}
