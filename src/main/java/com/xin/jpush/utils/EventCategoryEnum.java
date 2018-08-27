/**
 * 对于项目信息的分类，三种信息（预警信息，震动信息，公告信息）
 */
package com.xin.jpush.utils;

public enum EventCategoryEnum {

    VOLTAGE(1, "voltage", "6"), SHAKE(2, "shake", "5"), NOTIFICATION(3, "notification", "4");

    /**
     * @param index 枚举的id
     * @param value 枚举的值
     * @param cloudIndex 不知道什么意思
     */
    private int index;
    private String value;
    private String cloudIndex;

    EventCategoryEnum(int index, String value, String cloudIndex) {
        this.index = index;
        this.value = value;
        this.cloudIndex = cloudIndex;
    }

    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }

    /**
     * @return the cloudIndex
     */
    public String getCloudIndex() {
        return cloudIndex;
    }

    /**
     * @param cloudIndex the cloudIndex to set
     */
    public void setCloudIndex(String cloudIndex) {
        this.cloudIndex = cloudIndex;
    }

    public static EventCategoryEnum get(int index) {
        switch (index) {
            case 1:
                return VOLTAGE;
            case 2:
                return SHAKE;
            case 3:
                return NOTIFICATION;
            default:
                return null;
        }
    }

    /**
     * 待补充
     * @param code
     * @return
     */
    public static EventCategoryEnum get(String code) {

        if (VOLTAGE.getValue().equalsIgnoreCase(code)) {
            return VOLTAGE;
        } else if (SHAKE.getValue().equalsIgnoreCase(code)) {
            return SHAKE;
        } else if (NOTIFICATION.getValue().equalsIgnoreCase(code)) {
            return NOTIFICATION;
        } else {
            return null;
        }
    }

    /**
     * 待补充
     * @param cloudIndex
     * @return
     */
    public static EventCategoryEnum getByCloud(String cloudIndex) {
        if (VOLTAGE.getCloudIndex().equalsIgnoreCase(cloudIndex)) {
            return VOLTAGE;
        } else if (SHAKE.getCloudIndex().equalsIgnoreCase(cloudIndex)) {
            return SHAKE;
        } else if (NOTIFICATION.getValue().equalsIgnoreCase(cloudIndex)) {
            return NOTIFICATION;
        } else {
            return null;
        }
    }

}
