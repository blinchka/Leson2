package ru.mirea.kiushkinaaa.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    public interface TimePickerListener{
        void onTimeSet(TimePicker timePicker, int hour,int minute);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i,int il){
        mListener.onTimeSet(timePicker, i, il);
    }

    TimePickerListener mListener;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            mListener = (TimePickerListener) context;
        } catch (Exception e){
            throw new ClassCastException(getActivity().toString() + "must implement TimePickerListener");
        }

    }



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        return  new TimePickerDialog(getActivity(), this, hour,minute, DateFormat.is24HourFormat(getContext()));
    }

}

