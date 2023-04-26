package com.lxp.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxp.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  22:55
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
