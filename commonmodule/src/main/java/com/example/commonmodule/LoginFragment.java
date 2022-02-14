package com.example.commonmodule;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class LoginFragment  extends Fragment {

    FragmentActivity act;

    RelativeLayout mainLayout;


    public LoginFragment(FragmentActivity act){

        this.act = act;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        try {

            mainLayout = (RelativeLayout) inflater.inflate(R.layout.login,null);

        } catch (Exception e) {

            Log.e("Login " + " onCreate>>LineNumber: "
                            + Thread.currentThread().getStackTrace()[2].getLineNumber(),
                    e.getMessage());

        }

        return mainLayout;

    }

}
