package com.company.project.service.impl;

import com.company.project.dao.RoomMapper;
import com.company.project.model.Room;
import com.company.project.model.RoomDto;
import com.company.project.service.RoomService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by author on 2022/04/16.
 */
@Service
@Transactional
public class RoomServiceImpl extends AbstractService<Room> implements RoomService {
    @Resource
    private RoomMapper tRoomMapper;

    @Override
    public List<RoomDto> getRoomList(){
      return tRoomMapper.getRoomList();
    }

}
