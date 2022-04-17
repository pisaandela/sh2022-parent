package com.company.project.model;

import javax.persistence.*;

@Table(name = "t_room_user")
public class RoomUser {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 房间id
     */
    @Column(name = "room_id")
    private Long roomId;

    /**
     * 人员id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 顺序
     */
    private Integer sort;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取房间id
     *
     * @return room_id - 房间id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置房间id
     *
     * @param roomId 房间id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取人员id
     *
     * @return user_id - 人员id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置人员id
     *
     * @param userId 人员id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}