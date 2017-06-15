package uofsc.com.breatheasy;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class mainMenuFragment extends Fragment implements View.OnClickListener {
    private TextView tvMainMenu;
    private AppCompatButton btnSettings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_menu,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){

        tvMainMenu = (TextView)view.findViewById(R.id.tvMainMenu);
        btnSettings = (AppCompatButton)view.findViewById(R.id.btnSettings);

        btnSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSettings:
                goToSettings();
                break;
        }

    }

    private void goToSettings(){

        Fragment login = new ProfileFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame,login);
        ft.commit();
    }
}
