package model;

import androidx.lifecycle.ViewModel;

import data.RecipeLiveData;

public class MainActivityViewModel extends ViewModel {
    private RecipeLiveData mRecipeLiveData;

    public MainActivityViewModel() {
        this.mRecipeLiveData = new RecipeLiveData();
    }
    //TODO a copy of recipe in view model


    public RecipeLiveData getData(){
        return mRecipeLiveData;
    }
}
