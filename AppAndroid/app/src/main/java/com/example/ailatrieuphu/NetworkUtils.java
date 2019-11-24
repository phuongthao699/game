package com.example.ailatrieuphu;

import android.net.Uri;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {
    private  static final String BASE_URL = "http://10.0.2.2:8000/";
    static String convertToString(InputStream stream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder builder = new StringBuilder();
        String line;
        try{
            while((line = reader.readLine())!=null){
                builder.append(line +"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null)
            {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if(builder.length()==0)
            return null;
        else
            return builder.toString();

    }
    static String getJSONData(String uri, String method){
        HttpURLConnection urlConnection= null;
        String jsonString= null;
        Uri BuiltURI= Uri.parse(BASE_URL+ uri).buildUpon().build();
        try{
            URL requestURL= new URL(BuiltURI.toString());
            urlConnection= (HttpURLConnection) requestURL.openConnection();
            urlConnection.setRequestMethod(method);
            urlConnection.connect();
            // get inputStream
            InputStream inputStream = urlConnection.getInputStream();
            jsonString = convertToString(inputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(urlConnection != null)
            {
                urlConnection.disconnect();
            }
        }
        Log.d("Test", jsonString);
        return jsonString;
    }
}

