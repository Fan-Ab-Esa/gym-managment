package org.callback.gymmanagment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    private TextView txtTitleBox;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_add_form,container,false);
        txtTitleBox=view.findViewById(R.id.txtTitlebox);
        Bundle bundle=getArguments();
        if (null!=bundle){
            String title=bundle.getString("title");
            //txtTitleBox.getText();
        }
        return view;
    }
}
