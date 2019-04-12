package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "s_user")   /*指定数据库的表名*/
public class User {
    @Id       /*表名当前属性为数据库主键*/
    @KeySql(useGeneratedKeys = true)     /*当前主键为自增长*/
    @Column(name = "userid")     /*指定数据库表中的字段名*/
    public Integer userId;
    @Column(name = "username")
    public String username;
    private String password;
    private Integer sex;


}