package com.stu.pattern.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther : Dumpling
 * @Description 处理结果集接口
 **/
public interface RowMapper<T> {
    T mapRow(ResultSet rs,int row) throws Exception;
}
