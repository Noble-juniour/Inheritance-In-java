package com.company;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {


        book a = new book(
                "The  Lord of the rings",
                "J.R.R. Tolkein",
                "George Allen and Unwin",
                "Fantasy");

        Poem b = new Poem(
              "The Iliad",
              "Homer",
                "dactylic Hexameter");
        /*Literature l = new Literature(
                "Java",
                 "kevin"
        );*/

        Literature[] lits = new  Literature[5];
        lits[0] = a;
        lits[1] = b;
        lits[2] = a;
        lits[3] = b;
        lits[4] = a;

        for(int i = 0; i < lits.length ; i++)
        {
            lits[i].Print();
        }

        a.Print();
        b.Print();
    }
}
