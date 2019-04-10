package com.stu.pattern.template.jdbc;

import com.stu.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
