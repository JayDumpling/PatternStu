package com.stu.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther : Dumpling
 * @Description
 **/
public abstract class JDBCTemplate {
    private DataSource dataSource;

    protected JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] args)
    {
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPreparedStatement(conn, sql);
            //3.执行语句集
            ResultSet rs = this.executeQuery(pstm, args);
            //4.处理结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closeStatement(pstm);
            //7.关闭连接
            this.closeConnection(conn);
            return result;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private void closeConnection(Connection conn) throws Exception{
        //连接池的话不是关闭
        conn.close();
    }

    private void closeStatement(PreparedStatement pstm) throws Exception{
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws Exception{
        rs.close();
    }

    private List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception{
        List<Object> result = new ArrayList<Object>();
        int i = 1;
        while (rs.next())
        {
            result.add(rowMapper.mapRow(rs,i++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] args) throws Exception{
        for (int i=0;i<args.length;i++)
        {
            pstm.setObject(i,args[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws Exception{
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }
}
