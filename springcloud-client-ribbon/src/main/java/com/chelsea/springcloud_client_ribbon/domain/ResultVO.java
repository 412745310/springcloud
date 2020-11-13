package com.chelsea.springcloud_client_ribbon.domain;

import lombok.Builder;
import lombok.Data;

/**
 * <b>System：</b>ncc<br/>
 * <b>Title：</b>ApplyResultVO.java<br/>
 * <b>Description：</b> 对功能点的描述<br/>
 * <b>@author： </b>raoluping<br/>
 * <b>@date：</b>2017/11/29 15:08<br/>
 * <b>@version：</b> 1.0.0.0 <br/>
 * <b>Copyright (c) 2017 ASPire Tech.</b>
 */
@Data
@Builder
public class ResultVO {

    private int status;

    private Object data;

    private String message;
}
