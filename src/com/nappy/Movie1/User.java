package com.nappy.Movie1;

import java.io.Serializable;

public class User {
    String name;
        String Id;
        String Password;

        public User(String name, String Id, String Password){
            this.name = name;
            this.Id = Id;
            this.Password = Password;
        }

        public String getName(){
            return name;
        }

        public String getId(){
            return Id;
        }

        public String getPassword(){
            return Password;
        }
    }

