package com.stu.pattern.template.jdbc.dao;

import com.stu.pattern.template.jdbc.JDBCTemplate;
import com.stu.pattern.template.jdbc.Member;
import com.stu.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Auther : Dumpling
 * @Description
 **/
public class MemberDao extends JDBCTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }
    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int row) throws Exception {
                Member member = new Member();
                //属性比较多可以使用原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getString("age"));
                return member;
            }
        },null);
    }
}
