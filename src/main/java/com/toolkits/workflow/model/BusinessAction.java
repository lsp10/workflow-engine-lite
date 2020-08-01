/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.model;

import com.toolkits.workflow.Exception.BusinessActionException;

/**
 * 业务处理Action-所有的业务逻辑都在此接口中实现
 * @author lsp10
 * @version $Id: BusinessAction.java, v 0.1 2017-11-24 15:16 lsp10 Exp $$
 */
public interface BusinessAction {
    /**
     * 执行Action操作
     *
     * @param context
     * @throws BusinessActionException
     */
    public void process(WorkFlowContext context) throws BusinessActionException;
}