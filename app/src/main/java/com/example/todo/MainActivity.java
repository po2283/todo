package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox todo;
    CheckBox todo2;
    CheckBox todo3;

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todo = (CheckBox)findViewById(R.id.checkBox);
        todo2 = (CheckBox)findViewById(R.id.checkBox2);
        todo3 = (CheckBox)findViewById(R.id.checkBox3);

        result = (TextView)findViewById(R.id.textView);

        //
        todo.setOnCheckedChangeListener(this);
        todo2.setOnCheckedChangeListener(this);
        todo3.setOnCheckedChangeListener(this);

        /**
         *        todo.setOnClickListener(new CheckBox.OnClickListener() {
         *             String s1 = "";
         * String을 이용해서 
         *             @Override
         *             public void onClick(View v) {
         *                 if(todo.isChecked()){
         *                     s1 += "끝내주게 숨쉬기\n";
         *                 }else{
         *                     s1 = "";
         *                 }
         *             }
         *
         *         });
         *
         *         todo2.setOnClickListener(new CheckBox.OnClickListener() {
         *             String s2 = "";
         *             @Override
         *             public void onClick(View v) {
         *                 if(todo2.isChecked()){
         *                     s2 += "간지나게 자기\n";
         *                 }else{
         *                     s2 = "";
         *                 }
         *             }
         *         });
         *
         *         todo3.setOnClickListener(new CheckBox.OnClickListener() {
         *             String s3 = "";
         *             @Override
         *             public void onClick(View v) {
         *                 if(todo3.isChecked()){
         *                     s3 += "작살나게 밥먹기\n";
         *                 }else{
         *                     s3 = "";
         *                 }
         *             }
         *         });
         *
         *         result.setText(s1);
         */

    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String s = "";
        int i = 0;

        if(todo.isChecked()){
            i++;
            s += i + ". " + "끝내주게 숨쉬기\n";
        }
        if(todo2.isChecked()){
            i++;
            s += i + ". " + "간지나게 자기\n";
        }
        if(todo3.isChecked()){
            i++;
            s += i + ". " + "작살나게 밥먹기\n";
        }

        result.setText(s);

    }
}