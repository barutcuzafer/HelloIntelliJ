package com.app;

public class BookObjects {
    public static void main(String[] args) {

AudioBook audioBook=new AudioBook();
audioBook.author="Michael Obama";
audioBook.title="Becoming";
audioBook.price=11;
audioBook.narrator="Random House Audio";
audioBook.lentgh=15;
audioBook.listen();

Ebook ebook=new Ebook();
ebook.author="Dan Brown";
ebook.title="Angels&Demons";
ebook.readBook();

    }
}
