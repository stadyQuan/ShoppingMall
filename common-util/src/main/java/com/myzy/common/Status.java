package com.myzy.common;

/**
 * 状态码接口表示各个状态的状态码数据
 *
 * @author quanhx
 */
public interface Status {

    /**
     * 请求成功状态码
     */
    Integer STATUS_CODE_SUCCESS = 200;

    /**
     * 请求成功
     */
    String STATUS_SUCCESS = "success";

    /**
     * 失败状态码
     */
    Integer STATUS_CODE_ERROR = 500;

    /**
     * 请求失败
     */
    String STATUS_ERROR = "error";

    /**
     * 未找到的状态码
     */
    Integer STATUS_CODE_NOT_FOUND = 404;

    /**
     * （更新，删除，插入）失败
     */
    Integer STATUS_CODE_OPERATION_ERROR = 0;

    /**
     * （更新，删除，插入）成功
     */
    Integer STATUS_CODE_OPERATION_SUCCESS = 1;
}
