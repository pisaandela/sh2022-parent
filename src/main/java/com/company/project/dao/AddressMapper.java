package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper extends Mapper<Address> {
    /**
     * 根据排序获取小区数据
     *
     * @return
     */
    List<Address> getBySort(@Param("villageNo") String villageNo);
}