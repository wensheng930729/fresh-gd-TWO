package org.gd.order.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单详细表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdOrdershop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderid;

    /**
     * 商品ID
     */
    @TableField("comdityId")
    private Integer comdityId;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 优惠方式
     */
    private Integer preferentialway;

    /**
     * 应付价格
     */
    private String comdityprice;

    /**
     * 实付价格
     */
    private String comditytrueprice;


}
