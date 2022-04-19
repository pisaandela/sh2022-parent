package com.company.project.service.impl;

import com.company.project.model.Group;
import com.company.project.service.GroupService;
import com.company.project.service.OrderService;
import com.conpany.project.Tester;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupServiceImplTest extends Tester {
    @Autowired
    private GroupService groupService;
    @Autowired
    private OrderService orderService;

    @Test
    public void testImportExcelData() {
        Group group = groupService.importExcelData("");


        orderService.getByGroup(group);
    }
}