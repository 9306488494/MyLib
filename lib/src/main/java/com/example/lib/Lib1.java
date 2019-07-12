package com.example.lib;

import android.widget.TextView;

public class Lib1 {
    // read more
    public static TextView ReadMore(TextView txtView, String data, String noOfDigit) {
        txtView.setText(data.substring(0, Integer.parseInt(noOfDigit)));
        return txtView;
    }

}
