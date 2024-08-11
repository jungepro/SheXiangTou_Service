package com.ruoyi.shuai.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 摄像头对象 camera
 * 
 * @author 辉哥
 * @date 2023-05-11
 */
@TableName("Camera")
public class Camera extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** IP */
    @Excel(name = "IP")
    private String ip;

    /** 协议 */
    @Excel(name = "协议")
    private String xieyi;

    /** 端口 */
    @Excel(name = "端口")
    private String port;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setXieyi(String xieyi) 
    {
        this.xieyi = xieyi;
    }

    public String getXieyi() 
    {
        return xieyi;
    }
    public void setPort(String port) 
    {
        this.port = port;
    }

    public String getPort() 
    {
        return port;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ip", getIp())
            .append("xieyi", getXieyi())
            .append("port", getPort())
            .append("type", getType())
            .append("brand", getBrand())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
