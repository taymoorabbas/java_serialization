/*
Created by: Taymoor Ghazanfar
R.no: 3625-BSSE-F17-C
Date: 26-Nov-19
Time: 10:57 PM
Lau ji Ghauri aya fir
*/

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendObjectOutputStream extends ObjectOutputStream {

    public AppendObjectOutputStream(OutputStream outputStream) throws IOException {

        super(outputStream);
    }

    @Override
    protected void writeStreamHeader() {

    }
}
