package matthews.curtis.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by curti.s_ on 3/14/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
