package com.livedatamvvmretrofit.data;


import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.List;

import io.reactivex.Observable;

public class AppDataManager implements DataManager {

    @Override
    public Observable<List<User>> getQuestionCardData() {
        return Rx2AndroidNetworking.get("https://jsonplaceholder.typicode.com/users")
                .build()
                .getObjectListObservable(User.class);
    }
}
