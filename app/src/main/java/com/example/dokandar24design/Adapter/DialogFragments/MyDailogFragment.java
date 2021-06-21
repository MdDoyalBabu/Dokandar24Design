package com.example.dokandar24design.Adapter.DialogFragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MyDailogFragment extends DialogFragment {


    List<String> fruits;
    String fruit;


    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {


        fruits =new ArrayList<>();

        fruits.add("Bkash");
        fruits.add("Nagad");
        fruits.add("Bank");
        fruits.add("Cash");


        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Select Withdraw Type");
        builder.setCancelable(false);


        builder.setSingleChoiceItems(fruits.toArray (new String[0]), -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                fruit=fruits.get(which);
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(), "selected "+fruit, Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();

            }
        });

        return builder.create();
    }
}
