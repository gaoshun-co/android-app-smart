package com.nsxz.smart.repository;

import com.nsxz.smart.db.dao.UserDao;
import com.nsxz.smart.network.request.Request;

import java.util.concurrent.Executor;

public class UserRepository {
    Request request;
//    UserDao userDao;
    Executor executor;

    public UserRepository(Request request, UserDao userDao, Executor executor) {
        this.request = request;
//        this.userDao = userDao;
        this.executor = executor;
    }

//    public LiveData<User> getUser(int userID){
//        refreshUser(userID);
//
//        return userDao.load(userID);
//    }

    private void refreshUser(final int userID){
        executor.execute(new Runnable() {
            @Override
            public void run() {
//                boolean userExists =
            }
        });
    }
}