package ad.com.avenirtest;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashActivity extends AwesomeSplash {

    //DO NOT OVERRIDE onCreate()!
    //if you need to start some services do it in initSplash()!


    @Override
    public void initSplash(ConfigSplash configSplash) {

            /* you don't have to override every property */

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.primary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(1500); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


        //Customize Path
        configSplash.setPathSplash(JOB_AND_TALENT); //set path String
        configSplash.setOriginalHeight(100); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(100); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(2000);
        configSplash.setPathSplashStrokeSize(2); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.accent); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(2000);
        configSplash.setPathSplashFillColor(R.color.Wheat); //path object filling color


        //Customize Title
        configSplash.setTitleSplash("Avenir 16");
        configSplash.setTitleTextColor(R.color.Wheat);
        configSplash.setTitleTextSize(40f); //float value
        configSplash.setAnimTitleDuration(2500);
        configSplash.setAnimTitleTechnique(Techniques.SlideInDown);
        //configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/

    }

    String JOB_AND_TALENT = "M 52.55,28.17\n" +
            "           C 52.55,29.66 51.34,30.88 49.85,30.88\n" +
            "             48.35,30.88 47.14,29.66 47.14,28.17\n" +
            "             47.14,26.67 48.35,25.47 49.85,25.47\n" +
            "             51.34,25.47 52.55,26.68 52.55,28.17 Z\n" +
            "           M 36.12,28.17\n" +
            "           C 36.12,29.66 34.90,30.88 33.41,30.88\n" +
            "             31.92,30.88 30.70,29.66 30.70,28.17\n" +
            "             30.70,26.67 31.92,25.47 33.41,25.47\n" +
            "             34.90,25.47 36.11,26.68 36.12,28.17 Z\n" +
            "           M 49.40,55.58\n" +
            "           C 49.20,57.52 47.58,58.99 45.61,58.99\n" +
            "             45.50,58.99 45.32,58.98 45.22,58.97\n" +
            "             44.20,58.88 43.28,58.38 42.63,57.59\n" +
            "             41.99,56.80 41.69,55.81 41.80,54.80\n" +
            "             41.99,52.86 43.63,51.39 45.60,51.39\n" +
            "             45.70,51.39 45.89,51.40 45.99,51.40\n" +
            "             48.08,51.63 49.61,53.49 49.40,55.58 Z\n" +
            "           M 46.42,55.27\n" +
            "           C 46.47,54.83 46.14,54.43 45.68,54.39\n" +
            "             45.65,54.39 45.63,54.38 45.60,54.38\n" +
            "             45.18,54.38 44.83,54.69 44.78,55.11\n" +
            "             44.74,55.55 45.07,55.94 45.52,55.99\n" +
            "             45.55,55.99 45.58,55.99 45.61,55.99\n" +
            "             46.02,55.99 46.38,55.68 46.42,55.27 Z\n" +
            "           M 73.94,39.17\n" +
            "           C 73.94,39.17 73.36,39.65 73.36,39.65\n" +
            "             76.70,40.40 79.08,42.79 79.08,45.70\n" +
            "             79.08,45.70 79.08,65.86 79.08,65.86\n" +
            "             79.07,69.39 75.57,72.15 71.11,72.15\n" +
            "             68.57,72.15 66.34,71.25 64.90,69.83\n" +
            "             64.61,74.80 62.25,78.13 58.13,79.46\n" +
            "             58.13,79.46 58.13,87.40 58.13,87.40\n" +
            "             58.13,90.93 54.63,93.70 50.17,93.70\n" +
            "             45.71,93.70 42.21,90.93 42.21,87.40\n" +
            "             42.21,87.40 42.21,80.11 42.21,80.11\n" +
            "             42.21,80.11 41.11,80.11 41.11,80.11\n" +
            "             41.11,80.11 41.11,87.40 41.11,87.40\n" +
            "             41.11,90.93 37.61,93.70 33.15,93.70\n" +
            "             28.68,93.70 25.19,90.93 25.19,87.40\n" +
            "             25.19,87.40 25.19,79.43 25.19,79.43\n" +
            "             21.72,78.32 18.49,75.46 18.49,68.67\n" +
            "             18.49,68.67 18.50,62.28 18.50,62.28\n" +
            "             18.50,62.28 11.24,55.02 11.24,55.02\n" +
            "             8.72,52.50 9.22,48.04 12.40,44.87\n" +
            "             14.14,43.12 16.37,42.11 18.50,42.11\n" +
            "             18.51,42.11 18.52,42.11 18.53,42.11\n" +
            "             18.53,42.11 18.54,40.04 18.54,40.04\n" +
            "             18.54,39.42 18.73,38.85 19.05,38.37\n" +
            "             18.49,37.70 18.25,36.83 18.39,35.97\n" +
            "             19.31,30.08 22.53,24.88 27.38,21.29\n" +
            "             27.38,21.29 22.43,13.46 22.43,13.46\n" +
            "             21.75,12.39 21.54,11.07 21.87,9.85\n" +
            "             22.20,8.59 23.06,7.51 24.27,6.86\n" +
            "             24.97,6.50 25.77,6.30 26.57,6.30\n" +
            "             28.29,6.30 29.85,7.15 30.72,8.55\n" +
            "             30.72,8.55 36.17,17.21 36.17,17.21\n" +
            "             38.00,16.78 39.86,16.56 41.72,16.56\n" +
            "             43.55,16.56 45.37,16.77 47.19,17.20\n" +
            "             47.19,17.20 52.65,8.56 52.65,8.56\n" +
            "             53.53,7.15 55.08,6.30 56.80,6.30\n" +
            "             57.60,6.30 58.39,6.50 59.13,6.88\n" +
            "             60.31,7.51 61.17,8.59 61.50,9.85\n" +
            "             61.82,11.08 61.62,12.40 60.94,13.46\n" +
            "             60.94,13.46 56.01,21.27 56.01,21.27\n" +
            "             60.00,24.20 62.90,28.23 64.33,32.83\n" +
            "             64.33,32.83 66.95,30.68 66.95,30.68\n" +
            "             66.96,29.12 67.72,27.61 69.20,26.41\n" +
            "             69.20,26.41 78.70,18.64 78.70,18.64\n" +
            "             79.84,17.70 81.13,17.21 82.44,17.21\n" +
            "             84.02,17.21 85.48,17.94 86.53,19.25\n" +
            "             86.53,19.25 89.04,22.30 89.04,22.30\n" +
            "             91.08,24.80 90.74,27.87 88.20,29.95\n" +
            "             88.20,29.95 78.69,37.72 78.69,37.72\n" +
            "             77.45,38.74 76.15,39.25 74.81,39.25\n" +
            "             74.52,39.25 74.23,39.23 73.94,39.17 Z\n" +
            "           M 21.35,36.44\n" +
            "           C 21.35,36.44 62.09,36.44 62.09,36.44\n" +
            "             61.13,30.29 57.23,25.10 51.83,22.15\n" +
            "             51.89,22.09 51.97,22.06 52.01,21.98\n" +
            "             52.01,21.98 58.40,11.85 58.40,11.85\n" +
            "             58.92,11.04 58.62,10.00 57.73,9.52\n" +
            "             57.43,9.37 57.12,9.30 56.80,9.30\n" +
            "             56.16,9.30 55.53,9.60 55.19,10.15\n" +
            "             55.19,10.15 48.80,20.28 48.80,20.28\n" +
            "             48.71,20.42 48.67,20.58 48.63,20.73\n" +
            "             46.47,19.98 44.15,19.55 41.73,19.55\n" +
            "             39.27,19.55 36.93,19.99 34.75,20.75\n" +
            "             34.70,20.59 34.67,20.43 34.58,20.28\n" +
            "             34.58,20.28 28.18,10.15 28.18,10.15\n" +
            "             27.84,9.60 27.21,9.30 26.57,9.30\n" +
            "             26.25,9.30 25.94,9.38 25.65,9.53\n" +
            "             24.75,10.00 24.45,11.04 24.96,11.85\n" +
            "             24.96,11.85 31.35,21.98 31.35,21.98\n" +
            "             31.40,22.06 31.50,22.10 31.56,22.17\n" +
            "             26.20,25.12 22.31,30.30 21.35,36.44 Z\n" +
            "           M 71.11,42.41\n" +
            "           C 71.11,42.41 71.10,42.41 71.10,42.41\n" +
            "             68.37,42.41 66.15,43.88 66.15,45.70\n" +
            "             66.15,45.70 66.15,65.86 66.15,65.86\n" +
            "             66.15,67.68 68.38,69.15 71.11,69.15\n" +
            "             73.84,69.15 76.07,67.68 76.07,65.86\n" +
            "             76.07,65.86 76.07,45.70 76.07,45.70\n" +
            "             76.07,43.88 73.85,42.41 71.11,42.41 Z\n" +
            "           M 73.45,35.70\n" +
            "           C 73.89,36.09 74.35,36.25 74.81,36.25\n" +
            "             75.50,36.25 76.19,35.90 76.79,35.40\n" +
            "             76.79,35.40 86.30,27.63 86.30,27.63\n" +
            "             87.45,26.70 87.78,25.50 86.71,24.20\n" +
            "             86.71,24.20 84.21,21.15 84.21,21.15\n" +
            "             83.68,20.50 83.06,20.21 82.43,20.21\n" +
            "             81.81,20.21 81.18,20.50 80.60,20.96\n" +
            "             80.60,20.96 71.09,28.73 71.09,28.73\n" +
            "             70.08,29.56 69.58,30.59 70.29,31.83\n" +
            "             70.29,31.83 60.23,40.06 60.23,40.06\n" +
            "             60.23,40.06 21.53,40.06 21.53,40.06\n" +
            "             21.53,40.06 21.53,42.97 21.51,46.95\n" +
            "             21.51,46.95 20.42,45.85 20.42,45.85\n" +
            "             19.93,45.35 19.25,45.12 18.49,45.12\n" +
            "             17.22,45.12 15.73,45.78 14.51,46.99\n" +
            "             12.56,48.95 12.04,51.60 13.35,52.91\n" +
            "             13.35,52.91 21.50,61.05 21.50,61.05\n" +
            "             21.49,64.30 21.49,67.10 21.49,68.67\n" +
            "             21.49,73.94 23.59,76.53 28.19,77.00\n" +
            "             28.19,77.00 28.19,87.41 28.19,87.41\n" +
            "             28.19,89.23 30.41,90.70 33.15,90.70\n" +
            "             35.88,90.70 38.11,89.23 38.11,87.41\n" +
            "             38.11,87.41 38.11,77.11 38.11,77.11\n" +
            "             40.44,77.11 42.88,77.12 45.22,77.13\n" +
            "             45.22,77.13 45.22,87.40 45.22,87.40\n" +
            "             45.22,89.23 47.44,90.70 50.17,90.70\n" +
            "             52.91,90.70 55.13,89.23 55.13,87.40\n" +
            "             55.13,87.40 55.13,77.03 55.13,77.03\n" +
            "             59.84,76.52 61.93,73.68 61.93,68.78\n" +
            "             61.93,64.96 61.93,52.29 61.93,45.12\n" +
            "             61.93,45.12 73.45,35.70 73.45,35.70 Z\n" +
            "           M 60.24,40.04\n" +
            "           C 60.24,40.04 61.93,40.04 61.93,40.04\n" +
            "             61.93,40.04 61.93,42.10 61.93,45.10\n" +
            "             61.93,45.10 57.40,48.80 57.40,48.80\n" +
            "             59.85,53.32 59.41,58.57 56.01,61.35\n" +
            "             55.03,62.15 53.89,62.67 52.66,62.92\n" +
            "             51.69,63.13 49.87,65.45 49.76,66.60\n" +
            "             49.49,69.59 48.23,72.29 45.95,74.15\n" +
            "             44.03,75.72 41.66,76.47 39.18,76.47\n" +
            "             34.95,76.47 30.39,74.30 27.10,70.28\n" +
            "             25.30,68.07 24.16,65.60 23.60,63.14\n" +
            "             23.60,63.14 27.81,67.35 27.81,67.35\n" +
            "             28.30,67.84 28.98,68.08 29.74,68.08\n" +
            "             31.01,68.08 32.51,67.42 33.73,66.20\n" +
            "             35.67,64.25 36.19,61.61 34.88,60.30\n" +
            "             34.88,60.30 26.34,51.76 26.34,51.76\n" +
            "             26.58,51.51 26.78,51.24 27.04,51.02\n" +
            "             28.97,49.45 31.33,48.70 33.80,48.70\n" +
            "             34.25,48.70 34.72,48.73 35.19,48.78\n" +
            "             35.24,48.79 35.30,48.80 35.36,48.80\n" +
            "             36.59,48.80 38.98,47.60 39.33,46.75\n" +
            "             39.83,45.58 40.57,44.53 41.58,43.71\n" +
            "             43.04,42.51 44.84,41.94 46.73,41.94\n" +
            "             49.28,41.94 52.00,42.98 54.27,44.93\n" +
            "             54.27,44.93 60.24,40.05 60.24,40.05\n" +
            "             60.24,40.05 60.24,40.04 60.24,40.04 Z\n" +
            "           M 54.76,50.25\n" +
            "           C 54.36,49.52 54.30,48.67 54.54,47.92\n" +
            "             54.45,47.93 54.36,47.93 54.27,47.93\n" +
            "             53.57,47.93 52.88,47.69 52.31,47.21\n" +
            "             50.64,45.76 48.60,44.94 46.73,44.94\n" +
            "             45.86,44.94 44.58,45.13 43.48,46.03\n" +
            "             42.89,46.52 42.42,47.15 42.10,47.90\n" +
            "             41.14,50.25 37.41,51.80 35.36,51.80\n" +
            "             35.25,51.80 34.97,51.78 34.86,51.77\n" +
            "             34.50,51.73 34.14,51.71 33.79,51.71\n" +
            "             32.81,51.71 31.87,51.87 31.01,52.19\n" +
            "             31.01,52.19 37.00,58.18 37.00,58.18\n" +
            "             39.52,60.70 39.01,65.15 35.85,68.33\n" +
            "             34.67,69.50 33.28,70.34 31.86,70.77\n" +
            "             34.08,72.50 36.67,73.48 39.18,73.48\n" +
            "             41.05,73.48 42.73,72.91 44.05,71.83\n" +
            "             46.03,70.22 46.63,67.95 46.77,66.34\n" +
            "             46.98,64.06 49.63,60.51 52.07,59.99\n" +
            "             52.84,59.84 53.53,59.52 54.11,59.04\n" +
            "             56.30,57.25 56.57,53.56 54.76,50.25 Z";

    @Override
    public void animationsFinished() {

        //transit to another activity here
        //or do whatever you want
        finish();
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_out_right);

    }
}