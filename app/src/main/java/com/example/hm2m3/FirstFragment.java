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


public class FirstFragment extends Fragment {
    private Button btnClick;
public static final String KEY_FOR_BUNDLE = "Key.bundle";
private EditText edt1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    edt1 = view.findViewById(R.id.container1);
    btnClick = view.findViewById(R.id.btn_click);
    btnClick.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Bundle bundle = new Bundle();
          bundle.putString(KEY_FOR_BUNDLE,edt1.getText().toString());
          SecondFragment secondFragment = new SecondFragment();
          secondFragment.setArguments(bundle);
          requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,secondFragment).addToBackStack(null).commit();
        }
    });
    }


}