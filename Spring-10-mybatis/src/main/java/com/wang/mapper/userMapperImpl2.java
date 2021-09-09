package com.wang.mapper;

import com.wang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/9 0009
 */
public class userMapperImpl2 extends SqlSessionDaoSupport implements userMapper
{
    @Override
    public List <User> selectUser()
    {
//        SqlSession sqlSession = getSqlSession();
//        userMapper mapper     = sqlSession.getMapper(userMapper.class);
//        List <User> users     = mapper.selectUser();
//        return users;
        return getSqlSession().getMapper(userMapper.class).selectUser();
    }
}
