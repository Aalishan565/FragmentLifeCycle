package allu.fragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.fram_container);
        Fragment_A fragment = new Fragment_A();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fram_container, fragment, "Fragment_A");
        fragmentTransaction.commit();
      //  Log.d("Activity", "onCreate()");

    }

    public void fragmentB() {
        Fragment_B fragment = new Fragment_B();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fram_container, fragment, "Fragment_B");
        fragmentTransaction.addToBackStack("Fragment_A");
        fragmentTransaction.commit();
    }
/*
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity", "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity", "onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity", "onDestroy()");
    }*/
}
