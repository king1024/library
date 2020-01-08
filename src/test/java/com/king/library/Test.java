package com.king.library;

import com.king.library.common.tools.ReflectUtil;

import java.lang.reflect.Field;

/**
 * @date: 2019/12/14 20:41
 * @author: duanyong
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object pp=new Pp();
        Field age = pp.getClass().getDeclaredField("age");
        age.setAccessible(true);
        Object a=ReflectUtil.converType(age,"23");
        System.out.println(a.getClass());
        age.set(pp, a);
        System.out.println(pp);
    }

}
class Pp{
    private Long age;
    private String name;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

