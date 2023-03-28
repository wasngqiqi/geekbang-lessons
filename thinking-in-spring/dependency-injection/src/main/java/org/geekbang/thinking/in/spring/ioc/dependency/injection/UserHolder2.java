package org.geekbang.thinking.in.spring.ioc.dependency.injection;

import org.geekbang.thinking.in.spring.ioc.overview.domain.SuperUser;
import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @Author Jack
 * @Description {@link  UserHolder2}
 * @Date 2023/3/27 22:52
 */
public class UserHolder2 {

    private User user;

//    @Autowired
//    public UserHolder2(User user) {
//        this.user = user;
//    }

//    @Autowired
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @Autowired
    @Resource
    public void init(SuperUser user) {
        this.user = user;
    }



    @Override
    public String toString() {
        return "UserHolder2{" +
                "user=" + user +
                '}';
    }
}
