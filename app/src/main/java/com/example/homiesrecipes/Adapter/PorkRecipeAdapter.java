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
import com.example.homiesrecipes.Model.PorkRecipeData;
import com.example.homiesrecipes.PorkRecipeSelections;
import com.example.homiesrecipes.R;

import java.util.ArrayList;

public class PorkRecipeAdapter extends RecyclerView.Adapter<PorkRecipeAdapter.PorkRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<PorkRecipeData> porkRecipeDataArrayList;

    public PorkRecipeAdapter(PorkRecipeSelections context, ArrayList<PorkRecipeData> porkRecipeDataArrayList) {
        this.context = context;
        this.porkRecipeDataArrayList = porkRecipeDataArrayList;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    @NonNull
    @Override
    public PorkRecipeAdapter.PorkRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_selection_list, parent, false);
        return new PorkRecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PorkRecipeAdapter.PorkRecipeViewHolder holder, int position) {
        holder.recipeName.setText(porkRecipeDataArrayList.get(position).getRecipeName());
        holder.recipeImageURL.setImageResource(porkRecipeDataArrayList.get(position).getRecipeImageURL());
    }



    @Override
    public int getItemCount() {
        return porkRecipeDataArrayList.size();
    }

    public static final class PorkRecipeViewHolder extends RecyclerView.ViewHolder {
        TextView recipeName;
        ImageView recipeImageURL;
        public PorkRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeName = itemView.findViewById(R.id.txtRecipeSelection);
            recipeImageURL = itemView.findViewById(R.id.imgRecipeSelection);
        }
    }
}
