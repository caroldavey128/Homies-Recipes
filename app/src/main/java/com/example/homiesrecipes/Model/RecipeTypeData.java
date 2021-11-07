package com.example.homiesrecipes.Model;

import android.view.InputQueue;

public class RecipeTypeData {

    String recipeType;
    Integer recipeTypeURL;

    public RecipeTypeData(String recipeType, Integer recipeTypeURL) {
        this.recipeType = recipeType;
        this.recipeTypeURL = recipeTypeURL;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public Integer getRecipeTypeURL() {
        return recipeTypeURL;
    }

    public void setRecipeTypeURL(Integer recipeTypeURL) {
        this.recipeTypeURL = recipeTypeURL;
    }
}
