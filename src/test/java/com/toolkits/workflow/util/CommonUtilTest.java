package com.toolkits.workflow.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author lsp10
 * @version $Id: CommonUtilTest.java, v 0.1 2017-12-04 17:41 lsp10 Exp $$
 */
@RunWith(MockitoJUnitRunner.class)
public class CommonUtilTest {


    /**
     * 根据status生成流程ID
     */
    @Test
    public void testGenKey(){
        String key = CommonUtil.genProcessKeyByStatus("NULL", "AC");
        Assert.assertEquals("PRO-NULL-AC", key);
    }

}