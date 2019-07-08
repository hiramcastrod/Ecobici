package ecobici.castro.hiram.ecobici;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ecobici.castro.hiram.ecobici.View.BranchOfficeListFragment;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fr =  new BranchOfficeListFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tr = fm.beginTransaction();
        tr.replace(R.id.container, fr);
        tr.commit();
    }
}
