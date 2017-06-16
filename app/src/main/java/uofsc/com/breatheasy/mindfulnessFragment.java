package uofsc.com.breatheasy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class mindfulnessFragment extends Fragment {
    private TextView tvMindfulness;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_mindfulness,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        tvMindfulness = (TextView)view.findViewById(R.id.tvMinfulness);
    }

    private void goToLogin(){

        Fragment back = new LoginFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame,back).addToBackStack("tag");
        ft.commit();
    }

}
