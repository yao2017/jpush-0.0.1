package com.xin.jpush.dto;

import com.xin.jpush.entity.JpushEntity;
import com.xin.jpush.utils.InfoStateEnum;

/**
 * 信息状态
 */
public class JpushExcution {
    private int state;
    private String stateInfo;
    private JpushEntity jpushEntity;

    public JpushExcution() {

    }

    public JpushExcution(InfoStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();

    }

    public JpushExcution(InfoStateEnum stateEnum, JpushEntity jpushEntity) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.jpushEntity = jpushEntity;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public JpushEntity getJpushEntity() {
        return jpushEntity;
    }

    public void setJpushEntity(JpushEntity jpushEntity) {
        this.jpushEntity = jpushEntity;
    }
}
