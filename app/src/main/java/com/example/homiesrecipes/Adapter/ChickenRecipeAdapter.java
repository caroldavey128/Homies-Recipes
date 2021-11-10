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
import com.example.homiesrecipes.DetailedView;
import com.example.homiesrecipes.Model.BeefRecipeData;
import com.example.homiesrecipes.Model.ChickenRecipeData;
import com.example.homiesrecipes.R;

import java.util.ArrayList;

public class ChickenRecipeAdapter extends RecyclerView.Adapter<ChickenRecipeAdapter.ChickenRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<ChickenRecipeData> chickenRecipeDataArrayList;
    ArrayList<ChickenRecipeData> chickenRecipeDataFull;

    public ChickenRecipeAdapter(ChickenRecipeSelections context, ArrayList<ChickenRecipeData> chickenRecipeDataArrayList) {
        this.context = context;
        this.chickenRecipeDataArrayList = chickenRecipeDataArrayList;
        this.chickenRecipeDataFull = new ArrayList<>(chickenRecipeDataArrayList);
    }

    @Override
    public Filter getFilter() {
        return filteredList;
    }

    private final Filter filteredList = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<ChickenRecipeData> chickenRecipeDataArrayList = new ArrayList<>();
            if (charSequence.toString().isEmpty()) {
                chickenRecipeDataArrayList.addAll(chickenRecipeDataFull);
            }
            else {
                ArrayList<ChickenRecipeData> lastFilter = new ArrayList<>();
                for (ChickenRecipeData recipe : chickenRecipeDataFull) {
                    if (recipe.getRecipeName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        lastFilter.add(recipe);
                    }
                }
                chickenRecipeDataArrayList = lastFilter;
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = chickenRecipeDataArrayList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            chickenRecipeDataArrayList = (ArrayList<ChickenRecipeData>)filterResults.values;
            notifyDataSetChanged();
        }
    };
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailedView = new Intent(context, DetailedView.class);
                detailedView.putExtra("recipeName", chickenRecipeDataArrayList.get(position).getRecipeName());
                detailedView.putExtra("recipeImageURL", chickenRecipeDataArrayList.get(position).getRecipeImageURL());
                detailedView.putExtra("recipeIngredients", chickenRecipeDataArrayList.get(position).getRecipeIngredients());
                detailedView.putExtra("recipeInstructions", chickenRecipeDataArrayList.get(position).getRecipeInstructions());
                context.startActivity(detailedView);
            }
        });
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
