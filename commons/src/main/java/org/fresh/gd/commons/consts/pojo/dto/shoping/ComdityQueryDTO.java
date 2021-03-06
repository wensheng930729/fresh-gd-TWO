package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019/5/14 17:40
 * @Author 郭家恒
 * @Description TODO
 */
@ApiModel("商品信息查询条件模型")
@Data
public class ComdityQueryDTO {
    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String comdityname;

    /**
     * 商品类别
     */
    @ApiModelProperty("商品类别")
    private Integer comditytypeId;

    @ApiModelProperty("商品编码")
    private String comdityBM;

    /**
     * 所属店铺ID
     */
    @ApiModelProperty("所属店铺ID")
    private Integer storeid;

    @ApiModelProperty("商品状态 0-上架中 1-下架")
    private Integer comstate;

}
