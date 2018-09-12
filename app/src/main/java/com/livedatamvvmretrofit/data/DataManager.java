package com.livedatamvvmretrofit.data;


import java.util.List;

import io.reactivex.Observable;

public interface DataManager {

    Observable<List<User>> getQuestionCardData();

}
