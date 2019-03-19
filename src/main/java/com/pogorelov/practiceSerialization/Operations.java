package com.pogorelov.practiceSerialization;

import java.io.*;

public class Operations {
    public static void main(String[] args) {
        DataObject dataObject = new DataObject();
        dataObject.setMyData("hahahahaha");
        File file = new File("store.bin");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dataObject);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            DataObject dataObjectNew = (DataObject) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(dataObjectNew.getMyData());
        }catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
