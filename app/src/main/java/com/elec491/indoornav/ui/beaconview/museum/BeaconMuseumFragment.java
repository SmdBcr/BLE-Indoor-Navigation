package com.elec491.indoornav.ui.beaconview.museum;

import com.nexenio.bleindoorpositioning.ble.beacon.BeaconUpdateListener;
import com.nexenio.bleindoorpositioning.location.LocationListener;
import com.elec491.indoornav.ui.beaconview.BeaconViewFragment;

public class BeaconMuseumFragment extends BeaconViewFragment {
    @Override
    protected LocationListener createDeviceLocationListener() {
        return null;
    }

    @Override
    protected BeaconUpdateListener createBeaconUpdateListener() {
        return null;
    }

    @Override
    protected int getLayoutResourceId() {
        return 0;
    }
}
