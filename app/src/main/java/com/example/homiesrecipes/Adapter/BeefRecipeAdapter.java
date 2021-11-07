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

import com.example.homiesrecipes.Model.BeefRecipeData;
import com.example.homiesrecipes.R;

import java.util.ArrayList;

public class BeefRecipeAdapter extends RecyclerView.Adapter<BeefRecipeAdapter.BeefRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<BeefRecipeData> beefRecipeDataArrayList;

    public BeefRecipeAdapter(Context context, ArrayList<BeefRecipeData> beefRecipeDataArrayList) {
        this.context = context;
        this.beefRecipeDataArrayList = beefRecipeDataArrayList;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    @NonNull
    @Override
    public BeefRecipeAdapter.BeefRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_selection_list, parent, false);
        return new BeefRecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeefRecipeAdapter.BeefRecipeViewHolder holder, int position) {
        holder.recipeName.setText(beefRecipeDataArrayList.get(position).getRecipeName());
        holder.recipeImageURL.setImageResource(beefRecipeDataArrayList.get(position).getRecipeImageURL());
    }



    @Override
    public int getItemCount() {
        return beefRecipeDataArrayList.size();
    }

    public static final class BeefRecipeViewHolder extends RecyclerView.ViewHolder {
        TextView recipeName;
        ImageView recipeImageURL;
        public BeefRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeName = itemView.findViewById(R.id.txtRecipeSelection);
            recipeImageURL = itemView.findViewById(R.id.imgRecipeSelection);
        }
    }
}
