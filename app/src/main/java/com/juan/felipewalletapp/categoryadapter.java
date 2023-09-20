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

public class categoryadapter { private ArrayList<category> dataSet;

        public categoryadapter(ArrayList<category> dataSet) {
            this.dataSet = dataSet;
        }

        @NonNull
        @Override
        public categoryadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_category,parent,false);



            return new categoryadapter().ViewHolder(myView);
        }

        @Override
        public void onBindViewHolder(@NonNull categoryadapter.ViewHolder holder, int position) {
            Account myAccount =dataSet.get(position);
            holder.loadInfo(mycategory);

        }

        @Override
        public int getItemCount() {
            return dataSet.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView tvnombrecategory, tvdescripcioncategory,tvcolorcategoria;

    private ImageView ivPrincipal;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        tvnombrecategory = itemView.findViewById(R.id.tv_item_name_category);
        tvdescripcioncategory = itemView.findViewById(R.id.tv_descripcion_category);
        tvcolorcategoria = itemView.findViewById(R.id.tv_item_color_category);
        tviconocategoria= itemView.findViewById(R.id.tv_item_icono_categoria;
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
        {
}
