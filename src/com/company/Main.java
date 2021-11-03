package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Book book[]=new Book[3];
        book[0]=new Book(1, "Zhanzakov","Astanabook","Kontorski",2015,250,5999);
        book[1]=new Book(2,"Maratov","Almatybook","Tipogravski",2012,180,3950);
        book[2]=new Book(3,"Narynov","Shymkentbook","Clasic",2014,386,4800);
         System.out.println("Avtor:");
         String avtor=sc.nextLine();
        for(int i=0; i<book.length;i++){
            if(book[i].getAvtor().equals(avtor))

       System.out.println(book[i].toString());
   }
    }
}
