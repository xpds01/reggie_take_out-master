package com.lxp.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxp.reggie.entity.AddressBook;
import com.lxp.reggie.mapper.AddressBookMapper;
import com.lxp.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/1  21:08
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
