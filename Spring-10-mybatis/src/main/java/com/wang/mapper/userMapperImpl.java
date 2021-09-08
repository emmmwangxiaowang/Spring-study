package com.wang.mapper;

import com.wang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/8 0008
 */
public class userMapperImpl implements userMapper
{
    //我们的所有操作都使用sqlSession来执行,在原来,现在都是用sqlSessionTemplate;
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession)
    {
        this.sqlSession = sqlSession;
    }

    @Override
    public List <User> selectUser()
    {
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        return mapper.selectUser();
    }
}
