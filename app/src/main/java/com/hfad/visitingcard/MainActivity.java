package com.hfad.visitingcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Contact - Dialing a number
        ImageView contactIcon = findViewById(R.id.ContactID);
        contactIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:+88 01614434451"));  // Replace with your contact number
                startActivity(dialIntent);
            }
        });

        // Gmail - Composing an email
        ImageView gmailIcon = findViewById(R.id.mailID);
        gmailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:jucse29.359@gmail.com"));  // Replace with your email
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        // Website - Opening a website
        ImageView websiteIcon = findViewById(R.id.websiteID);
        websiteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://trishasarkar174.github.io/portfolio/"));  // Replace with your website URL
                startActivity(webIntent);
            }
        });

        // Location - Opening Google Maps at a specific location
        ImageView mapIcon = findViewById(R.id.LocationID);
        mapIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = "geo:0,0?q=Savar, Jahangirnagar University";  // Replace with your location/address
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(location));
                startActivity(mapIntent);
            }
        });

        // Facebook - Opening Facebook profile/page
        ImageView facebookIcon = findViewById(R.id.facebookID);
        facebookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/oindrilla.sarkar.54"));  // Replace with your Facebook profile/page URL
                startActivity(fbIntent);
            }
        });

        // WhatsApp - Opening WhatsApp to send a message
        ImageView whatsappIcon = findViewById(R.id.whatsappID);
        whatsappIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+88 01614434451";  // Replace with the phone number to send message
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
                whatsappIntent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                startActivity(whatsappIntent);
            }
        });

        // LinkedIn - Opening LinkedIn profile
        ImageView linkedinIcon = findViewById(R.id.LinkedinID);
        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/trisha-sarkar-76ab9b285/"));  // Replace with your LinkedIn profile URL
                startActivity(linkedinIntent);
            }
        });

        // GitHub - Opening GitHub profile
        ImageView githubIcon = findViewById(R.id.githubID);
        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/TrishaSarkar174"));  // Replace with your GitHub profile URL
                startActivity(githubIntent);
            }
        });

    }
}