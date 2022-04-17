package com.company.project.service;
import com.company.project.model.Room;
import com.company.project.core.Service;
import com.company.project.model.RoomDto;

import java.util.List;


/**
 * Created by chenZiMing on 2022/04/16.
 */
public interface RoomService extends Service<Room> {
    /**
     * 获取房间编号
     * @return
     */
    List<RoomDto> getRoomList();
}
