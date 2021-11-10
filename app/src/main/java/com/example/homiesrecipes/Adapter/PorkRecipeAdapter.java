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
import com.example.homiesrecipes.Model.PorkRecipeData;
import com.example.homiesrecipes.PorkRecipeSelections;
import com.example.homiesrecipes.R;

import java.util.ArrayList;

public class PorkRecipeAdapter extends RecyclerView.Adapter<PorkRecipeAdapter.PorkRecipeViewHolder> implements Filterable {
    Context context;
    ArrayList<PorkRecipeData> porkRecipeDataArrayList;
    ArrayList<PorkRecipeData> porkRecipeDataFull;

    public PorkRecipeAdapter(PorkRecipeSelections context, ArrayList<PorkRecipeData> porkRecipeDataArrayList) {
        this.context = context;
        this.porkRecipeDataArrayList = porkRecipeDataArrayList;
        this.porkRecipeDataFull = new ArrayList<>(porkRecipeDataArrayList);
    }

    @Override
    public Filter getFilter() {
        return filteredList;
    }

    private final Filter filteredList = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<PorkRecipeData> porkRecipeDataArrayList = new ArrayList<>();
            if (charSequence.toString().isEmpty()) {
                porkRecipeDataArrayList.addAll(porkRecipeDataFull);
            }
            else {
                ArrayList<PorkRecipeData> lastFilter = new ArrayList<>();
                for (PorkRecipeData recipe : porkRecipeDataFull) {
                    if (recipe.getRecipeName().toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        lastFilter.add(recipe);
                    }
                }
                porkRecipeDataArrayList = lastFilter;
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = porkRecipeDataArrayList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            porkRecipeDataArrayList = (ArrayList<PorkRecipeData>)filterResults.values;
            notifyDataSetChanged();
        }
    };
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailedView = new Intent(context, DetailedView.class);
                detailedView.putExtra("recipeName", porkRecipeDataArrayList.get(position).getRecipeName());
                detailedView.putExtra("recipeImageURL", porkRecipeDataArrayList.get(position).getRecipeImageURL());
                detailedView.putExtra("recipeIngredients", porkRecipeDataArrayList.get(position).getRecipeIngredients());
                detailedView.putExtra("recipeInstructions", porkRecipeDataArrayList.get(position).getRecipeInstructions());
                context.startActivity(detailedView);
            }
        });
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
