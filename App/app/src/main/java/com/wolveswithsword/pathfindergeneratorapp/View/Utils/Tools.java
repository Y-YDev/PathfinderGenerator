package com.wolveswithsword.pathfindergeneratorapp.View.Utils;

import android.content.Context;
import android.widget.Toast;

public class Tools {

    private static Toast toast;

    public static void ShowToast(Context mcontext, String text) {
        if (toast != null)
            toast.cancel();
        toast = Toast.makeText(mcontext, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
