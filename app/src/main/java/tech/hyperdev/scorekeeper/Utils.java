package tech.hyperdev.scorekeeper;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Maouusama on 7/19/2017.
 */

public class Utils {
    private static int sTheme;

    public final static int THEME_DAY = 0;
    public final static int THEME_NIGHT = 1;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_DAY:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_NIGHT:
                activity.setTheme(R.style.BlackTheme);
                break;
        }
    }

}
