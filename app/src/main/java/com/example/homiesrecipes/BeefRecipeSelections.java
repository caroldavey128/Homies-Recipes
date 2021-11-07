package com.example.homiesrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.homiesrecipes.Adapter.BeefRecipeAdapter;
import com.example.homiesrecipes.Adapter.RecipeTypeAdapter;
import com.example.homiesrecipes.Model.BeefRecipeData;
import com.example.homiesrecipes.Model.RecipeTypeData;

import java.util.ArrayList;

public class BeefRecipeSelections extends AppCompatActivity {


    BeefRecipeAdapter beefRecipeAdapter;
    RecyclerView beefRecipeRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_selections);

        ArrayList<BeefRecipeData> beefRecipeDataArrayList = new ArrayList<>();
        beefRecipeDataArrayList.add(new BeefRecipeData("Beef Salpicao",
                                                        "Beef stewed in tomato with potato, carrot, olives, bell peppers, and liver spread. This dish is popularly known as Kaldereta. ",
                                                        "2 lbs. beef cubed \n" + "\n" + "3 pieces garlic cloves crushed and chopped \n" + "\n" + "1 piece onion finely chopped \n" + "\n" + "2 cups beef broth \n" + "\n" + "1-piece red bell pepper sliced \n" + "\n" + "1-piece green bell pepper sliced \n" + "\n" + "1 cup tomato sauce \n" +
                                                                "\n" + "½ cup liver spread processed using blender \n" + "\n" + "1 teaspoon chili flakes \n" + "\n" + "3 pieces dried bay leaves \n" + "\n" +
                                                                "2 cups potatoes sliced \n" + "\n" + "2 cups carrots sliced \n" + "\n" + "1/4 cup cooking oil \n" + "\n" + "⅔ cup green olives \n" + "\n" + "salt and pepper to taste",
                                                        "Heat the cooking oil in the cooking pot or pressure cooker. \n" + "\n" + "Sauté the onion and garlic. \n" + "\n" + "Add the beef. Cook for 5 minutes or until the color turns light brown. \\n" +
                                                        "\n" + "Add the dried bay leaves and crushed pepper. Stir. \n" + "\n" + "Add the liver spread. Stir. \n" + "\n" + "Pour-in the tomato sauce and beef broth. \n" + "\n" +
                                                        "Cook the beef until it becomes tender (about 30 mins if using a pressure cooker, or 1 to 2 hours if using an ordinary pot). \n" + "\n" + "Add potato and carrots. Cook for 8 to 10 minutes. \n" + "\n" +
                                                        "Put the green olives and bell peppers in the cooking pot. Stir and continue to cook for 5 minutes more. \n" + "\n" + "Add salt and pepper to taste \n" + "\n" + "Serve Hot. Enjoy! ", R.drawable.beefsalpicao));
        beefRecipeDataArrayList.add(new BeefRecipeData("Beef Kaldereta", "Quick and easy beef tenderloin stir fry with bell peppers.", "1 lb. beef tenderloin thinly sliced \n" + "\n" + "3 tablespoons oyster sauce \n" +
                                                        "\n" + "1 teaspoon soy sauce \n" + "\n" + "1 ½ tablespoons cornstarch \n" + "\n" + "1/2 teaspoon ground black pepper \n" + "\n" + "1- piece green bell pepper sliced into thick strips \n" + "\n" +
                                                        "1- piece red bell pepper sliced into thick strips \n" + "\n" + "1/2 cup cooking oil", "Combine beef, oyster sauce, soy sauce, and ground black pepper. Mix well. Let it stand for 5 minutes. \n" + "\n" +
                                                        "Add cornstarch into the bowl. Mix until all ingredients are well distributed. Set aside. \n" + "\n" + "Heat oil in a pan. Fry bell peppers for 1 minute. Stir occasionally. Remove bell peppers from the pan. Set aside. \n" +
                                                        "\n" + "Using the remaining oil, stir fry marinated beef until it starts to brown. \n" + "\n" + "Add fried bell peppers and toss until all ingredients are distributed. \n" + "\n" +
                                                        "Transfer beef stir fry to a serving plate. \n" + "\n" + "Serve with rice. Share and enjoy!", R.drawable.beefkaldereta));
        beefRecipeDataArrayList.add(new BeefRecipeData("Beef Asado", "Filipino piquant beef stew with potato and carrot.", "3 1/2 lbs. beef chuck \n" + "\n" + "1 piece Knorr Beef Cube \n" + "\n" + "8 ounces tomato sauce \n" + "\n" +
                                                        "3 cups water \n" + "\n" + "6 tablespoons soy sauce \n" + "\n" + "1 1/2 tablespoons white vinegar \n" + "\n" + "2 teaspoons whole peppercorn crushed \n" + "\n" + "4 pieces bay leaves dried \n" + "\n" + "1/2-piece lemon \n" +
                                                        "\n" + "2 tablespoons tomato paste \n" + "\n" + "3 tablespoons butter \n" + "\n" + "1/2 cup cooking oil \n" + "\n" + "1 piece onion chopped \n" + "\n" + "4 cloves garlic chopped",
                                                        "Combine beef, crushed peppercorn, soy sauce, vinegar, dried bay leaves, lemon, and tomato sauce. Mix well. Marinate beef or at least 30 minutes. \n" + "\n" +
                                                        "Put the marinated beef in a cooking pot along with remaining marinade. Add water. Let boil. \n" + "\n" + "Add Knorr Beef Cube. Stir. Cover the pot and cook for 40 minutes in low heat. \n" + "\n" +
                                                        "Turn the beef over. Add tomato paste. Continue cooking until beef tenderizes. Set aside. \n" + "\n" + "Heat oil in pan. Fry the potato until it browns. Turnover and continue frying the opposite side. Remove from the pan and place on a clean plate. Do the same with the carrots. \n" +
                                                        "\n" + "Save 3 tablespoons of cooking oil from the pan where the potato was fried. Sauté onion and garlic until onion softens. \n" + "\n" + "Pour-in the sauce from the beef stew. Let boil. Add the beef. Cook for 2 minutes. \n" +
                                                        "\n" + "Add butter and let it melt. Continue cooking until the sauce reduces to half. \n" + "\n" + "Remove the beef from the pan. Slice into serving pieces. Arrange on a serving plate with fried potato and carrot. Top with remaining sauce. \n" + "\n" + "Serve warm with rice. Share and enjoy!", R.drawable.beefasado));
        beefRecipeDataArrayList.add(new BeefRecipeData("Beef Stir Fry",
                "Quick and easy beef tenderloin stir fry with bell peppers.",
                "1 lb. beef tenderloin thinly sliced \n" + "\n" + "3 tablespoons oyster sauce \n" + "\n" + "1 teaspoon soy sauce \n" + "\n" + "1 ½ tablespoons cornstarch \n" + "\n" + "1/2 teaspoon ground black pepper \n" + "\n" +
                        "1- piece green bell pepper sliced into thick strips \n" + "\n" + "1- piece red bell pepper sliced into thick strips \n" + "\n" + "1/2 cup cooking oil ",
                "Combine beef, oyster sauce, soy sauce, and ground black pepper. Mix well. Let it stand for 5 minutes. \n" + "\n" + "Add cornstarch into the bowl. Mix until all ingredients are well distributed. Set aside. \n" + "\n" +
                        "Heat oil in a pan. Fry bell peppers for 1 minute. Stir occasionally. Remove bell peppers from the pan. Set aside. \n" + "\n" + "Using the remaining oil, stir fry marinated beef until it starts to brown. \n" +
                        "\n" + "Add fried bell peppers and toss until all ingredients are distributed. \n" + "\n" + "Transfer beef stir fry to a serving plate. \n" + "\n" + "Serve with rice. Share and enjoy! ", R.drawable.stirfrybeef));
        setBeefRecipeRecyclerView(beefRecipeDataArrayList);

    }

    private void setBeefRecipeRecyclerView(ArrayList<BeefRecipeData> beefRecipeDataArrayList) {

        beefRecipeRecyclerView =findViewById(R.id.recipeSelectionRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        beefRecipeRecyclerView.setLayoutManager(layoutManager);
        beefRecipeAdapter = new BeefRecipeAdapter(this, beefRecipeDataArrayList);
        beefRecipeRecyclerView.setAdapter(beefRecipeAdapter);
    }
}