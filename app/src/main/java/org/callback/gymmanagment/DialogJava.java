package org.callback.gymmanagment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogJava extends DialogFragment {
    private Button btnDialogDismiss, btnDialogAdd;
    private TextView txtDialoSport;
    private EditText txtTimeBox;
    private Spinner dialogSpinner;
    DialogInterface myDialog;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        View view = getActivity().getLayoutInflater().inflate(R.layout.activity_dialog_box, null);
        initViews(view);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setView(view).setTitle("Enter Details");
        Bundle bundle = getArguments();
        if (null != bundle) {
            txtDialoSport.setText(bundle.getString("title"));
        }
        btnDialogDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btnDialogAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    myDialog = (DialogInterface) getActivity();
                    myDialog.sendDayTime(dialogSpinner.getSelectedItem().toString(), txtTimeBox.getText().toString());
                } catch (ClassCastException e) {
                    myDialog = null;
                }
                dismiss();
            }
        });

        return builder.create();
    }

    private void initViews(View view) {
        btnDialogAdd = view.findViewById(R.id.btnDialogAdd);
        btnDialogDismiss = view.findViewById(R.id.btnDialogDismiss);
        txtDialoSport = view.findViewById(R.id.txtDialoSport);
        txtTimeBox = view.findViewById(R.id.txtTimeBox);
        dialogSpinner = view.findViewById(R.id.dialogSpinner);


    }
}
