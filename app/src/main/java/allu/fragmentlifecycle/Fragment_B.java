package allu.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_B extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment_B", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment_B", "onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Fragment_B", "onCreateView()");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment_B", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment_B", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment_B", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment_B", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment_B", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment_B", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment_B", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment_B", "onDetach()");
    }


}
