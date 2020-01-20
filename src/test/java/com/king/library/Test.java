package com.king.library;

import com.king.library.common.tools.ReflectUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @date: 2019/12/14 20:41
 * @author: duanyong
 * @desc:
 */
public class Test {
    public Test(){
        System.out.println("Test()");
    }
    static{
        System.out.println("static{}");
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        new Test();
        System.out.println(30000-5000-4500-2000-555+30000-5000-4500-2000);
        //        Object pp=new Pp();
//        Field age = pp.getClass().getDeclaredField("age");
//        age.setAccessible(true);
//        Object a=ReflectUtil.converType(age,"23");
//        System.out.println(a.getClass());
//        age.set(pp, a);
//        System.out.println(pp);
        MyServlet m=new MyServlet();
    }

    private static class MyServlet extends DispatcherServlet {
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

