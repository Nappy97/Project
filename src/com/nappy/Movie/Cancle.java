package com.nappy.Movie;

public class Cancle extends MovieCusImple {
    public void ss(){
        String name ;
        for(int i=0; i<1; i++){
            System.out.println("S>>");
            for(int k =0; k<S.length; k++)
                System.out.println(S[k]);
        }
        System.out.println("");
        System.out.println("이름>>");
        name=sc.next();
        for(int i =0; i<S.length; i++){
            if(S[i].equals(name)){
                S[i] = "---  ";
            }
        }
    }

    public void aa(){
        String name;
        for(int i=0; i<1; i++){
            System.out.println("A>>");
            for(int k=0; k<A.length; k++)
                System.out.println(A[k]);
        }
        System.out.println("");
        System.out.println("이름>>");
        name=sc.next();
        for(int i =01; i<A.length; i++){
            if(A[i].equals(name)){
                A[i] = "---  ";
            }
        }
    }

    public void bb(){
        String name;
        for(int i =0; i<1; i++){
            System.out.println("B>>");
            for(int k=0; k<B.length; k++)
                System.out.println(B[k]);
        }
        System.out.println("");
        System.out.println("이름>>");
        name=sc.next();
        for(int i=0; i<B.length; i++){
            if(B[i].equals(name)){
                B[i] = "---  ";
            }
        }
    }
}
