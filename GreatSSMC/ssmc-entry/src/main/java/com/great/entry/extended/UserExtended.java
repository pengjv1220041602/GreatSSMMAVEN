package com.great.entry.extended;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.great.entry.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ZhPJ
 * @Date 2018/9/29 002917:52
 * @Version 1.0
 * @Description:
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserExtended extends User {
    // @JsonIgnore 注解可以防止使用ObjectMapper将其转换成JSON串
    @JsonIgnore
    private String vip;
}
