package com.pyfinart.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-09-20
 */
@TableName("tb_user_actions")
public class UserActions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDateTime createdAt;

    private Integer numericValue;

    private String objktId;

    private Integer objktIssuerId;

    private String objktIssuerName;

    private String objktName;

    private String platform;

    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(Integer numericValue) {
        this.numericValue = numericValue;
    }

    public String getObjktId() {
        return objktId;
    }

    public void setObjktId(String objktId) {
        this.objktId = objktId;
    }

    public Integer getObjktIssuerId() {
        return objktIssuerId;
    }

    public void setObjktIssuerId(Integer objktIssuerId) {
        this.objktIssuerId = objktIssuerId;
    }

    public String getObjktIssuerName() {
        return objktIssuerName;
    }

    public void setObjktIssuerName(String objktIssuerName) {
        this.objktIssuerName = objktIssuerName;
    }

    public String getObjktName() {
        return objktName;
    }

    public void setObjktName(String objktName) {
        this.objktName = objktName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserActions{" +
            "id = " + id +
            ", createdAt = " + createdAt +
            ", numericValue = " + numericValue +
            ", objktId = " + objktId +
            ", objktIssuerId = " + objktIssuerId +
            ", objktIssuerName = " + objktIssuerName +
            ", objktName = " + objktName +
            ", platform = " + platform +
            ", type = " + type +
        "}";
    }
}
