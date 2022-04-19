package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.Address;

import java.util.List;


/**
 * Created by author on 2022/04/16.
 */
public interface AddressService extends Service<Address> {
    /**
     * 获取排序后的地址结果
     *
     * @return
     */
    List<Address> getBySort(String villageNo);
}
