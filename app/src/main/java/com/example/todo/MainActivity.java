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

    /**
     *     @Override
     *
     *
     *
     *         todo = (CheckBox)findViewById(R.id.checkBox);
     *         todo2 = (CheckBox)findViewById(R.id.checkBox2);
     *         todo3 = (CheckBox)findViewById(R.id.checkBox3);
     *
     *         result = (TextView)findViewById(R.id.textView);
     *
     *         //
     *         todo.setOnCheckedChangeListener(this);
     *         todo2.setOnCheckedChangeListener(this);
     *         todo3.setOnCheckedChangeListener(this);
     *
     *
     *     }
     * @param
     */

          public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              String s = "";
              int i = 0;

              if(checkbox.isChecked()){
                  s = et.getText().toString() + "\n";
              }

              txt.setText(s);

              /**
               *               if(todo.isChecked()){
               *                   i++;
               *                   s += i + ". " + "끝내주게 숨쉬기\n";
               *               }
               *               if(todo2.isChecked()){
               *                   i++;
               *                   s += i + ". " + "간지나게 자기\n";
               *               }
               *               if(todo3.isChecked()){
               *                   i++;
               *                   s += i + ". " + "작살나게 밥먹기\n";
               *               }
               *
               *               result.setText(s);
               */


          }

    public void onBtnClick(View View){
        et = (EditText)findViewById(R.id.editText);
        TextView text1 = (TextView)findViewById(R.id.textView4);

        text1.setText(et.getText().toString());

    }
}