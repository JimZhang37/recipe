package com.example.recipe.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.TokenWatcher;
import android.widget.Toast;

import com.example.recipe.R;

import model.MainActivityViewModel;
import model.RecipeAdapter;

public class MainActivity extends AppCompatActivity implements RecipeAdapter.ListItemClickListener {
    private RecyclerView mRecipeListRV;
    MainActivityViewModel model;
    RecipeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecipeListRV = (RecyclerView) findViewById(R.id.recipe_list_rv);
        mRecipeListRV.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);        mRecipeListRV.setLayoutManager(layoutManager);

        mAdapter = new RecipeAdapter(this);

        mRecipeListRV.setAdapter(mAdapter);

        model = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        model.getData().observe(this, data -> {
            mAdapter.setData(data);
        });

    }

    //TODO show recipes in a recycler view


    @Override
    public void onListItemClick(int clickedItemIndex) {
//TODO go to recipe activity for small screen or show recipe in wider screen
        Toast n = Toast.makeText(this, "abc " +String.valueOf(clickedItemIndex), 5);
        n.show();
    }
}
