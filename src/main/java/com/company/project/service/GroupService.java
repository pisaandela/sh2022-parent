package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.Group;


/**
 * Created by author on 2022/04/17.
 */
public interface GroupService extends Service<Group> {
    /**
     * 根据表名导入团购信息
     *
     * @return
     */
    Group importExcelData(String excelName);
}
