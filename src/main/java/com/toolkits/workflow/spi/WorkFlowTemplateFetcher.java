/**
 * lsp10@gmail.com
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.toolkits.workflow.spi;

/**
 * 流程模板获取接口，应用需实现此接口用于提供组件流程引擎的全量配置，
 *
 * 实现的beanName 定义为：workFlowTemplateFetcher
 *
 * @author lsp10
 * @version $Id: WorkFlowTemplateFetcher.java, v 0.1 2017-11-24 20:41 lsp10 Exp $$
 */
public interface WorkFlowTemplateFetcher {

    /**WorkFlowFethchResult
     * 获取全量流程配置文件或内容，具体结果返回情况可见 WorkFlowFethchResult
     * @return
     */
    public WorkFlowFethchResult getAllWorkFlowConfig();
}