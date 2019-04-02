package com.stu.pattern.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class DispatcherServlet extends HttpServlet {

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");
        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(id);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(id);
        } else if ("login".equals(uri)) {
            new SystemController().login();
        } else {
            resp.getWriter().write("404 Not Found!!");
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }
}
