package com.lxp.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxp.reggie.entity.ShoppingCart;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/5  16:48
 */
public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
