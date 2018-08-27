package com.xin.jpush.utils;

/**
 * 操作消息状态
 */
public enum InfoStateEnum {
    OPERATIONFAILED(1, "操作失败"), OPERATIONSUCCESS(2, "操作成功"), OFFLINE(-1, "非法消息"), EMPTY(0, "消息为空");

    private int state;
    private String stateInfo;

    private InfoStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static InfoStateEnum stateEnum(int Index) {
        for (InfoStateEnum stateEnum : values()) {
            if (stateEnum.getState() == Index) {
                return stateEnum;
            }
        }
        return null;
    }
}
