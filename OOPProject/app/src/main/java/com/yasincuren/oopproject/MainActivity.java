package com.yasincuren.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
        User myUser = new User();
        myUser.job = "Engineer";
        myUser.name = "Yasin";

        User newUser = new User();
        newUser.name = "Kerem";
        newUser.job = "Student";
        */

        User myUser = new User("Yasin","Engineer");

        //Encapsulation

        Musician james = new Musician("james","guitar",50);
        System.out.println(james.getAge());
        james.setAge(40);
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("sezen aksu","violin",45);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));


    }
}