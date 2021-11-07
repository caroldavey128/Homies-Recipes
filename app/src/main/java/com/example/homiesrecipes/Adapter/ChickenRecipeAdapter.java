package com.example.homiesrecipes.Adapter;

import android.content.Context;
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
import com.example.homiesrecipes.Model.ChickenRecipeData;
import com.example.homiesrecipes.R;

import java.util.ArrayList;

public class ChickenRecipeAdapter extends RecyclerView.Adapter<ChickenRecipeAdapter.ChickenRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<ChickenRecipeData> chickenRecipeDataArrayList;

    public ChickenRecipeAdapter(ChickenRecipeSelections context, ArrayList<ChickenRecipeData> chickenRecipeDataArrayList) {
        this.context = context;
        this.chickenRecipeDataArrayList = chickenRecipeDataArrayList;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    @NonNull
    @Override
    public ChickenRecipeAdapter.ChickenRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_selection_list, parent, false);
        return new ChickenRecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChickenRecipeAdapter.ChickenRecipeViewHolder holder, int position) {
        holder.recipeName.setText(chickenRecipeDataArrayList.get(position).getRecipeName());
        holder.recipeImageURL.setImageResource(chickenRecipeDataArrayList.get(position).getRecipeImageURL());
    }



    @Override
    public int getItemCount() {
        return chickenRecipeDataArrayList.size();
    }

    public static final class ChickenRecipeViewHolder extends RecyclerView.ViewHolder {
        TextView recipeName;
        ImageView recipeImageURL;
        public ChickenRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeName = itemView.findViewById(R.id.txtRecipeSelection);
            recipeImageURL = itemView.findViewById(R.id.imgRecipeSelection);
        }
    }
}
