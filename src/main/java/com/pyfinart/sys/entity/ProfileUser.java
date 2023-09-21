package com.pyfinart.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-09-20
 */
@TableName("tb_profile_user")
public class ProfileUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String flag;

    private String description;

    private String avatarUri;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
    }

    @Override
    public String toString() {
        return "ProfileUser{" +
            "id = " + id +
            ", name = " + name +
            ", flag = " + flag +
            ", description = " + description +
            ", avatarUri = " + avatarUri +
        "}";
    }
}
