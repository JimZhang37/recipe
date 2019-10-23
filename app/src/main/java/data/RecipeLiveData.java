package data;

import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import utilities.NetworkUtils;

public class RecipeLiveData extends LiveData<List<Recipe>> {

    //TODO (1) download Recipe lists

    public RecipeLiveData() {
        super();
        loadData();
    }

    private void loadData(){

        new  AsyncTask<Void, Void, List<Recipe>>() {
            @Override
            protected List<Recipe> doInBackground(Void... type) {

                String movieSearchResults = null;

                try {
                    movieSearchResults = NetworkUtils.getResponseFromHttpUrl();

                } catch (IOException e) {
                    e.printStackTrace();
                }


                Gson gson = new Gson();

                TypeToken<ArrayList<Recipe>> token = new TypeToken<ArrayList<Recipe>>() {};
                ArrayList<Recipe> recipes = gson.fromJson(movieSearchResults, token.getType());


                return recipes;
            }

            @Override
            protected void onPostExecute(List<Recipe> recipes) {
                setValue(recipes);
            }
        }.execute();


    }
}
