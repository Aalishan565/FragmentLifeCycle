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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment_A", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment_A", "onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Fragment_A", "onCreateView()");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnClick = (Button) getActivity().findViewById(R.id.btn_click);
        mBtnClick.setOnClickListener(this);
        Log.d("Fragment_A", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment_A", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment_A", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment_A", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment_A", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment_A", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment_A", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment_A", "onDetach()");
    }

    @Override
    public void onClick(View v) {
        ((MainActivity) getActivity()).fragmentB();

    }
}
