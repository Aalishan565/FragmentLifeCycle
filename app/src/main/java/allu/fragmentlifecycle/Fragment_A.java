package allu.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_A extends Fragment implements View.OnClickListener {
    private Button mBtnClick;

    String TAG = "TAG";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach() Fragment_A");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() Fragment_A");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView() Fragment_A");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnClick = (Button) getActivity().findViewById(R.id.btn_click);
        mBtnClick.setOnClickListener(this);
        Log.d(TAG, "onActivityCreated() Fragment_A");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() Fragment_A");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() Fragment_A");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() Fragment_A");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() Fragment_A");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() Fragment_A");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() Fragment_A");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() Fragment_A");
    }

    @Override
    public void onClick(View v) {
        ((MainActivity) getActivity()).fragmentB();

    }
}
