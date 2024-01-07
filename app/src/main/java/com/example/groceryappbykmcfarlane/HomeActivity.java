package com.example.groceryappbykmcfarlane;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.groceryappbykmcfarlane.adapter.CategoryAdapter;
import com.example.groceryappbykmcfarlane.adapter.DiscountedProductAdapter;
import com.example.groceryappbykmcfarlane.adapter.RecentlyViewedAdapter;
import com.example.groceryappbykmcfarlane.adapter.VegetableAdapter;
import com.example.groceryappbykmcfarlane.model.Category;
import com.example.groceryappbykmcfarlane.model.DiscountedProducts;
import com.example.groceryappbykmcfarlane.model.RecentlyViewed;
import com.example.groceryappbykmcfarlane.model.VegrtableItems;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    //navigation drawer
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler, vegetables_recyclerview;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    VegetableAdapter vegetableAdapter;
    List<VegrtableItems> vegrtableItems;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    TextView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);
        recentlyViewedRecycler = findViewById(R.id.recently_item);
        vegetables_recyclerview = findViewById(R.id.vegetables_items);



        // navigation drawer
       /* drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_view) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_camera) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_gallery) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_manage) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_send) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_camera) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_slideshow) {
                    Toast.makeText(HomeActivity.this, "nav view clicked", Toast.LENGTH_SHORT).show();
                }
                    return true;

            }

        });*/




        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, AllCategoryActivity.class);
                startActivity(i);
                finish();
            }
        });

        // adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.first_img));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.second_img));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.third_img));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.fourth_img));
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.first_img));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.second_img));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.third_img));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.fourth_img));

        // adding data to model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.ic_home_fruits));
        categoryList.add(new Category(2, R.drawable.ic_home_fish));
        categoryList.add(new Category(3, R.drawable.ic_home_meats));
        categoryList.add(new Category(4, R.drawable.ic_home_veggies));
        categoryList.add(new Category(5, R.drawable.ic_home_fruits));
        categoryList.add(new Category(6, R.drawable.ic_home_fish));
        categoryList.add(new Category(7, R.drawable.ic_home_meats));
        categoryList.add(new Category(8, R.drawable.ic_home_veggies));
        categoryList.add(new Category(9, R.drawable.ic_home_fruits));
        categoryList.add(new Category(10, R.drawable.ic_home_fish));
        categoryList.add(new Category(11, R.drawable.ic_home_meats));
        categoryList.add(new Category(12, R.drawable.ic_home_veggies));
        categoryList.add(new Category(13, R.drawable.ic_home_fruits));
        categoryList.add(new Category(14, R.drawable.ic_home_fish));
        categoryList.add(new Category(15, R.drawable.ic_home_meats));
        categoryList.add(new Category(16, R.drawable.ic_home_veggies));

        // adding data to model
        recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("Kiwi", "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.", "$ 100", "1", "KG", R.drawable.card4, R.drawable.b4));
        recentlyViewedList.add(new RecentlyViewed("Pineapple", "Pineapple loaded with Nutrients, Its Enzymes can ease Digestion.", "$ 45", "1", "KG", R.drawable.card3, R.drawable.b3));
        recentlyViewedList.add(new RecentlyViewed("Orange", "The Orange is a highly nutritious fruit, loaded with vitamin C.", "$ 30", "1", "KG", R.drawable.card1, R.drawable.b1));
        recentlyViewedList.add(new RecentlyViewed("Apple", "Eating apples can support healthy Weight Loss.", "$ 130", "1", "KG", R.drawable.card2, R.drawable.b2));
        recentlyViewedList.add(new RecentlyViewed("Strawberry", "The Strawberry is a highly nutritious fruit, loaded with vitamin C.", "$ 240", "1", "KG", R.drawable.card5, R.drawable.b5));
        recentlyViewedList.add(new RecentlyViewed("Kiwi", "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.", "$ 100", "1", "KG", R.drawable.card4, R.drawable.b4));
        recentlyViewedList.add(new RecentlyViewed("Pineapple", "Pineapple loaded with Nutrients, Its Enzymes can ease Digestion.", "$ 45", "1", "KG", R.drawable.card3, R.drawable.b3));
        recentlyViewedList.add(new RecentlyViewed("Orange", "The Orange is a highly nutritious fruit, loaded with vitamin C.", "$ 30", "1", "KG", R.drawable.card1, R.drawable.b1));
        recentlyViewedList.add(new RecentlyViewed("Apple", "Eating apples can support healthy Weight Loss.", "$ 130", "1", "KG", R.drawable.card2, R.drawable.b2));
        recentlyViewedList.add(new RecentlyViewed("Strawberry", "The Strawberry is a highly nutritious fruit, loaded with vitamin C.", "$ 240", "1", "KG", R.drawable.card5, R.drawable.b5));

        //vegetable
        vegrtableItems = new ArrayList<>();
        vegrtableItems.add(new VegrtableItems("Broccoli","Broccoli is a good source of vitamin K and calcium.","$ 100", "1","KG",R.drawable.v2,R.drawable.vegi2));
        vegrtableItems.add(new VegrtableItems("Tomato","Tomato are the major dietary source of the antioxidant lycopene.","$ 40", "1","KG",R.drawable.v1,R.drawable.vegi1));
        vegrtableItems.add(new VegrtableItems("Brinjal","Brinjal is good for Diabetics. Brinjal has a Glycemic Index of 15 which is low","$ 30", "1","KG",R.drawable.v3,R.drawable.vegi3));
        vegrtableItems.add(new VegrtableItems("Capsicum","Capsicum is a good for your heart. Improves metabolism","$ 50", "1","KG",R.drawable.v4,R.drawable.vegi4));
        vegrtableItems.add(new VegrtableItems("Broccoli","Broccoli is a good source of vitamin K and calcium.","$ 100", "1","KG",R.drawable.v2,R.drawable.vegi2));
        vegrtableItems.add(new VegrtableItems("Tomato","Tomato are the major dietary source of the antioxidant lycopene.","$ 40", "1","KG",R.drawable.v1,R.drawable.vegi1));
        vegrtableItems.add(new VegrtableItems("Brinjal","Brinjal is good for Diabetics. Brinjal has a Glycemic Index of 15 which is low","$ 30", "1","KG",R.drawable.v3,R.drawable.vegi3));
        vegrtableItems.add(new VegrtableItems("Capsicum","Capsicum is a good for your heart. Improves metabolism","$ 50", "1","KG",R.drawable.v4,R.drawable.vegi4));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);
        setVegetableRecycler(vegrtableItems);

    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }


    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }

    private void setVegetableRecycler(List<VegrtableItems> vegrtableItems) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        vegetables_recyclerview.setLayoutManager(layoutManager);
        vegetableAdapter = new VegetableAdapter(this,vegrtableItems);
        vegetables_recyclerview.setAdapter(vegetableAdapter);
    }
}