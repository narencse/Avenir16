package ad.com.avenirtest.Helper;

public class FeedItem {
    private String title;
    private String text;
    private int thumbnail;
    private String clickedPosition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getClickedPosition() {
        return clickedPosition;
    }

    public void setClickedPosition(String clickedPosition) {
        this.clickedPosition = clickedPosition;
    }
}