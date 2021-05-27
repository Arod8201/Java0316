package test_power;

import com.ocp.day29_assert.Power;
import junit.framework.Assert;
import org.junit.Test;

public class Test_Power {

    @Test
    public void t1() {

        // 1. Arrange - 安排(目標物件)
        Power power = new Power();

        //參數配置
        int a = 100;
        int v = 220;

        // 期望結果
        int exp_w = 22000;

        // 2. Act - 目標方法(實際得到的結果)
        int act_w = power.getW(v, a);

        // 3. Assert - 驗證是否符合預期
        Assert.assertEquals(exp_w, act_w);

    }

    @Test
    public void t2() {

        // 1. Arrange - 安排(目標物件)
        Power power = new Power();

        //參數配置
        int a = 100;
        int v = 220;

        // 期望結果
        int exp_w = 22000;

        // 2. Act - 目標方法(實際得到的結果)
        int act_w = power.getW(v, a);

        // 3. Assert - 驗證是否符合預期
        Assert.assertEquals(exp_w, act_w);

    }

    @Test
    public void t3() {

        // 1. Arrange - 安排(目標物件)
        Power power = new Power();

        //參數配置
        int a = 100;
        int v = 220;

        // 期望結果
        int exp_w = 22000;

        // 2. Act - 目標方法(實際得到的結果)
        int act_w = power.getW(v, a);

        // 3. Assert - 驗證是否符合預期
        Assert.assertEquals(exp_w, act_w);

    }

}
