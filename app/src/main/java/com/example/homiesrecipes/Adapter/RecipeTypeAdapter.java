package com.example.homiesrecipes.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homiesrecipes.ChickenRecipeSelections;
import com.example.homiesrecipes.Model.BeefRecipeData;
import com.example.homiesrecipes.Model.RecipeTypeData;
import com.example.homiesrecipes.PorkRecipeSelections;
import com.example.homiesrecipes.R;
import com.example.homiesrecipes.BeefRecipeSelections;

import java.util.ArrayList;

public class RecipeTypeAdapter extends RecyclerView.Adapter<RecipeTypeAdapter.RecipeTypeViewHolder> implements Filterable {

    Context context;
    ArrayList<RecipeTypeData> recipeTypeDataArrayList;



    public RecipeTypeAdapter(Context context, ArrayList<RecipeTypeData> recipeTypeDataArrayList) {
        this.context = context;
        this.recipeTypeDataArrayList = recipeTypeDataArrayList;

    }

    @Override
    public Filter getFilter() {
        return null;
    }

    @NonNull
    @Override
    public RecipeTypeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_type_list, parent, false);
        return new RecipeTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeTypeAdapter.RecipeTypeViewHolder holder, int position) {
        holder.recipeType.setText(recipeTypeDataArrayList.get(position).getRecipeType());
        holder.imgRecipeType.setImageResource(recipeTypeDataArrayList.get(position).getRecipeTypeURL());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (recipeTypeDataArrayList.get(position).getRecipeType()) {
                    case "Beef Recipes":
                        Intent beefView = new Intent(context, BeefRecipeSelections.class);
                        context.startActivity(beefView);
                        break;
                    case "Pork Recipes":
                        Intent porkView = new Intent(context, PorkRecipeSelections.class);
                        context.startActivity(porkView);
                        break;
                    case "Chicken Recipes":
                        Intent chickenView = new Intent(context, ChickenRecipeSelections.class);
                        context.startActivity(chickenView);
                        break;
                }



            }
        });
    }

    @Override
    public int getItemCount() {
        return recipeTypeDataArrayList.size();
    }

    public static final class RecipeTypeViewHolder extends RecyclerView.ViewHolder {
        TextView recipeType;
        ImageView imgRecipeType;
        public RecipeTypeViewHolder(@NonNull View itemView) {
            super(itemView);

        recipeType = itemView.findViewById(R.id.txtRecipeType);
        imgRecipeType = itemView.findViewById(R.id.imgRecipeType);
        }
    }
}
