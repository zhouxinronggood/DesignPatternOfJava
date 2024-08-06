package simpleExample.builderPattern;

import lombok.Data;

/**
 * @Description 产品对象 汽车
 * @Author zhouxinrong
 * @Date 2024/8/5
 * @Version 1.0
 */
@Data
public class ProductCar {

    /**
     * 引擎
     */
    private String engine;

    /**
     * 轮子
     */
    private String hub;

    /**
     * 座椅
     */
    private String wheel;

    /**
     * 外壳
     */
    private String shell;
}
