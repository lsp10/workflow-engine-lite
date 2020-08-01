/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.model.config;

import com.toolkits.workflow.spi.ComponentFetcher;

/**
 * 初始化统一接口定义
 * @author lsp10
 * @version $Id: Initable.java, v 0.1 2017-11-24 16:03 lsp10 Exp $$
 */
public interface Initable {

    /**
     * 初始化统一接口，
     * @param componentFetcher 获取对应Component的的bean
     */
    public void init(ComponentFetcher componentFetcher);
}