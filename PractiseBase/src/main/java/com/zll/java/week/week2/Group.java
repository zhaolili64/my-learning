package com.zll.java.week.week2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Group
 * @Description TODO
 * @Author Finger
 * @Date 10/12/2020
 **/

@AllArgsConstructor
@Setter
@ToString
@Getter
public class Group {
    private String groupId;
    private Student[] student;
}
