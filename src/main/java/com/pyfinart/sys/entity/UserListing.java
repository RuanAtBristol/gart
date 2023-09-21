package com.pyfinart.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-09-20
 */
@TableName("tb_user_listing")
public class UserListing implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalDateTime acceptedAt;

    private LocalDateTime cancelledAt;

    private LocalDateTime createdAt;

    private String objktId;

    private String objktName;

    private String platform;

    private BigDecimal price;

    private String userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getAcceptedAt() {
        return acceptedAt;
    }

    public void setAcceptedAt(LocalDateTime acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public LocalDateTime getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(LocalDateTime cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getObjktId() {
        return objktId;
    }

    public void setObjktId(String objktId) {
        this.objktId = objktId;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserListing{" +
            "id = " + id +
            ", acceptedAt = " + acceptedAt +
            ", cancelledAt = " + cancelledAt +
            ", createdAt = " + createdAt +
            ", objktId = " + objktId +
            ", objktName = " + objktName +
            ", platform = " + platform +
            ", price = " + price +
            ", userId = " + userId +
        "}";
    }
}
