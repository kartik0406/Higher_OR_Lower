package com.pevel.higherorlower;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int s;
    public void generatenum()
    {
        Random rand=new Random();
        s=rand.nextInt(20)+1;
    }
    public void ClickButton(View view){
        EditText edittext=(EditText)findViewById(R.id.editText);
        String num=edittext.getText().toString();
        int n=Integer.parseInt(num);
        String message=" ";
        if(n>s)
        {
              message="Lower";

        }
        else if(n<s)
            message="Higher";


            else if(n==s)
        {
            message="Correct Guess, Try Again!";
            generatenum();
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       generatenum();
    }
}
