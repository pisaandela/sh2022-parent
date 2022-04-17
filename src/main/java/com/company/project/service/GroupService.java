package com.company.project.service;
import com.company.project.model.Group;
import com.company.project.core.Service;


/**
 * Created by chenZiMing on 2022/04/17.
 */
public interface GroupService extends Service<Group> {
    /**
     * 团购导入
     * @return
     */
    Group importExcelData();
}
