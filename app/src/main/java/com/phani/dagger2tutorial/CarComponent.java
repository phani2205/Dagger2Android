package com.phani.dagger2tutorial;


import javax.inject.Inject;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
