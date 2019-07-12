package com.example.lib;

import android.widget.TextView;

public class Lib1 {
    // read more
    public void ReadMore(TextView txtView, String data, String noOfDigit) {
        txtView.setText(data.substring(0, Integer.parseInt(noOfDigit)));
    }

}
