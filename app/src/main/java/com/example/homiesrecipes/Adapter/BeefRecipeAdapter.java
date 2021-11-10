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

import com.example.homiesrecipes.DetailedView;
import com.example.homiesrecipes.Model.BeefRecipeData;
import com.example.homiesrecipes.R;

import java.util.ArrayList;
import java.util.List;

public class BeefRecipeAdapter extends RecyclerView.Adapter<BeefRecipeAdapter.BeefRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<BeefRecipeData> beefRecipeDataArrayList;
    ArrayList<BeefRecipeData> beefRecipeDataFull;

    public BeefRecipeAdapter(Context context, ArrayList<BeefRecipeData> beefRecipeDataArrayList) {
        this.context = context;
        this.beefRecipeDataArrayList = beefRecipeDataArrayList;
        this.beefRecipeDataFull = new ArrayList<>(beefRecipeDataArrayList);
    }

    @Override
    public Filter getFilter() {
        return filteredList;
    }

    private final Filter filteredList = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<BeefRecipeData> beefRecipeDataArrayList = new ArrayList<>();
            if (charSequence.toString().isEmpty()) {
                beefRecipeDataArrayList.addAll(beefRecipeDataFull);
            }
            else {
                ArrayList<BeefRecipeData> lastFilter = new ArrayList<>();
                for (BeefRecipeData recipe : beefRecipeDataFull) {
                    if (recipe.getRecipeName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        lastFilter.add(recipe);
                    }
                }
                beefRecipeDataArrayList = lastFilter;
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = beefRecipeDataArrayList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            beefRecipeDataArrayList = (ArrayList<BeefRecipeData>)filterResults.values;
            notifyDataSetChanged();
        }
    };

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailedView = new Intent(context, DetailedView.class);
                detailedView.putExtra("recipeName", beefRecipeDataArrayList.get(position).getRecipeName());
                detailedView.putExtra("recipeImageURL", beefRecipeDataArrayList.get(position).getRecipeImageURL());
                detailedView.putExtra("recipeIngredients", beefRecipeDataArrayList.get(position).getRecipeIngredients());
                detailedView.putExtra("recipeInstructions", beefRecipeDataArrayList.get(position).getRecipeInstructions());
                context.startActivity(detailedView);
            }
        });
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
