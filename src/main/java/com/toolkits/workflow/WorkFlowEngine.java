/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow;

import com.toolkits.workflow.Exception.WorkFlowException;
import com.toolkits.workflow.model.Instruction;

/**
 * 流程引擎统一api
 * @author lsp10
 * @version $Id: WorkFlowEngine.java, v 0.1 2017-11-24 11:40 lsp10 Exp $$
 */
public interface WorkFlowEngine {


    /**
     * 进入流程引擎
     * @param instruction
     */
    public void launch(Instruction instruction) throws WorkFlowException;
}