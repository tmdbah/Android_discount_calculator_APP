package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ---------------------------- [ Button handlers ] --- //

        findViewById(R.id.buttonDiscount5).setOnClickListener(this);
        findViewById(R.id.buttonDiscount10).setOnClickListener(this);
        findViewById(R.id.buttonDiscount15).setOnClickListener(this);
        findViewById(R.id.buttonDiscount20).setOnClickListener(this);
        findViewById(R.id.buttonDiscount50).setOnClickListener(this);
        findViewById(R.id.buttonClear).setOnClickListener(this);
    }

    // -------------------------- [ implements View.OnClickListener ] ---- //

    @Override
    public void onClick(View view) {

        // ------------------------------------ [ find Views By Id ] ---- //

        EditText ticketPrice = findViewById(R.id.editTextNumber); // EditTextNumber Only Takes Numbers
        TextView discountedPrice = findViewById(R.id.textViewDiscountedPriceResult);
        TextView discountPercent = findViewById(R.id.textViewDiscountedPercentResult);

        // ------------------ [ d is used to Parse to Double ] --- //
        double d = 0; //
        double price = 0;

        try {
            d = Double.parseDouble(ticketPrice.getText().toString());
        } catch (Exception e) {
            Log.d("Error",e.toString()); // Log e to console, display e as string
        }

        if(view.getId() == R.id.buttonDiscount5){

            if(ticketPrice.getText().toString().matches("")) {
                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
            } else {
                discountPercent.setText("5%");
                price = d - (d * 0.05);
                discountedPrice.setText(String.format("%.2f", price));
            }
        }

        if(view.getId() == R.id.buttonDiscount10){

            if(ticketPrice.getText().toString().matches("")) {
                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
            } else {
                discountPercent.setText("10%");
                price = d - (d * 0.10);
                discountedPrice.setText(String.format("%.2f", price));
            }
        }

        if(view.getId() == R.id.buttonDiscount15){

            if(ticketPrice.getText().toString().matches("")) {
                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
            } else {
                discountPercent.setText("15%");
                price = d - (d * 0.15);
                discountedPrice.setText(String.format("%.2f", price));
            }
        }

        if(view.getId() == R.id.buttonDiscount20){

            if(ticketPrice.getText().toString().matches("")) {
                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
            } else {
                discountPercent.setText("20%");
                price = d - (d * 0.20);
                discountedPrice.setText(String.format("%.2f", price));
            }
        }

        if(view.getId() == R.id.buttonDiscount50){

            if(ticketPrice.getText().toString().matches("")) {
                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
            } else {
                discountPercent.setText("50%");
                price = d - (d * 0.50);
                discountedPrice.setText(String.format("%.2f", price));
            }
        }

        if(view.getId() == R.id.buttonClear){

            discountPercent.setText("");
            discountedPrice.setText("");


        }

    }
}