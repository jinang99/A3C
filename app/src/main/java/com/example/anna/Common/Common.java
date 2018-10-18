package com.example.anna.Common;

import com.example.anna.User;

public class Common {
    public static User currentUser;
    public static String convertCodeToStatus(String status) {
        if(status.equals("0"))
        {
            return "Placed";
        }
        else if(status.equals("1"))
        {
            return "Dispatched";
        }
        else
        {
            return "Shipped";
        }
    }
}
