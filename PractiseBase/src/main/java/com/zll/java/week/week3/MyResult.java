package com.zll.java.week.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MyResult
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/19
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MyResult {
    private  Integer max;
    private  Integer min;
    private  Integer sum;
}
