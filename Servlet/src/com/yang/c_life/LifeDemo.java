package com.yang.c_life;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yang on 2/6/17.
 */
@WebServlet(name = "LifeDemo")
public class LifeDemo extends HttpServlet {
    /**
     * 1.构造方法
     */
    public LifeDemo() {
        System.out.println("1. servlet 对象被创建");
    }

    /**
     * 2. init 方法
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("2. init 方法被调用");
    }

    /**
     * 3. service 方法
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("3. service 方法被调用");
    }

    /**
     * 4. destroy 方法
     */
    @Override
    public void destroy() {
        System.out.println("4. servlet 对象被销毁");
    }
}
