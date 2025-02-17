package org.cloud.sonic.driver.common.tool;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PocoXYTransformerTest {
    double width = 100, height = 1000;

    @Test
    public void testOriToUP() {
        double pocoX = 100, pocoY = 50;
        double[]result = PocoXYTransformer.PocoTransformerVertical(pocoX,pocoY,width,height,270);
        Assert.assertEquals(result[0],pocoY,0);
        Assert.assertEquals(result[1],height-pocoX,0);
        System.out.printf("x:%s,y:%s",result[0],result[1]);
        System.out.println();

        result = PocoXYTransformer.PocoTransformerVertical(pocoX,pocoY,width,height,90);
        Assert.assertEquals(result[0],pocoY,0);
        Assert.assertEquals(result[1],pocoX,0);
        System.out.printf("x:%s,y:%s",result[0],result[1]);
        System.out.println();
    }

    @Test
    public void testUPToOri() {
        double upx = 50,upy = 100;
        double[]result = PocoXYTransformer.VerticalTransformerPoco(upx,upy,width,height,270);
        Assert.assertEquals(result[0],height-upy,0);
        Assert.assertEquals(result[1],upx,0);
        System.out.printf("x:%s,y:%s",result[0],result[1]);
        System.out.println();

        result = PocoXYTransformer.VerticalTransformerPoco(upx,upy,width,height,90);
        Assert.assertEquals(result[0],upy,0);
        Assert.assertEquals(result[1],upx,0);
        System.out.printf("x:%s,y:%s",result[0],result[1]);
        System.out.println();
    }
}
