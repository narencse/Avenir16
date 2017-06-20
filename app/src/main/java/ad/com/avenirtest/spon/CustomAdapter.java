package ad.com.avenirtest.spon;


import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

import ad.com.avenirtest.R;

public class CustomAdapter extends ArrayAdapter {

    Context mContext;
    int layoutResourceId;
    List<Bitmap> data;

    public CustomAdapter(Context mContext, int layoutResourceId) {
        super(mContext, layoutResourceId);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    int[][] images = {{R.drawable.gateacdmy, R.drawable.ims},{R.drawable.gate, R.drawable.niit}};

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PlaceViewHolder holder;
        if (convertView == null) {
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
            //we attach the Image- and Text-View to our holder, so we can access them in the next step
            holder = new PlaceViewHolder();
            holder.iv1 = (ImageView) convertView.findViewById(R.id.spon_list_image1);
            holder.iv2 = (ImageView) convertView.findViewById(R.id.spon_list_image2);

            convertView.setTag(holder);
        } else {
            holder = (PlaceViewHolder) convertView.getTag();
        }
        holder.iv1.setImageResource(images[position][0]);
        holder.iv2.setImageResource(images[position][1]);

        return convertView;
    }


}