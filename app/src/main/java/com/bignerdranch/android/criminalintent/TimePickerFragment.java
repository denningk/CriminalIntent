package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class TimePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.time_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
