package org.sbd.t.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;

/**
 * @description: @see
 * @author: LaoCat
 * @date: 2023/2/14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends Model<User> implements Serializable {

    @TableId
    private Long id;

    private String nickName;

    private String realName;

    private Integer sex;

}

