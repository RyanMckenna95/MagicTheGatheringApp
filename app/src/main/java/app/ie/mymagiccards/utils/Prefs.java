package app.ie.mymagiccards.utils;

import android.app.Activity;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eoin on 24/02/2018.
 */

//Class to save search
public class Prefs {
    SharedPreferences sharedPreferences;

    public Prefs(Activity activity) {
        sharedPreferences = activity.getPreferences(activity.MODE_PRIVATE);
    }

    public void setSearch(String search){
        sharedPreferences.edit().putString("search", search). commit();
    }

    public String getSearch(){
        return sharedPreferences.getString("search", "cards");
    }

}
