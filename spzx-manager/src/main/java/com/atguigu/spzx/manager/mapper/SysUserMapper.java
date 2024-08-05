package com.atguigu.spzx.manager.mapper;

import com.atguigu.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: chengly
 * @Date: 2024/7/15 16:00
 */
@Mapper
public interface SysUserMapper {
    SysUser selectByUserName(String userName);
}
