package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Group;
import com.company.project.model.Order;
import com.company.project.model.OrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends Mapper<Order> {
    List<OrderVo> getByProductNo(@Param("productNo") String productNo);
    List<OrderVo> getByGroupNo(@Param("group") Group group);
}