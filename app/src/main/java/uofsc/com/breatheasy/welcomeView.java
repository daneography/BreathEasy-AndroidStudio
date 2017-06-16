package uofsc.com.breatheasy;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class welcomeView extends Fragment implements View.OnClickListener {
    private AppCompatButton btnRegister, btnLogin;
    private TextView tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_welcome_view, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {

        btnRegister = (AppCompatButton) view.findViewById(R.id.btnRegister);
        btnLogin = (AppCompatButton) view.findViewById(R.id.btnLogin);
        tvAbout = (TextView) view.findViewById(R.id.tvAbout);

        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        tvAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tv_login:
                Fragment login = new LoginFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_frame, login);
                ft.commit();
                break;

            case R.id.btn_register:
                Fragment register = new RegisterFragment();
                FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                ft1.replace(R.id.fragment_frame, register);
                ft1.commit();
                break;

            case R.id.tvAbout:
                Fragment about = new aboutFragment();
                FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                ft2.replace(R.id.fragment_frame, about);
                ft2.commit();
                break;

        }

    }
}
