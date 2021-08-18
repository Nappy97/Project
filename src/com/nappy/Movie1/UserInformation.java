package com.nappy.Movie1;

import java.io.*;
import java.util.*;

public class UserInformation {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> arr = new ArrayList<User>();
    File dir, file;

    public UserInformation() throws IOException, ClassNotFoundException {
        dir = new File("src\\com\\movie1");
        file = new File(dir, "User.txt");
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            arr = (ArrayList<User>) ois.readObject();
        } else {
            file.createNewFile();
        }
    }
}
