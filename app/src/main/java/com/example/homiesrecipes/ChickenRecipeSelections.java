package com.example.homiesrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.homiesrecipes.Adapter.BeefRecipeAdapter;
import com.example.homiesrecipes.Adapter.ChickenRecipeAdapter;
import com.example.homiesrecipes.Model.ChickenRecipeData;


import java.util.ArrayList;

public class ChickenRecipeSelections extends AppCompatActivity {

    SearchView searchView;
    ChickenRecipeAdapter chickenRecipeAdapter;
    RecyclerView chickenRecipeRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_selections);

        searchView = findViewById(R.id.recipeSearch);

        ArrayList<ChickenRecipeData> chickenRecipeDataArrayList = new ArrayList<>();
        chickenRecipeDataArrayList.add(new ChickenRecipeData("Pineapple Chicken Afritada",
                "Chicken stew with pineapple, potato, and carrots.",
                "- 2 lbs. chicken cut into serving pieces \n" + "\n" + "- 1 piece Knorr chicken cube \n" + "\n" + "- 8 ounces tomato sauce \n" + "\n" + "- 8 ounces pineapple chunks in can \n" + "\n" +
                        "- 1 piece potato diced \n" + "\n" + "- 1 piece carrot sliced \n" + "\n" + "- 1-piece red bell pepper cut into squares \n" + "\n" + "- 1-piece green bell pepper cut into squares \n" + "\n" +
                        "- 1 piece onion chopped \n" + "\n" + "- 4 cloves garlic chopped \n" + "\n" + "- 3 pieces dried bay leaves \n" + "\n" + "- 3 tablespoons cooking oil \n" + "\n" + "- 1 cup water \n" +
                        "\n" + "- Fish sauce and ground black pepper to taste ",
                "1. Heat oil in a pan. Add garlic. Continue cooking while stirring until it starts to turn golden brown in color. \n" + "\n" + "2. Add onion. Sauté until it softens. \n" + "\n" +
                        "3. Add chicken. Cook each side for 1 minute or until the color turns light brown. \n" + "\n" + "4. Pour the tomato sauce, juice from pineapple chunks, and water into the pan. Stir. Cover the pan. \n" + "\n" + "5. Once the liquid starts to boil, add Knorr Chicken Cube, and bay leaves. Cover the pan and then adjust the heat to a low setting. Continue cooking for 18 minutes. \n" + "\n" +
                        "6. Use a kitchen tong to turn the chicken pieces over. Continue cooking the opposite side for 12 minutes. \n" + "\n" + "7. Add pineapple, potato, and carrot. Cook for 10 minutes. \n" +
                        "\n" + "8. Season with fish sauce and ground black pepper. \n" + "\n" + "9. Add bell pepper. Cook for 3 to 5 minutes. \n" + "\n" + "10. Transfer to a serving bowl. Serve and enjoy! ", R.drawable.chickenafritada));
        chickenRecipeDataArrayList.add(new ChickenRecipeData("Chicken Binagoongan",
                "Easy Filipino chicken stew cooked with shrimp paste.",
                "- 2 lbs. chicken cut into serving pieces \n" + "\n" + "- 3 ½ tablespoons bagoong alamang \n" + "\n" + "- 5 pieces winged bean sigarilyas, sliced \n" + "\n" + "- 1 piece onion chopped \n" +
                        "\n" + "- 4 cloves garlic crushed and chopped \n" + "\n" + "- 2 pieces tomato cubed \n" + "\n" + "- 2 tablespoons white vinegar \n" + "\n" + "- 1 teaspoon granulated white sugar \n" + "\n" + "- 1 ½ cups water \n" +
                        "\n" + "- 3 tablespoons cooking oil \n" + "\n" + "- 3 pieces Thai chili chopped \n" + "\n" + "- 1 piece Serrano pepper sliced \n" + "\n" + "- Ground black pepper to taste ",
                "1. Heat oil in a pan. Sauté onion for 25 seconds. \n" + "\n" + "2. Add the garlic. Sauté for 30 seconds. \n" + "\n" + "3. Add tomato. Continue cooking until the tomato softens. \n" + "\n" +
                        "4. Put the chicken into the pan. Sauté until the color of the outer part turns medium brown. \n" + "\n" + "5. Add bagoong alamang (shrimp paste). Cook for 1 minute. \n" + "\n" + "6. Pour vinegar into the pan. Let the liquid boil. \n" +
                        "\n" + "7. Pour water into the pan. Cover and then let it boil. Boil for 5 minutes. \n" + "\n" + "8. Add winged beans (sigarilyas). Cover and then cook between low to medium heat for 30 minutes. \n" + "\n" +
                        "9. Season with sugar and add more shrimp paste if needed. \n" + "\n" + "10. Add chili and long green pepper. Cook for 3 minutes. \n" + "\n" + "11. Transfer to a serving bowl. Serve with warm rice. \n" + "\n" + "12. Share and enjoy! ", R.drawable.chickenbinagoongan));
        chickenRecipeDataArrayList.add(new ChickenRecipeData("Chicken Paksiw",
                "Leftover fried chicken cooked in liver sauce with vinegar.",
                "- 1 lb. leftover chicken cut into pieces \n" + "\n" + "- 1 piece Knorr Chicken Cube \n" + "\n" + "- 1 cup lechon sauce \n" + "\n" + "- 5 cloves garlic chopped \n" + "\n" + "- 1 piece onion chopped \n" +
                        "\n" + "- 1 teaspoon whole peppercorn \n" + "\n" + "- 4 pieces dried bay leaves \n" + "\n" + "- 1/2 cup white vinegar \n" + "\n" + "- 1/4 cup sugar \n" + "\n" + "- 1 cup water \n" + "\n" + "- Salt to taste \n" +
                        "\n" + "- 3 tablespoons cooking oil ",
                "1. Heat oil in a pan. Sauté onion and garlic. \n" + "\n" + "2. Once the onion softens, add chicken. Stir and sauté for 1 minute. \n" + "\n" + "3. Pour the lechon sauce into the pan and then add vinegar. Let the mixture boil before stirring. \n" +
                        "\n" + "4. Pour water into the pan. Let it boil. \n" + "\n" + "5. Add Knorr Chicken Cube, bay leaves, and whole peppercorn. Stir. Cover the pan and then adjust the heat to the lowest setting. Continue cooking for 35 minutes. \n" +
                        "\n" + "6. Take the cover off the pan. Continue cooking until the sauce evaporates and reduces to half. \n" + "\n" + "7. Add sugar and then season with salt. \n" + "\n" + "8. Transfer it to a serving bowl and serve with warm rice. Share and enjoy! ", R.drawable.chickenpaksiw));
        chickenRecipeDataArrayList.add(new ChickenRecipeData("Pininyahang Manok",
                "This Recipe calls for chicken slices to be marinated in pineapple juice then stewed with pineapple chunks. Aside from pineapples, secondary ingredients such as carrots, bell pepper, and milk make-up the dish.",
                "- 2 lbs. chicken cut into serving pieces \n" + "\n" + "- 12 ounces pineapple chunks canned \n" + "\n" + "- 2 pieces tomato chopped \n" + "\n" + "- 1 cup bell pepper cut into thick strips \n" + "\n" +
                        "- 1 piece carrot wedged \n" + "\n" + "- 2 1/2 tablespoon fish sauce patis \n" + "\n" + "- 1/2 cup fresh milk \n" + "\n" + "- 2 tablespoons garlic minced \n" + "\n" + "- 1 piece onion sliced \n" + "\n" + "- 2 tablespoon cooking oil ",
                "1. Marinate the chicken in pineapple juice/concentrate (derived from the can of pineapple chunks) for 20 to 30 minutes \n" + "\n" + "2. Pour the cooking oil in a cooking pot / casserole then apply heat \n" + "\n" +
                        "3. Sauté the garlic, onion, and tomatoes \n" + "\n" + "4. Put-in the chicken and cook until color of the outer part turns light brown \n" + "\n" + "5. Add the pineapple juice/concentrate marinade and fresh milk then bring to a boil \n" +
                        "\n" + "6. Add the pineapple chunks and simmer until the chicken is tender and half of the liquid evaporates (about 20 to 30 minutes). \n" + "\n" + "7. Put-in the carrots and simmer for 5 minutes \n" + "\n" +
                        "8. Add the bell pepper and fish sauce then simmer for 3 minutes \n" + "\n" + "9. Remove from the cooking pot / casserole and transfer to a serving dish. \n" + "\n" + "10. Serve hot. Share and enjoy! ", R.drawable.pineapplechicken));
        setChickenRecipeRecyclerView(chickenRecipeDataArrayList);

        //Search bar function
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                chickenRecipeAdapter.getFilter().filter(s.toLowerCase().toString());
                return false;
            }

        });
    }

    private void setChickenRecipeRecyclerView(ArrayList<ChickenRecipeData> chickenRecipeDataArrayList) {

        chickenRecipeRecyclerView =findViewById(R.id.recipeSelectionRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        chickenRecipeRecyclerView.setLayoutManager(layoutManager);
        chickenRecipeAdapter = new ChickenRecipeAdapter(this, chickenRecipeDataArrayList);
        chickenRecipeRecyclerView.setAdapter(chickenRecipeAdapter);
    }
}