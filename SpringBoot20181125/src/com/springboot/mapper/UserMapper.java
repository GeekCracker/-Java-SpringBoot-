package com.springboot.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.springboot.domain.User;

public interface UserMapper {

	@Select("select * from t_user where id = #{id}")
	@Results(value={
			@Result(column="user_name",property="userName",jdbcType=JdbcType.VARCHAR),
			@Result(column="user_password",property="userPassword",jdbcType=JdbcType.VARCHAR)})
	public User queryById(String id);
}
