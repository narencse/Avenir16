package ad.com.avenirtest;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Rules extends AppCompatActivity {

    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        final WebView webview = ((WebView) findViewById(R.id.rules_web));
        webview.loadUrl("https://rawgit.com/narencse/avenir_16/master/rules/" + EventAvenir.clickedPosition + ".html");
        pd = new ProgressDialog(this);
        pd.setCancelable(false);
        pd.setTitle("Loading");
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (Rules.this != null) {
                    pd.show();
                }
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if (Rules.this != null && pd.isShowing()) {
                    pd.hide();
                }
                if(webview.getTitle() == null || webview.getTitle().length() <= 2){
                    Toast.makeText(Rules.this, "No Internet", Toast.LENGTH_SHORT).show();
                    Rules.this.finish();
                }
                super.onPageFinished(view, url);
            }

        });

    }


}
