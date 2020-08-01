/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.Exception;

/**
 * 流程引擎枚举通用接口, 主要用来定义流程引擎的业务码与异常相关的码定义
 * @author lsp10
 * @version $Id: ProcessBaseEnum.java, v 0.1 2017-11-23 20:40 lsp10 Exp $$
 */
public interface ProcessBaseEnum {

    /**
     * 获取枚举码
     * @return
     */
    public String getCode();

    /**
     * 获取枚举描述
     * @return
     */
    public String getMsg();


    /**
     * 生成log形式的记录
     * @return
     */
    public String toLog();
}
