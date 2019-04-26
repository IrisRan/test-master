package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

import com.desai.vatsal.mydynamiccalendar.MyDynamicCalendar;

@SuppressLint({ "SetJavaScriptEnabled", "JavascriptInterface" })
public class NoteEditActivity extends AppCompatActivity {

    private MyDynamicCalendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_note);
        myCalendar = (MyDynamicCalendar) findViewById(R.id.myCalendar);

        myCalendar.setCalendarBackgroundColor("#eeeeee");
        myCalendar.setHeaderBackgroundColor("#454265");
        myCalendar.setHeaderTextColor("#ffffff");
        myCalendar.setNextPreviousIndicatorColor("#245675");
        myCalendar.setWeekDayLayoutBackgroundColor("#965471");
        myCalendar.setWeekDayLayoutTextColor("#246245");
        myCalendar.setExtraDatesOfMonthBackgroundColor("#324568");
        myCalendar.setExtraDatesOfMonthTextColor("#756325");
        myCalendar.setDatesOfMonthBackgroundColor("#145687");
        myCalendar.setDatesOfMonthTextColor("#745632");
        myCalendar.setCurrentDateBackgroundColor(R.color.black);
        myCalendar.setCurrentDateTextColor("#00e600");
        myCalendar.setBelowMonthEventTextColor("#425684");
        myCalendar.setBelowMonthEventDividerColor("#635478");

        //管理事件
        myCalendar.setEventCellBackgroundColor("#852365");
        myCalendar.setEventCellTextColor("#425684");

        // Add event  -  addEvent(event_date, event_start_time, event_end_time, event_title)
        myCalendar.addEvent("5-10-2016", "8:00", "8:15", "Today Event 1");
        myCalendar.addEvent("05-10-2016", "8:15", "8:30", "Today Event 2");
        myCalendar.addEvent("05-10-2016", "8:30", "8:45", "Today Event 3");

        // show day view
        myCalendar.showDayView();


        //设置 缓存模式
        //
        //myWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        // 开启 DOM storage API 功能
        //
        //这样你就可以在返回前一个页面的时候不刷新了

    }




}
