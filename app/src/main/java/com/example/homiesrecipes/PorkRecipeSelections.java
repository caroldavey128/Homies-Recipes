package com.example.homiesrecipes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.homiesrecipes.Adapter.PorkRecipeAdapter;
import com.example.homiesrecipes.Model.PorkRecipeData;


import java.util.ArrayList;

public class PorkRecipeSelections extends AppCompatActivity {
    PorkRecipeAdapter porkRecipeAdapter;
    RecyclerView porkRecipeRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_selections);

        ArrayList<PorkRecipeData> porkRecipeDataArrayList = new ArrayList<>();
        porkRecipeDataArrayList.add(new PorkRecipeData("Pork Adobo with Tokwa and Tausi",
                "Filipino pork adobo with salted black beans and fried tofu and a side of garlic fried rice with adobo sauce.",
                "1 1/2 lbs. pork cubed \n" + "\n" + "2 pieces tofu cubed and fried \n" + "\n" + "1 teaspoon brown sugar \n" + "\n" + "10 cloves garlic crushed \n" + "\n" +
                        "3 tablespoons salted black beans \n" + "\n" + "4 pieces dried bay leaves \n" + "\n" + "1 teaspoon whole peppercorn \n" + "\n" + "5 tablespoons soy sauce \n" +
                        "\n" + "4 tablespoons vinegar \n" + "\n" + "1 1/2 cups water \n" + "\n" + "5 tablespoons cooking oil ",
                "Prepare the toasted garlic by heating oil in a pan. Add crushed garlic while oil is heating up. Cook in low heat until garlic turns golden brown. Set aside. Note: the oil used to cook the garlic turns to garlic oil. \n" +
                        "\n" + "Heat half of the garlic oil in a pan. Sauté pork until light brown. \n" + "\n" + "Pour soy sauce and vinegar. Let boil. \n" + "\n" + "Add salted black beans and water. Cover and cook for 40 minutes or until pork gets tender. \n" +
                        "\n" + "Add fried tofu and sugar. Stir and cook for 3 minutes. Transfer to a serving plate. \n" + "\n" + "Prepare the fried rice by combining salt and rice. Mix gently. \n" +
                        "\n" + "Heat the remaining toasted garlic and oil in a pan. Add rice. Pour-in adobo sauce. Stir-fry for 3 to 5 minutes. \n" + "\n" + "Serve with pork adobo. Enjoy! ", R.drawable.porkadobo));
        porkRecipeDataArrayList.add(new PorkRecipeData("Pork Humba with Tokwa",
                "Pork belly stewed in soy sauce, pineapple juice, and vinegar with salted black beans and fried tofu.",
                "1 1/2 lbs. pork belly cubed \n" + "\n" + "1 cup pineapple juice \n" + "\n" + "10 ounces extra firm tofu cubed \n" + "\n" + "1/4 cup soy sauce \n" + "\n" +
                        "2 tablespoons white vinegar \n" + "\n" + "6 tablespoons brown sugar \n" + "\n" + "4 tablespoons salted black beans \n" + "\n" + "1 piece onion chopped \n" + "\n" + "6 cloves garlic crushed and chopped \n" +
                        "\n" + "1 piece star anise \n" + "\n" + "1 cup water \n" + "\n" + "1/4 teaspoon ground black pepper \n" + "\n" + "1 1/2 cups cooking oil ",
                "Heat cooking oil in a wok or cooking pot. Add tofu. Deep fry until outer part turns golden brown and crisp. Remove from the wok. Set aside. \n" + "\n" +
                        "Transfer 3 tablespoons cooking oil used to fry tofu on a clean pan. Heat and sauté garlic until it starts to brown. Add onion. Continue sauteing until the later softens. \n" +
                        "\n" + "Add pork. Cook until the outer part turns light brown. \n" + "\n" + "Pour soy sauce. Continue sauteing until liquid reduces to half. \n" + "\n" + "Add pineapple juice and vinegar. Cover and let boil. \n" +
                        "\n" + "Stir and then add salted black beans. Cover once more. Continue cooking between low to medium heat for 35 minutes. \n" + "\n" + "Add water and brown sugar. Cook on a covered pan until pork gets very tender. Note: I usually cook it for 40 minutes in low heat. \n" + "\n" +
                        "Add star anise. Cook for 5 minutes. Remove star anise from the wok. \n" + "\n" + "Season with ground black pepper and then add fried tofu. Stir and cook for 2 minutes. \n" +
                        "\n" + "Transfer to a serving bowl. Serve. \n" + "\n" + "Share and enjoy! ", R.drawable.porkhumba));
        porkRecipeDataArrayList.add(new PorkRecipeData("Tokwat Baboy",
                "A dish composed of boiled pork (either or both pig’s ears and pork belly usually) and fried tofu. The sauce made of vinegar and soy sauce gives life to this dish.",
                "1 lb. pig ears \n" + "\n" + "1 lb. pork belly liempo \n" + "\n" + "1 lb. tofu extra firm tofu \n" + "\n" + "1 1/2 cup white vinegar \n" + "\n" + "1/4 cup soy sauce \n" +
                        "\n" + "1 tablespoon sugar \n" + "\n" + "1 tablespoon salt \n" + "\n" + "1 tablespoon whole peppercorn \n" + "\n" + "1 piece onion sliced \n" + "\n" + "2 stalks scallions cut in 1/2-inch length \n" +
                        "\n" + "1/8 teaspoon ground black pepper \n" + "\n" + "5 cups water \n" + "\n" + "2 cups cooking oil ",
                "Pour-in water in a pot and bring to a boil \n" + "\n" + "Add salt and whole peppercorn \n" + "\n" + "Put-in the pig's ears and pork belly then simmer until tender (about 30 mins to 1 hour) \n" +
                        "\n" + "Pour cooking oil on a separate pan and allow to heat \n" + "\n" + "When the oil is hot enough, deep-fry the tofu until color turns golden brown and outer texture is crispy \n" + "\n" +
                        "Cube the fried tofu and slice the boiled pig's ears and pork belly into bite-sized pieces then set aside \n" + "\n" + "Combine the sugar, salt, soy sauce, and vinegar in bowl. Stir. \n" + "\n" +
                        "Microwave for 1 minute. \n" + "\n" + "Add the ground black pepper, onions, green onions, and chili pepper. Transfer the sauce in a serving bowl. \n" + "\n" +
                        "Place the sliced meat and tofu in a serving plate with the bowl of sauce by the side \n" + "\n" + "Serve hot! Share and enjoy! ", R.drawable.tokwataboy));
        porkRecipeDataArrayList.add(new PorkRecipeData("Sinigang na Baboy with Gabi",
                "This is a recipe for pork belly soup cooked in sour broth. It makes use of a variety of vegetables and is best when served hot with a cup of rice on the side.",
                "2 lbs. pork belly sliced into cubes \n" + "\n" + "2 to 3 cups kangkong leaves \n" + "\n" + "3 pieces long green chili pepper siling pansigang \n" + "\n" +
                        "2 pieces tomato quartered \n" + "\n" + "1 cup sliced daikon radish labanos \n" + "\n" + "10 to 12 pieces snake beans cut in 2-inch length pieces \n" + "\n" + "1 piece onion quartered \n" +
                        "\n" + "15 pieces okra \n" + "\n" + "2 pieces taro peeled and cut in half (gabi) \n" + "\n" + "8 cups water \n" + "\n" + "2 packs Knorr Sinigang sa Sampaloc Mix Original (20-gram pack) \n" +
                        "\n" + "3 tablespoons fish sauce patis \n" + "\n" + "¼ teaspoon ground black pepper ",
                "Pour water into a cooking pot. Let boil \n" + "\n" + "Add onion and tomato. Boil for 5 to 8 minutes. \n" + "\n" + "Put the pork in the cooking pot. Boil for 25 minutes. \n" + "\n" +
                        "Add the taro. Cover and continue to boil for 30 minutes. \n" + "\n" + "Add Knorr Sinigang sa Sampaloc mix, fish sauce, and ground black pepper; stir. \n" + "\n" + "Put the daikon radish in. Cook for 3 to 5 minutes. \n" +
                        "\n" + "Add the chili peppers, okra, and snake beans. Cook for 7 minutes. \n" + "\n" + "Add the kangkong. Cover the cooking pot and turn off the heat. Let it stay covered for 5 minutes. \n" +
                        "\n" + "Transfer to as serving bowl. Serve with a small bowl with patis and spicy chili. \n" + "\n" + "Share and enjoy! ", R.drawable.sinigangnababoy));
        setPorkRecipeRecyclerView(porkRecipeDataArrayList);

    }

    private void setPorkRecipeRecyclerView(ArrayList<PorkRecipeData> porkRecipeDataArrayList) {

        porkRecipeRecyclerView =findViewById(R.id.recipeSelectionRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        porkRecipeRecyclerView.setLayoutManager(layoutManager);
        porkRecipeAdapter = new PorkRecipeAdapter(this, porkRecipeDataArrayList);
        porkRecipeRecyclerView.setAdapter(porkRecipeAdapter);
    }
}
