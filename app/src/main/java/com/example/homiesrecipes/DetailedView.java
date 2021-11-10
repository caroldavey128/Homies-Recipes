package com.example.homiesrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailedView extends AppCompatActivity {

    TextView recipeName, recipeIngredients, recipeInstruction;
    ImageView recipeImageURL;
    String name, ingredients, instructions;
    Integer image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        Intent detailedView = getIntent();
        name = detailedView.getStringExtra("recipeName");
        image = detailedView.getIntExtra("recipeImageURL", R.drawable.beefasado);
        ingredients = detailedView.getStringExtra("recipeIngredients");
        instructions = detailedView.getStringExtra("recipeInstructions");

        recipeName =findViewById(R.id.txtRecipeName);
        recipeImageURL = findViewById(R.id.imgRecipe);
        recipeIngredients = findViewById(R.id.txtIngredients);
        recipeInstruction = findViewById(R.id.txtInstructions);

        recipeName.setText(name);
        recipeImageURL.setImageResource(image);
        recipeIngredients.setText(ingredients);
        recipeInstruction.setText(instructions);
    }


}