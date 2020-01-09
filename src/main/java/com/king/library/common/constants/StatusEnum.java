package com.king.library.common.constants;

/**
 * @date: 2019/12/25 11:27
 * @author: duanyong
 * @desc:
 */
public enum StatusEnum {
    SUCCESS("200","成功"),
    ERROR("500","失败"),

    E_400("400", "请求处理异常，请稍后再试"),
    E_500("500", "请求方式有误,请检查 GET/POST"),
    E_501("501", "请求路径不存在"),
    E_502("502", "权限不足"),
    E_10008("10008", "角色删除失败,尚有用户属于此角色"),
    E_10009("10009", "账户已存在"),
    E_20011("20011", "登陆已过期,请重新登陆"),
    E_90003("90003", "缺少必填参数"),

    NORMAL("1", "正常"),
    DISABLE("0", "禁用"),;
    private String code;
    private String desc;

    StatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static StatusEnum get(String code) {
        if (null == code) {
            return NORMAL;
        }
        StatusEnum[] enums = StatusEnum.values();
        for (StatusEnum anEnum : enums) {
            if (anEnum.getCode().equals(code)) {
                return anEnum;
            }
        }
        return NORMAL;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
