package com.company;

public class Poem extends Literature {
    private String style;

    public  Poem(String title, String author, String style)
    {
        this.title = title;
        this.author = author;
        this.style = style;
    }
    //method overriddig
    @Override public  void Print(){
        System.out.println("       POEM");
        super.Print();
       // System.out.println("Poem: " + title);
        //System.out.println("\tWritten By: " + author);
        System.out.println("\tIn The style of: " + style);
    }
}
