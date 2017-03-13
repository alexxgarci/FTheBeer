package com.alex.beerapp.controller;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by alex on 27/2/17.
 */

public class OnChangeTextListener implements TextWatcher {

    private Context mContext;
    EditText mEditTextView;

    public OnChangeTextListener(Context context, EditText editTextView) {
        super();
        this.mContext = context;
        this.mEditTextView= editTextView;
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(mEditTextView.getText()).matches()){
            mEditTextView.setBackgroundColor(Color.GREEN);
        }else {
            mEditTextView.setBackgroundColor(Color.RED);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
                                  int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }
}