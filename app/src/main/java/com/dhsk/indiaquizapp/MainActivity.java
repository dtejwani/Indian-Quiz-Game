package com.dhsk.indiaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int flag=0;
    int score=0;
    int ques=1;

    int num=0;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.threetrue:
                if (checked)
                    flag=1;
                    break;
            case R.id.threefalse:
                if (checked)
                    flag=0;
                    break;
        }
    }
    public void Submit_Answers(View v){
        if(flag==1){score++;}
        CheckBox checkone=(CheckBox) findViewById(R.id.checkone);
        CheckBox checktwo=(CheckBox) findViewById(R.id.checktwo);
        CheckBox checkthree = (CheckBox) findViewById(R.id.checkthree);
        if(checkthree.isChecked()){ num=1;}
        if ((checkone.isChecked())&&(checktwo.isChecked())&&(num==0)){ score++;}

        EditText nameText=(EditText) findViewById(R.id.ansone);
        String ansone = nameText.getText().toString();
        String one="1947";
        if(ansone.equals(one)){score++;}
        EditText anstwoo=(EditText) findViewById(R.id.anstwo);
        String anstwo = anstwoo.getText().toString();
        String two="BABUR";
        if(anstwo.equalsIgnoreCase(two)){score++;}
        EditText ansfivee=(EditText) findViewById(R.id.ansfive);
        String ansfive = ansfivee.getText().toString();
        String five="GANDHI";
        if(ansfive.equalsIgnoreCase(five)){score++;}
        Toast.makeText(this,"You scored "+ score+" in the quiz", Toast.LENGTH_SHORT).show();
        score=0;


    }
}
