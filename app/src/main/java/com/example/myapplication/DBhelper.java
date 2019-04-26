package com.example.myapplication;

import android.provider.ContactsContract;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DBhelper {

    public DBhelper(){
        LitePal.getDatabase();
    }
}

