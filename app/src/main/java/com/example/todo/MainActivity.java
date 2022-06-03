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
    EditText et;
    CheckBox checkbox;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = (CheckBox) findViewById(R.id.checkBox1);
        txt = (TextView)findViewById(R.id.result);
        checkbox.setOnCheckedChangeListener(this);
    }


     public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              String s = "";
              int i = 0;

              if(checkbox.isChecked()){
                  s = et.getText().toString() + "\n";
              }

              txt.setText(s);

          }

    public void onBtnClick(View View){
        et = (EditText)findViewById(R.id.editText);
        TextView text1 = (TextView)findViewById(R.id.textView4);

        text1.setText(et.getText().toString());

    }
}
