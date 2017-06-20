package ad.com.avenirtest.Helper;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ad.com.avenirtest.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;
    protected TextView titleView;
    protected TextView textView;


    public CustomViewHolder(View view) {
        super(view);
        this.imageView = (ImageView) view.findViewById(R.id.feed_thumbnail);
        this.titleView = (TextView) view.findViewById(R.id.feed_title);
        this.textView = (TextView) view.findViewById(R.id.feed_text);
    }
}