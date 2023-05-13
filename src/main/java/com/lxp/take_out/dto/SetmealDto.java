package com.lxp.reggie.dto;

import com.lxp.reggie.entity.Setmeal;
import com.lxp.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
