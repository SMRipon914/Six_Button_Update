package com.mypack.office_six;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class Button1Activity extends AppCompatActivity {

    private AdView adView;
    private final String TAG = Button1Activity.class.getSimpleName();
    private InterstitialAd interstitialAd;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);
        textView1=findViewById(R.id.textView1);
        textView1.setText("yourText-1");


        adView = new AdView(this, "bannerId_1", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer1 = (LinearLayout) findViewById(R.id.banner_container1);
        adContainer1.addView(adView);
        adView.loadAd();
        adView = new AdView(this, "bannerId_2", AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer2 = (LinearLayout) findViewById(R.id.banner_container2);
        adContainer2.addView(adView);
        adView.loadAd();

        interstitialAd = new InterstitialAd(this, "interstitialAd");
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
            }
            @Override
            public void onInterstitialDismissed(Ad ad) {
            }
            @Override
            public void onError(Ad ad, AdError adError) {
            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
            }

            @Override
            public void onLoggingImpression(Ad ad) {
            }
        });
        interstitialAd.loadAd();
    }
    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
}
