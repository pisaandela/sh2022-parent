package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.AddressMapper;
import com.company.project.model.Address;
import com.company.project.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by author on 2022/04/16.
 */
@Service
@Transactional
public class AddressServiceImpl extends AbstractService<Address> implements AddressService {
    @Resource
    private AddressMapper tAddressMapper;

    @Override
    public List<Address> getBySort(String villageNo) {
        return tAddressMapper.getBySort(villageNo);
    }
}
