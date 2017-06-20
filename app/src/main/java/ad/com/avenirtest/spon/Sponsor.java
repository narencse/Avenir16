package ad.com.avenirtest.spon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import ad.com.avenirtest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sponsor extends Fragment {


    public Sponsor() {
        // Required empty public constructor
    }

    ListView ls;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sponsor, container, false);
        ls = (ListView) rootView.findViewById(R.id.spon_web);
        ls.setAdapter(new CustomAdapter(getActivity(), R.layout.spon_list_item));
        return rootView;
    }

}

//