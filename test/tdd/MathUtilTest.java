/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.fu.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author DELL
 */
public class MathUtilTest {
    @Test
    public void TestSuccessfulCases(){
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void TestFailedCase(){
        MathUtil.computeFactorial(1);
    }
}
