package com.example.hm2m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import javax.microedition.khronos.egl.EGLDisplay;


public class SecondFragment extends Fragment {
private EditText edt2;
private Button btnClick2;
public static final String KEY_FOR_BUNDLE2 = "Key.bundle2";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edt2 = view.findViewById(R.id.container2);
        if (getArguments() != null) {
            String value = getArguments().getString(FirstFragment.KEY_FOR_BUNDLE);
            edt2.setText(value);
        }

        btnClick2 = view.findViewById(R.id.btn_click2);
        btnClick2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(KEY_FOR_BUNDLE2, edt2.getText().toString());
                ThirdFragment thirdFragment = new ThirdFragment();
                thirdFragment.setArguments(bundle2);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).addToBackStack(null).commit();

               }
        })
    ;}
}
