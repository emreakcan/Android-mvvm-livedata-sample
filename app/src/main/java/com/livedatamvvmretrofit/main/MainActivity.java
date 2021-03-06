package com.livedatamvvmretrofit.main;

import android.os.Bundle;

import com.livedatamvvmretrofit.BR;
import com.livedatamvvmretrofit.R;
import com.livedatamvvmretrofit.base.BaseActivity;
import com.livedatamvvmretrofit.data.User;
import com.livedatamvvmretrofit.databinding.ActivityMainBinding;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

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
        viewModel.loadQuestionCards();
    }
}

