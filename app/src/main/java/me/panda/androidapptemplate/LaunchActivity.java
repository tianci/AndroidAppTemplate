package me.panda.androidapptemplate;

import android.os.Bundle;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.panda.androidapptemplate.databinding.ActivityLaunchBinding;
import me.panda.androidapptemplate.vm.LaunchViewModel;

public class LaunchActivity extends BaseActivity<ActivityLaunchBinding, LaunchViewModel> {

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_launch;
    }

    @Override
    public int initVariableId() {
        return BR.vm;
    }
}
