package utilities;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class NetworkUtils {
    private static String TAG = "NetworkUtils";
    private static String s1 = "http://go.udacity.com/android-baking-app-json";
    private static String s = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/baking.json";

//    public static URL buildUrl() {
//
//        Uri builtUri = Uri.parse(s).buildUpon()
//                .build();
//
//        URL url = null;
//        try {
//            url = new URL(builtUri.toString());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//        return url;
//    }

    /**
     * This method returns the entire result from the HTTP response.
     *
     * @return The contents of the HTTP response.
     * @throws IOException Related to network and stream reading
     */
    public static String getResponseFromHttpUrl() throws IOException {
//        Log.d("getResponseFromHttpUrl", "A new effort to fetch data from network");//I want to know if app make network request everytime configuratioin changes

        Uri builtUri = Uri.parse(s).buildUpon().build();

        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Log.d(TAG, url.toString());
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        Log.d(TAG, urlConnection.toString());
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
