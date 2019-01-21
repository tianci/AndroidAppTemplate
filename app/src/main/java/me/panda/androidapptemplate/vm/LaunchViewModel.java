package me.panda.androidapptemplate.vm;

import android.app.Application;
import android.support.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseViewModel;

public class LaunchViewModel extends BaseViewModel {

    public String hello = "Hello World!";

    public LaunchViewModel(@NonNull Application application) {
        super(application);
    }
}
