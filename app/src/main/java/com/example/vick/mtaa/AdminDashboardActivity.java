package com.example.vick.mtaa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class AdminDashboardActivity extends AppCompatActivity {

    CardView cardHomes, cardPlots, cardApartments, cardSales, cardSupport, cardAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        //Join UI to Logic
        cardHomes = findViewById(R.id.cardHomes);
        cardPlots = findViewById(R.id.cardPlots);
        cardApartments = findViewById(R.id.cardApartments);
        cardSales = findViewById(R.id.cardSales);
        cardSupport = findViewById(R.id.cardSupport);
        cardAbout = findViewById(R.id.cardAbout);

        //Method calls
        cardHomesClicked();
        cardPlotsClicked();
        cardApartmentsClicked();
        cardSalesClicked();
        cardSupportClicked();
        cardAboutClicked();
    }

    public void cardHomesClicked() {
        cardHomes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardHomes.setCardElevation(15);
                cardHomes.animate().rotationBy(360);
                cardHomes.animate().alphaBy(10);
                cardHomes.setRadius(20);
                cardHomes.setPadding(2, 2, 2, 2);


                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSupport.setCardElevation(0);
                cardSupport.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

            }
        });
    }

    public void cardPlotsClicked() {
        cardPlots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardPlots.setCardElevation(15);
                cardPlots.animate().rotationBy(360);
                cardPlots.setRadius(20);


                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSupport.setCardElevation(0);
                cardSupport.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

            }
        });
    }

    public void cardApartmentsClicked() {
        cardApartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardApartments.setCardElevation(15);
                cardApartments.animate().rotationBy(360);
                cardApartments.animate().alphaBy(10);
                cardApartments.setRadius(20);


                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSupport.setCardElevation(0);
                cardSupport.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

            }
        });
    }

    public void cardSalesClicked() {
        cardSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardSales.setCardElevation(15);
                cardSales.animate().rotationBy(360);
                cardSales.animate().alphaBy(10);
                cardSales.setRadius(20);


                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSupport.setCardElevation(0);
                cardSupport.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

            }
        });
    }


    public void cardSupportClicked() {
        cardSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardSupport.setCardElevation(15);
                cardSupport.animate().rotationBy(360);
                cardSupport.animate().alphaBy(10);
                cardSupport.setRadius(20);


                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

            }
        });
    }


    public void cardAboutClicked() {
        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAbout.setCardElevation(15);
                cardAbout.animate().rotationBy(360);
                cardAbout.animate().alphaBy(10);
                cardAbout.setRadius(20);


                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSupport.setCardElevation(0);
                cardSupport.setRadius(0);

            }
        });
    }

}
