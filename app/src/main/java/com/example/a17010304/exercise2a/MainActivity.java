package com.example.a17010304.exercise2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView info;
    ArrayList<EmployeeInfo> alEmployeeList;
    CustomAdapter caList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = findViewById(R.id.lvView);

        alEmployeeList = new ArrayList<>();
        EmployeeInfo info1 = new EmployeeInfo("John", "Software Technical Leader", 3400.0);
        EmployeeInfo info2 = new EmployeeInfo("May", "Progammer", 2200.0);
        alEmployeeList.add(info1);
        alEmployeeList.add(info2);

        caList = new CustomAdapter(this, R.layout.employee_info,alEmployeeList);

        info.setAdapter(caList);


    }
}
