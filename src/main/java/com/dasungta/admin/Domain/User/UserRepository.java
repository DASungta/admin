package com.dasungta.admin.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 17:58
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    //通过年龄来查询
    public User findUserByUsername(String username);

}
