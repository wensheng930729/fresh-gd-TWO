package org.fresh.gd.commons.consts.pojo.dto.vip;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/28 15:33
 * @Description: 查询会员参数类
 */

@ApiModel("参数DTO-分页查询会员")
@Data
public class SelPageVipDTO {

    @ApiModelProperty("会员姓名")
    private String vipName;

    @ApiModelProperty("会员等级")
    private Integer viplv;

    @NotEmpty
    @ApiModelProperty("从第几页开始")
    private Integer pageNo;

    @NotEmpty
    @ApiModelProperty("每页显示条数")
    private Integer pageSize;
}
