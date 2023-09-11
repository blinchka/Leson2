package ru.mirea.kiushkinaaa.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button myFio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFio = findViewById(R.id.FIO);

    }

    public void goToBrawse(View view){
        Uri address = Uri.parse("https://www.google.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW);
        openLinkIntent.setData(address);
        startActivity(openLinkIntent);
    }

    public void sendFIO(View view){
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Тимонин Григорий Сергеевич");
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
    }

}