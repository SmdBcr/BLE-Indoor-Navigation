package com.elec491.indoornav.ui.beaconview.museum;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.Nullable;

import com.nexenio.bleindoorpositioning.ble.beacon.Beacon;
import com.nexenio.bleindoorpositioning.location.Location;
import com.elec491.indoornav.ui.beaconview.BeaconView;



public class BeaconMuseum extends BeaconView {

    private static final String TAG = BeaconMuseum.class.getSimpleName();


    public BeaconMuseum(Context context) {
        super(context);
    }

    public BeaconMuseum(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BeaconMuseum(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BeaconMuseum(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void drawDevice(Canvas canvas) {

    }

    @Override
    protected void drawBeacon(Canvas canvas, Beacon beacon) {

    }

    @Override
    protected PointF getPointFromLocation(Location location) {
        return null;
    }




    public static void printArtifact(int artPiece) {
        switch (artPiece) {
            case 1:
                Log.d(TAG, "result: Mona Lisa" );
                break;
            case 2:
                Log.d(TAG, "result: Last supper" );
                break;
            case 3:
                Log.d(TAG, "result: Starry Night" );
                break;
            default:
                //print def
        }
    }







}
