package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author catherine sun
 * @email catherine.sun20@gmail.com
 * @date 2022-07-10 21:17:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    //找到cateLogId的完整路径
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}

