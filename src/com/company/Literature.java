package com.company;

public abstract class Literature {
    protected String title;
    protected String author;

  /*  public Literature(String title,String author)
    {
        this.title =  title;
        this.author = author;

    }*/
    public void Print(){
        System.out.println(   title);
        System.out.println("\tWritten By: " + author);
    }
   // public abstract void Print();
}
