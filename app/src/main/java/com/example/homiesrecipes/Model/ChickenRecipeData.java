package com.example.homiesrecipes.Model;

public class ChickenRecipeData {
    String recipeName, recipeDescription, recipeIngredients, recipeInstructions;
    Integer recipeImageURL;

    public ChickenRecipeData(String recipeName, String recipeDescription, String recipeIngredients, String recipeInstructions, Integer recipeImageURL) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
        this.recipeImageURL = recipeImageURL;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeInstructions() {
        return recipeInstructions;
    }

    public void setRecipeInstructions(String recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    public Integer getRecipeImageURL() {
        return recipeImageURL;
    }

    public void setRecipeImageURL(Integer recipeImageURL) {
        this.recipeImageURL = recipeImageURL;
    }
}
