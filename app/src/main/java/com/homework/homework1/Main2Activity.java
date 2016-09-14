package com.homework.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void addtext(View view) {
        EditText userEditText = (EditText) findViewById(R.id.editTextUser);

        Intent in = new Intent(Main2Activity.this, MainActivity.class);
        in.putExtra("mytext", userEditText.getText().toString());

        startActivity(in);
    }
}
