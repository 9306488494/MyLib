package com.example.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

import static android.content.Context.TELEPHONY_SERVICE;

public class Libs {

    @SuppressLint("HardwareIds")
    public static String IMEI(Context context) {
        String IMEI = null;
        // collect IMEI no
        TelephonyManager tm = (TelephonyManager) context.getSystemService(TELEPHONY_SERVICE);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (ActivityCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return IMEI;
            }
            assert tm != null;
            IMEI = tm.getImei();
        } else {
            assert tm != null;
            IMEI = tm.getDeviceId();
         

        }
        return IMEI;
    }

    // read more
    public static String ReadMore(String data, String noOfDigit) {
        String Mydata=data.substring(0,Integer.parseInt(noOfDigit));
        return Mydata;
    }

    // return number of adults array
    public static String[] getAdults(Context context) {
        // collect imei details
        String[] adults = { "Choose", "1", "2", "3", "4", "5", "6", "7", "8","9"};
        return adults;
    }

    // return position of adults array
    public static String getAdultsPos(Context context, int position) {
        // collect imei details
        String[] adults = { "Choose", "1", "2", "3", "4", "5", "6", "7", "8","9"};
        return adults[position];
    }

    // return position of childs array
    public static String[] getChild(Context context) {
        // collect imei details
        String[] child = { "Choose","0", "1", "2", "3"};
        return child;
    }

    // return number of childs array
    public static String getChildPos(Context context, int position) {
        // collect imei details
        String[] child = { "Choose","0", "1", "2", "3"};
        return child[position];
    }

    // return number of infants array
    public static String[] getInfants(Context context) {
        // collect imei details
        String[] infants = { "Choose","0", "1", "2", "3"};
        return infants;
    }

    // return position of infants array
    public static String getInfantsPos(Context context, int position) {
        // collect imei details
        String[] infants = { "Choose","0", "1", "2", "3"};
        return infants[position];
    }

    // return number of classes array
    public static String[] getClasses(Context context) {
        // collect imei details
        String[] classes = { "Choose","Economy", "Premium Economy", "Business", "First"};
        return classes;
    }

    // return position of classes array
    public static String getClassesPos(Context context, int position) {
        // collect imei details
        String[] classes = { "Choose","Economy", "Premium Economy", "Business", "First"};
        return classes[position];
    }

    // return names of the Month
    public static String[] getMonth(Context context) {
        // collect imei details
        String[] month = { "Choose", "January", "February", "March", "April", "May", "June", "July", "August","September","October","November","December"};
        return month;
    }

    // return names of the Month
    public static String getMonthPos(Context context, int position) {
        // collect imei details
        String[] month = { "Choose", "January", "February", "March", "April", "May", "June", "July", "August","September","October","November","December"};
        return month[position];
    }
    // return names of the Days
    public static String[] getDays(Context context) {
        // collect imei details
        String[] days = { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days;
    }
    // return position of the Days
    public static String getDaysPos(Context context, int position) {
        // collect imei details
        String[] days = { "Choose", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[position];
    }


}
