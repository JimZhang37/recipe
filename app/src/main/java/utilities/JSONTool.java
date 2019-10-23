package utilities;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import data.Recipe;

public class JSONTool {

    public static ArrayList<Recipe> parseMovieListJson(String json) {
        ArrayList<Recipe> mRecipeList = new ArrayList<Recipe>();
        try {
//            JSONObject jObject = new JSONObject(json);
//
//            int i_total_results = jObject.optInt(TOTAL_RESULTS);
//            JSONArray j_results = jObject.getJSONArray(RESULTS);
//            if (j_results != null) {
//                for (int i = 0; i < j_results.length(); i++) {
//                    JSONObject result = (JSONObject) j_results.get(i);
//                    String movieID = result.getString(ID);
//                    String movieImage = POSTER_Main_PATH + result.getString(POSTER_PATH);
//                    String movieTitle = result.getString(TITLE);
//                    String movieSynopsis = result.getString(SYNOPSIS);
//                    String movieUserRating = result.getString(USER_RATING);
//                    String movieReleaseData = result.getString(RELEASE_DATA);
//                    Movie movie = new Movie(movieID
//                            , movieImage
//                            , movieTitle
//                            , movieSynopsis
//                            , movieUserRating
//                            , movieReleaseData);
//                    mMovieList.add(movie);
//                }
//            }


            return mRecipeList;
        } catch (Exception e) {//TODO replace Exception with JSONException
            e.printStackTrace();
            return null;
        }
    }


}
