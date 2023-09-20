package com.juan.felipewalletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

    private ArrayList<Account> dataSet;

    public AccountAdapter(ArrayList<Account> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_acoount,parent,false);



        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount =dataSet.get(position);
        holder.loadInfo(myAccount);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNameAccount, tvTypeAccount,tvCurretValue;

        private ImageView ivPrincipal;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameAccount = itemView.findViewById(R.id.tv_item_name_account);
            tvTypeAccount = itemView.findViewById(R.id.tv_item_type_account);
            tvCurretValue = itemView.findViewById(R.id.tv_item_balance_account);
            ivPrincipal= itemView.findViewById(R.id.iv_gasolina);
        }

        public void loadInfo(Account myAccount) {
            tvNameAccount.setText(myAccount.getName());
            tvTypeAccount.setText(myAccount.getType());
            tvCurretValue.setText(String.valueOf(myAccount.getCurrentValue()));
            Picasso
                    .get()
                    .load(myAccount.getImageUrl())
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                    .into(ivPrincipal);
        }

    }
}
