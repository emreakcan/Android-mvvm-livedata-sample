package com.livedatamvvmretrofit.main;

import android.os.Bundle;

import com.livedatamvvmretrofit.BR;
import com.livedatamvvmretrofit.R;
import com.livedatamvvmretrofit.base.BaseActivity;
import com.livedatamvvmretrofit.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainViewModel> implements MainView {

    @Inject
    MainViewModel viewModel;
    private ActivityMainBinding mActivityLoginBinding;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityLoginBinding = getViewDataBinding();
        viewModel.setNavigator(this);
    }
}

