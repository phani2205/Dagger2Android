package com.phani.dagger2tutorial;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        System.out.println("Remote Connected");
    }
}
