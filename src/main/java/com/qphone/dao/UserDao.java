package com.qphone.dao;

import com.qphone.pojo.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;

/**
 * Created by 洪坤 on 2019/7/2.
 */
public interface UserDao {
    public User getUserById(int Id);
}
