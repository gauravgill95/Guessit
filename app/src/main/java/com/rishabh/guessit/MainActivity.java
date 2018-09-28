package com.rishabh.guessit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randNumber;
    int count=0;
    public void Click(View view){
        EditText editText = (EditText) findViewById(R.id.EditText1);
        TextView editText1 =(TextView) findViewById(R.id.Text0);

        int guess = Integer.parseInt(editText.getText().toString());
        editText1.setText(Integer.toString(count));
        if (guess > randNumber){
            Toast.makeText(MainActivity.this, "Lower !!", Toast.LENGTH_SHORT).show();
            count++;
            editText1.setText(Integer.toString(count));
        }else if (guess < randNumber ){
            Toast.makeText(MainActivity.this, "Higher !!", Toast.LENGTH_SHORT).show();
            count++;
            editText1.setText(Integer.toString(count));
        }else {
            Toast.makeText(MainActivity.this, "YOU ARE RIGHT!! Guess again ", Toast.LENGTH_SHORT).show();
            Random rand = new Random();
            randNumber = rand.nextInt(20) + 1;
            count++;
            editText1.setText(Integer.toString(count));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randNumber = rand.nextInt(20) + 1;
        TextView editText1 =(TextView) findViewById(R.id.Text0);
        editText1.setText("0");
        count=0;
    }
}
