package uofsc.com.breatheasy;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class aboutFragment extends Fragment{
    private TextView tvAboutTitle,tvAboutText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){

        tvAboutText = (TextView)view.findViewById(R.id.tvAboutText);
        tvAboutTitle = (TextView)view.findViewById(R.id.tvAboutTitle);
    }
}


