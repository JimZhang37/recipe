package utilities;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    private String url = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/baking.json";

    public static URL buildUrl(String movieID) {

//        Uri builtUri = Uri.parse(MOVIE_BASE_URL).buildUpon()
//                .appendPath(movieID)
//                .appendPath(PATH_VIDEOS)
//                .appendQueryParameter(PARAM_APIKEY, API_KEY)
//                .build();
//
        URL url = null;
//        try {
//            url = new URL(builtUri.toString());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        return url;
    }
}
