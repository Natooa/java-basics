package org.example;

import java.io.*;

public class SerializatonAndDeserialization {

    private static final String PATH = "object.txt";

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        serialize();
        deserialize();
    }

    private static void serialize() {
        SerializableClass serializableClass = new SerializableClass(SerializableClass.class.getName(), 0);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))){
            objectOutputStream.writeObject(serializableClass);
        }catch (IOException e) {
            System.out.println("Output error");
        }
    }

    private static void deserialize() throws ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH))){
            SerializableClass serializableClass = (SerializableClass) objectInputStream.readObject();
            System.out.printf("Title: %s%nSize: %d", serializableClass.title, serializableClass.size);
        } catch (IOException e) {
            System.out.println("Input error");
        }
    }

    private static class SerializableClass implements Serializable {
        private transient String title;
        private int size;

        SerializableClass(String title, int size) {
            this.title = title;
            this.size = size;
        }
    }
}
