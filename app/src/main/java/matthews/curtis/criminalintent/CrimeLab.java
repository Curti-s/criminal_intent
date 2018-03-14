package matthews.curtis.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by curti.s_ on 3/14/2018.
 */

public class CrimeLab {
    // implemented as a singleton which is a class that only allows one instance of itself to be created.
    // A singleton exists as long as the application stays in memory.
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    // list of crimes
    private List<Crime> mCrimes;

    // constructor
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime # " + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime crime : mCrimes) {
            if(crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }


}
