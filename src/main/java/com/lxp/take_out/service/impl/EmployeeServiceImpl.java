package com.lxp.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxp.reggie.entity.Employee;
import com.lxp.reggie.mapper.EmployeeMapper;
import com.lxp.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/4/27  21:30
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
