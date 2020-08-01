/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.model.runtime;

/**
 *
 * @author lsp10
 * @version $Id: RunTimeContextHolder.java, v 0.1 2017-11-24 14:48 lsp10 Exp $$
 */
public class RunTimeContextHolder {

    /** 线程变量 */
    private final static ThreadLocal<WorkFlowRunTimeContext> threadLocal = new ThreadLocal<WorkFlowRunTimeContext>();

    /**
     * 创建 WorkFlowRunTimeContext
     * @return
     */
    public static WorkFlowRunTimeContext createWorkFlowRunTimeContext() {
        WorkFlowRunTimeContext runTimeContext = new WorkFlowRunTimeContext();
        threadLocal.set(runTimeContext);
        return runTimeContext;
    }

    /**
     * 获取WorkFlowRunTimeContext
     * @return
     */
    public static WorkFlowRunTimeContext getRunTimeContext() {
        return threadLocal.get();
    }

    /**
     * 清除环境变量
     */
    public static void cleanAll() {
        threadLocal.remove();
    }

}