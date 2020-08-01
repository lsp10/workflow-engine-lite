/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.spi;

import com.toolkits.workflow.model.BusinessAction;
import com.toolkits.workflow.model.ProcessRouter;

/**
 * action， router等组件获取的接口, 接入组件的应用需实现此接口
 * beanName统一定义为：componentFetcher
 * @author lsp10
 * @version $Id: ComponentFetcher.java, v 0.1 2017-11-24 16:00 lsp10 Exp $$
 */
public interface ComponentFetcher {

    /**
     * 根据bean的名字获取对应的bean实例
     * @param beanName bean名字
     * @return
     */
    public BusinessAction getActionByName(String beanName);

    /**
     * 根据 bean的名字获取对应的bean实例
     * @param beanName bean名字
     * @return
     */
    public ProcessRouter getRouterByName(String beanName);
}