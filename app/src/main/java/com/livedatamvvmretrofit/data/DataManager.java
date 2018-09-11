package com.livedatamvvmretrofit.data;

import android.database.Observable;

import java.util.List;

public interface DataManager {

    Observable<List<User>> getQuestionCardData();

}
