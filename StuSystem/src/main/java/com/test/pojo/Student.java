package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String stu_id;
    private String stu_name;
    private String stu_collage;
    private String stu_major;
    private String stu_pwd;
}
