package com.lxp.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxp.reggie.common.BaseContext;
import com.lxp.reggie.entity.ShoppingCart;
import com.lxp.reggie.mapper.ShoppingCartMapper;
import com.lxp.reggie.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/5  16:49
 */
@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
    @Override
    public void clean() {
        //sql:delete from shopping_cart where userId =？
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId, BaseContext.getCurrentId());
        //如果直接注入ShoppingCartService是有可能报循环依赖的
        this.remove(queryWrapper);
    }
}
