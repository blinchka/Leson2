package ru.mirea.kiushkinaaa.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }



    public void showToast(View view){
        String number = Integer.toString(editText.getText().toString().length());
        Toast toast = Toast.makeText(getApplicationContext(),
                "«СТУДЕНТ No 9 ГРУППА БСБО-07-21 Количество символов - " + (String) number + " ».",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}