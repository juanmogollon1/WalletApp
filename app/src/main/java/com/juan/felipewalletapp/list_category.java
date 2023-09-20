package com.juan.felipewalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;



    @Override
    public class list_category extends AppCompatActivity {
        private ArrayList<Account> listcategoryRGB = new ArrayList<>();
        private RecyclerView myReclyclecategory;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.categoria);
            loadFakeData();
            myReclyclecategory = findViewById(R.id.rb_list_category);
            AccountAdapter myAdaptador = new AccountAdapter(listAccountRB);
            myReclycleAccount.setAdapter(myAdaptador);
            myReclycleAccount.setLayoutManager(new LinearLayoutManager(com.juan.felipewalletapp.category.this));
        }

        private void loadFakeData() {
            Account myAccount1 = new Account("restaurante", "rojo", 10003402.0, "https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
            Account myAccount2 = new Account("gasolina", "verde", 10000.345577, "https://i.pinimg.com/originals/92/61/91/926191354beba38c7c6a82ee21597e50.png");
            Account myAccount3 = new Account("casa", "azul", 277777.7777, "https://cdn-icons-png.flaticon.com/512/2331/2331876.png");
            listAccountRB.add(myAccount1);
            listAccountRB.add(myAccount2);
            listAccountRB.add(myAccount3);

        }

    }