package com.phani.dagger2tutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }


    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){

        Log.d(TAG, "drive...");

    }
}
