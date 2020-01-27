package com.vidyesh.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();


        /*
        // Copy from debugger [Step into(F7)]
        // On debug click on employee and [Step into(F7)]
        */
        /*Address address = new Address("Germany", "Berlin");*//*


        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", "30"));
        family.add(new FamilyMember("Daughter", "5"));

        */
        /*Employee employee =
                new Employee("John", 30, "john@gmail.com", address, family);
        // Break point below
        String json = gson.toJson(employee);
        // Or*//*

        String json = gson.toJson(family);
        */



        // Copy from debugger
        // On debug click on [Step into(F7)], [Step out(F8)] and [Step into(F7)]
        String json = "[{\"age\":\"30\",\"role\":\"Wife\"},{\"age\":\"5\",\"role\":\"Daughter\"}]";
        // Break point below
        /*
        Employee employee = gson.fromJson(json, Employee.class);
        */

        // Break point below
        /*FamilyMember[] family = gson.fromJson(json, FamilyMember[].class);*/
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);

    }
}
