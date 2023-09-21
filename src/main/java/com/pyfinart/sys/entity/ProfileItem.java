package com.pyfinart.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-09-20
 */
@TableName("tb_profile_item")
public class ProfileItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String displayUri;

    private String platform;

    private String currency;

    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayUri() {
        return displayUri;
    }

    public void setDisplayUri(String displayUri) {
        this.displayUri = displayUri;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProfileItem{" +
            "id = " + id +
            ", name = " + name +
            ", displayUri = " + displayUri +
            ", platform = " + platform +
            ", currency = " + currency +
            ", price = " + price +
        "}";
    }
}
