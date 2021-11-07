package com.example.homiesrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homiesrecipes.Adapter.RecipeTypeAdapter;
import com.example.homiesrecipes.Model.RecipeTypeData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recipeTypeRecyclerView;
    RecipeTypeAdapter recipeTypeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecipeTypeData> recipeTypeDataArrayList = new ArrayList<>();
        recipeTypeDataArrayList.add(new RecipeTypeData("Beef Recipes", R.drawable.beef));
        recipeTypeDataArrayList.add(new RecipeTypeData("Pork Recipes", R.drawable.pork));
        recipeTypeDataArrayList.add(new RecipeTypeData("Chicken Recipes", R.drawable.chicken));

        setRecipeTypeRecyclerView(recipeTypeDataArrayList);
    }
    private void setRecipeTypeRecyclerView(ArrayList<RecipeTypeData> recipeTypeDataArrayList) {

        recipeTypeRecyclerView =findViewById(R.id.recipeTypeList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recipeTypeRecyclerView.setLayoutManager(layoutManager);
        recipeTypeAdapter = new RecipeTypeAdapter(this, recipeTypeDataArrayList);
        recipeTypeRecyclerView.setAdapter(recipeTypeAdapter);
    }
}