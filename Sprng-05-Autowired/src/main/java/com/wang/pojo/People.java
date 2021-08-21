package com.wang.pojo;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/8/21 0021
 */
public class People
{
    private Cat    cat;
    private Dog    dog;
    private String name;

    @Override
    public String toString()
    {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat()
    {
        return cat;
    }

    public void setCat(Cat cat)
    {
        this.cat = cat;
    }

    public Dog getDog()
    {
        return dog;
    }

    public void setDog(Dog dog)
    {
        this.dog = dog;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
