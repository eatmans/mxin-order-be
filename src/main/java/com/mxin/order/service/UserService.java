package com.mxin.order.service;

import com.mxin.order.domain.User;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/29
 */
public interface UserService {

    User findUserByPhone(String phone);
}
