package com.pogorelov.practiceSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable {
    int i = 5;
    String s = "aaa";
    transient String[] def = {"a","a","a"};
    CustomObject customObject = new CustomObject();

    private void writeObject (ObjectOutputStream objectOutputStream) throws IOException{
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getMyData());
    }
    private void readObject (ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException{
        objectInputStream.defaultReadObject();
        DataObject dataObject = new DataObject();
        dataObject.setMyData((String) objectInputStream.readObject());
    }

}
