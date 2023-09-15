package com.juan.felipewalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {
    private ArrayList<Account> listAccountRB = new ArrayList<>();
    private RecyclerView  myReclycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        myReclycleAccount = findViewById(R.id.rb_list_account);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRB);
        myReclycleAccount.setAdapter(myAdaptador);
        myReclycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData() {
        Account myAccount1 = new Account("bancolombia","cuenta de ahorros",10003402.0,"https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 =new Account("Davivienda","cuenta debito",10000.345577,"https://i.pinimg.com/originals/92/61/91/926191354beba38c7c6a82ee21597e50.png");
        Account myAccount3 =new Account("efectivo","tarjeta de credito",277777.7777,"https://cdn-icons-png.flaticon.com/512/2331/2331876.png");
        listAccountRB.add(myAccount1);
        listAccountRB.add(myAccount2);
        listAccountRB.add(myAccount3);



    }
}