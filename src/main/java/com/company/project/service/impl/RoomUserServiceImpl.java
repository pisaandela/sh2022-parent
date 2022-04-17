package com.company.project.service.impl;

import com.company.project.dao.RoomUserMapper;
import com.company.project.model.RoomUser;
import com.company.project.service.RoomUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by chenZiMing on 2022/04/16.
 */
@Service
@Transactional
public class RoomUserServiceImpl extends AbstractService<RoomUser> implements RoomUserService {
    @Resource
    private RoomUserMapper tRoomUserMapper;

}
