package com.company;

import java.io.*;

public class Methods {

    public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
        InputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Serializable object = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return object;
    }

    public static void serialize(File file,Serializable object) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }


}
