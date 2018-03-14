package matthews.curtis.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {
    // AppCompatActivity is a subclass of FragmentActivity which is how I was able to use support
    // fragments in this chapter.

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
