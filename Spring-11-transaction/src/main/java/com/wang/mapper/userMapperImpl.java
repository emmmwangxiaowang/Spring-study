package com.wang.mapper;

import com.wang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/9 0009
 */
public class userMapperImpl extends SqlSessionDaoSupport implements userMapper
{
    @Override
    public List <User> selectUser()
    {
        User       user   = new User(6, "emmm", "123");
        userMapper mapper = getSqlSession().getMapper(userMapper.class);
        mapper.addUser(user);

        mapper.delUser(6);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user)
    {
        return getSqlSession().getMapper(userMapper.class).addUser(user);
    }

    @Override
    public int delUser(int id)
    {
        return getSqlSession().getMapper(userMapper.class).delUser(id);
    }
}
