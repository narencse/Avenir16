package ad.com.avenirtest;


import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.etiennelawlor.imagegallery.library.enums.PaletteColorType;
import com.yalantis.guillotine.animation.GuillotineAnimation;

import java.util.ArrayList;
import java.util.Locale;

import ad.com.avenirtest.spon.Sponsor;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private static final long RIPPLE_DURATION = 250;
    Toolbar toolbar;
    View contentHamburger;
    TextView toolbarTitle;
    View guillotineMenu;
    FloatingActionButton fab;
    public static Boolean openSplash = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine, null);

        setContentView(R.layout.main_activity);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        FrameLayout root = (FrameLayout) findViewById(R.id.root);
        contentHamburger = findViewById(R.id.content_hamburger);
        toolbarTitle = (TextView) findViewById(R.id.toolbarTitle);
        toolbarTitle.setTextColor(Color.WHITE);

        if (openSplash) {
            openSplash = false;
            startActivity(new Intent("ad.com.avenirtest.SplashActivity"));
        }

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }


        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fab);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 22.47607874, 88.41480911);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .setDuration(600)
                .build();


        LinearLayout home = (LinearLayout) guillotineMenu.findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeAvenir fe;
                fe = new HomeAvenir();

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.container, fe);
                fragmentTransaction.commit();
                toolbarTitle.setText("Avenir");
                toolbarTitle.setTextColor(Color.WHITE);

                new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                        .setStartDelay(RIPPLE_DURATION)
                        .setActionBarViewForAnimation(toolbar)
                        .build()
                        .close();


            }
        });

        HomeAvenir fr;
        fr = new HomeAvenir();


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.container, fr);
        fragmentTransaction.commit();


    }


    public void gallery(View v) {
        Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

        ArrayList<Integer> images = new ArrayList<>();

        images.add(R.drawable.f1);
        images.add(R.drawable.f2);
        images.add(R.drawable.f3);
        images.add(R.drawable.f4);
        images.add(R.drawable.f5);
        images.add(R.drawable.f6);
        images.add(R.drawable.f7);
        images.add(R.drawable.f8);
        images.add(R.drawable.f9);
        images.add(R.drawable.f10);
        images.add(R.drawable.f11);
        images.add(R.drawable.f12);
        images.add(R.drawable.f13);
        images.add(R.drawable.f14);


        intent.putIntegerArrayListExtra("images", images);
// optionally set background color using Palette
        intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

        startActivity(intent);


    }

    public void event(View v) {

        EventAvenir fe;
        fe = new EventAvenir();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
/*
                fragmentTransaction.setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim);
*/
        fragmentTransaction.replace(R.id.container, fe);
        fragmentTransaction.commit();
        toolbarTitle.setText("Events");
        toolbarTitle.setTextColor(Color.WHITE);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .build()
                .close();

    }

    public void sponsor(View v) {

        Sponsor fe;
        fe = new Sponsor();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
/*
                fragmentTransaction.setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim);
*/
        fragmentTransaction.replace(R.id.container, fe);
        fragmentTransaction.commit();
        toolbarTitle.setText("Sponsor");
        toolbarTitle.setTextColor(Color.WHITE);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .build()
                .close();

    }

    public void about(View v) {

        avenirAbout fe;
        fe = new avenirAbout();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
/*
                fragmentTransaction.setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim);
*/
        fragmentTransaction.replace(R.id.container, fe);
        fragmentTransaction.commit();
        toolbarTitle.setText("About");
        toolbarTitle.setTextColor(Color.WHITE);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .build()
                .close();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please press back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);

    }


}

