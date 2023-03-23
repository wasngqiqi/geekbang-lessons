package org.geekbang.thinking.in.spring.ioc.overview.domain;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Jack
 * @Description {@link org.geekbang.thinking.in.spring.ioc.overview.domain.UserFactoryBean}
 * @Date 2023/3/23 10:49
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}