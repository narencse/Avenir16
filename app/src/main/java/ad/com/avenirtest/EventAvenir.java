package ad.com.avenirtest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ad.com.avenirtest.Helper.FeedItem;
import ad.com.avenirtest.Helper.MyRecyclerAdapter;
import ad.com.avenirtest.Helper.RecyclerItemClickListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventAvenir extends Fragment {


    RecyclerView mRecyclerView;
    public static String clickedPosition = "00";

    public EventAvenir() {
        // Required empty public constructor
    }

    public static String[][] titles = {{"Counter Strike", "Fifa", "Need For Speed", "8 Ball Pool", "Dota"},
            {"Encoding", "Web-O-Tronic", "Hack-Trick", "Bon-App-etit", "Crypt-Quest", "Stack Trace"},
            {"Metal Mayhem", "Intrusion", "Line-Follower", "Robo-Soccer", "Terra-Ranger", "I-Resquer"},
            {"Mnemonics", "Inception", "Contrive", "Quizzard", "Dispute", "Arithmos", "Puzzle-Duzzle",  "Knighted", "Sudoku","Picto-Press"},
            {"Lenz's Eye", "Click-In-Stant", "Bio-Scope", "Cine-Articulate", "Spectrum","Photostentation","Insta Click"},
            {"Ad-Enacting", "Dartboard", "Con-2-Win","Face-Painting", "Free-Wheeling", "Treasure Hunt", "Zorb Soccer","Paper Trend"},
            {"Bridge-O-Mania", "Construzione", "Survolare","Rot-O-Lare"}
    };


    public static String[][] text = {{"First-Person Shooter!", "FEEL THE GAME!", "Be The Most Wanted!", "Lucky 8 Ball!", "Be The SUPER Hero!"},
            {"Let's Do Some Coding!", "Design A Website!", "The Art Of Exploitation!", "Develop Your Own App For Android!", "Decrypt and Encrypt Messages!", "Find Bugs In programs!"},
            {"Let's The Battle Begin!", "", "Make Your Bot Follow the Line!", "The World Is At Your Feet!", "Go Through Obstacles And Emerge As The Winner", "Rescue The Boxes"},
            {"Design An Electronic Circuit", "Innovate!!", "For The 'Norton' Syndrome Patients!", "It's Quiz Time!", "The War Of Words!", "For Those Who Breath Math", "Solve Fascinating Puzzles", "Chess!", "Work Your Brain Out!","Story Writing Competition"},
            {"Bring Out The Photographer In You", "Capture The Best Moments", "Make Your Own Movie", "Write A Movie Review", "Show Your Talent","Photostentation","Insta_Click"},
            {"Be A AD-Guru", "Dartboard", "AntiChess!", "Unleash Your Creativity!", "Got Some Talent.Show It Off", "Find The Treasure", "Zorb Soccer","Paper Trend"},
            {"Build A Bridge Of Sticks", "CAD Modelling", "Map A Given Site","MARBLE ROLLER COASTER"}};

    public static int[][] images = {{R.drawable.csgo, R.drawable.fifa, R.drawable.nfs, R.drawable.pool, R.drawable.dota},
            {R.drawable.encoding, R.drawable.web, R.drawable.hack, R.drawable.android, R.drawable.crypt, R.drawable.trace},
            {R.drawable.robo, R.drawable.intru, R.drawable.intrusion, R.drawable.robo_soccer, R.drawable.terra, R.drawable.i},
            {R.drawable.circuit, R.drawable.inception, R.drawable.contrive, R.drawable.quiz, R.drawable.dispute, R.drawable.arithmos, R.drawable.puzzle,  R.drawable.knighted, R.drawable.sudoku,R.drawable.picto},
            {R.drawable.lensified, R.drawable.clickinstant, R.drawable.boiscope, R.drawable.review, R.drawable.spectrum,R.drawable.photostentation,R.drawable.instaclick},
            {R.drawable.ad, R.drawable.dart,R.drawable.antichess, R.drawable.facepaint, R.drawable.free, R.drawable.treasure, R.drawable.zorb,R.drawable.papertrend},
            {R.drawable.bridge, R.drawable.costruzione, R.drawable.survolare,R.drawable.rotolare}};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        List<RecyclerView> recyclerViews = new ArrayList<>();
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_0));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_1));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_2));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_3));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_4));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_5));
        recyclerViews.add((RecyclerView) rootView.findViewById(R.id.recycler_view_6));

        for (int it = 0; it < 7; ++it) {

            mRecyclerView = recyclerViews.get(it);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

            List<FeedItem> feedsList = new ArrayList<>();
            for (int i = 0; i < titles[it].length; i++) {
                FeedItem item = new FeedItem();
                item.setTitle(titles[it][i]);
                item.setThumbnail(images[it][i]);
                item.setText(text[it][i]);
                item.setClickedPosition(it + "" + i);
                feedsList.add(item);
            }

            mRecyclerView.setAdapter(new MyRecyclerAdapter(getActivity(), feedsList));
            mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(),
                    new OnItemClickListener(it)));

        }


        return rootView;
    }

    private class OnItemClickListener extends RecyclerItemClickListener.SimpleOnItemClickListener {

        int cat;
        public OnItemClickListener(int cat){
            this.cat = cat;
        }
        @Override
        public void onItemClick(View childView, int position) {
            // Do something when an item is clicked, or override something else.
            Log.e("Clicked", cat + "" + position);
            EventAvenir.clickedPosition = cat + "" + position;
            startActivity(new Intent("ad.com.avenirtest.Rules"));
        }

    }

}
