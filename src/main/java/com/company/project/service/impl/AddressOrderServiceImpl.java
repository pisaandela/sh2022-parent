package com.company.project.service.impl;

import com.company.project.dao.AddressOrderMapper;
import com.company.project.model.AddressOrder;
import com.company.project.service.AddressOrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by chenZiMing on 2022/04/16.
 */
@Service
@Transactional
public class AddressOrderServiceImpl extends AbstractService<AddressOrder> implements AddressOrderService {
    @Resource
    private AddressOrderMapper tAddressOrderMapper;

}
