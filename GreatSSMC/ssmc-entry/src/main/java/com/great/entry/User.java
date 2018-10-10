package com.great.entry;

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
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
}
