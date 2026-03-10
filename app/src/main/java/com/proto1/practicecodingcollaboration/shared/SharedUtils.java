package com.proto1.practicecodingcollaboration.shared;

import android.content.Context;
import android.widget.Toast;

public class SharedUtils {
    public static void showSharedMessage(Context context, String message) {
        Toast.makeText(context, "Collaboration: " + message, Toast.LENGTH_SHORT).show();
    }
}
