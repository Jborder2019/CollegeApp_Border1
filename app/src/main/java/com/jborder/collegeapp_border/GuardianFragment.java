package com.jborder.collegeapp_border;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;




public class GuardianFragment extends Fragment {

    private TextView mFirstNameTextView, mLastNameTextView, mOccupationTextView;
    private EditText mFirstNameEditText, mLastNameEditText, mOccupationEditText;
    private Button mSubmitButton;
    private Guardian mGuardian;
    private final String TAG = "GUARDIAN_FRAGMENT";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

        mGuardian = new Guardian("Ada", "Lovelace", "Programmer");



        mFirstNameTextView.setText(mGuardian.getFirstName());
        mLastNameTextView.setText(mGuardian.getLastName());
        mOccupationTextView.setText(mGuardian.getOccupation());

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFirstNameEditText.getText().length() > 0){
                    String firstName = mFirstNameEditText.getText().toString();
                    mGuardian.setFirstName(firstName);
                    mFirstNameTextView.setText(firstName);
                    mFirstNameEditText.setText("");
                }

                if(mLastNameEditText.getText().length() > 0){
                    String lastName = mLastNameEditText.getText().toString();
                    mGuardian.setLastName(lastName);
                    mLastNameTextView.setText(lastName);
                    mLastNameEditText.setText("");
                }

                if(mOccupationEditText.getText().length() > 0){
                    String occupation = mOccupationEditText.getText().toString();
                    mGuardian.setOccupation(occupation);
                    mOccupationTextView.setText(occupation);
                    mOccupationEditText.setText("");
                }
                Backendless.Persistence.save(mGuardian, new AsyncCallback<Guardian>() {
                    @Override
                    public void handleResponse(Guardian guardian) {
                        Log.i(TAG, "Saved" + guardian.toString());
                    }

                    @Override
                    public void handleFault(BackendlessFault backendlessFault) {
                        Log.i(TAG, backendlessFault.toString());
                    }
                });

            }
        });

        return rootView;
    }


}