package ad.com.avenirtest;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.etiennelawlor.imagegallery.library.util.ImageGalleryUtils;

import java.util.List;

/**
 * Created by etiennelawlor on 8/20/15.
 */
public class ImageGalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // region Member Variables
    private final List<Integer> mImages;
    private int mGridItemWidth;
    private int mGridItemHeight;
    private OnImageClickListener mOnImageClickListener;
    // endregion

    // region Interfaces
    public interface OnImageClickListener {
        void onImageClick(int position);
    }
    // endregion

    // region Constructors
    public ImageGalleryAdapter(List<Integer> images) {
        mImages = images;
    }
    // endregion

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(com.etiennelawlor.imagegallery.library.R.layout.image_thumbnail, viewGroup, false);
        v.setLayoutParams(getGridItemLayoutParams(v));

        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final ImageViewHolder holder = (ImageViewHolder) viewHolder;

        int image = mImages.get(position);

        setUpImage(holder.mImageView, image);

        holder.mFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPos = holder.getAdapterPosition();
                if (adapterPos != RecyclerView.NO_POSITION) {
                    if (mOnImageClickListener != null) {
                        mOnImageClickListener.onImageClick(adapterPos);
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mImages != null) {
            return mImages.size();
        } else {
            return 0;
        }
    }

    // region Helper Methods
    public void setOnImageClickListener(OnImageClickListener listener) {
        this.mOnImageClickListener = listener;
    }

    private ViewGroup.LayoutParams getGridItemLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int screenWidth = ImageGalleryUtils.getScreenWidth(view.getContext());
        int numOfColumns;
        if (ImageGalleryUtils.isInLandscapeMode(view.getContext())) {
            numOfColumns = 4;
        } else {
            numOfColumns = 3;
        }

        mGridItemWidth = screenWidth / numOfColumns;
        mGridItemHeight = screenWidth / numOfColumns;

        layoutParams.width = mGridItemWidth;
        layoutParams.height = mGridItemHeight;

        return layoutParams;
    }

    private void setUpImage(ImageView iv, int imageUrl) {

        iv.setImageDrawable(iv.getResources().getDrawable(imageUrl));

    }
    // endregion

    // region Inner Classes

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        // region Member Variables
        private final ImageView mImageView;
        private final FrameLayout mFrameLayout;
        // endregion

        // region Constructors
        public ImageViewHolder(final View view) {
            super(view);

            mImageView = (ImageView) view.findViewById(com.etiennelawlor.imagegallery.library.R.id.iv);
            mFrameLayout = (FrameLayout) view.findViewById(com.etiennelawlor.imagegallery.library.R.id.fl);
        }
        // endregion
    }

    // endregion
}

