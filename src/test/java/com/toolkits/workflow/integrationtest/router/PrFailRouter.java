/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.integrationtest.router;

import org.springframework.stereotype.Component;

import com.toolkits.workflow.model.WorkFlowContext;
import com.toolkits.workflow.util.LoggerUtil;

/**
 *
 * @author lsp10
 * @version $Id: PrFailRouter.java, v 0.1 2017-12-28 16:16 lsp10 Exp $$
 */
@Component("prFailRouter")
public class PrFailRouter extends AcceptSuccessRouter {

    /**
     * 设置路由目标状态
     *
     * @param workFlowContext
     * @return
     */
    @Override
    public WorkFlowContext setDestStatus(WorkFlowContext workFlowContext) {
        workFlowContext.getInstruction().setDestStatus("FA");
        LoggerUtil.info(logger, this.getClass().getSimpleName(), "设置目标状态:", workFlowContext);

        return workFlowContext;
    }
}