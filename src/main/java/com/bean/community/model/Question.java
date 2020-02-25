package com.bean.community.model;

import lombok.Data;

@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private String tag;
    private Long gmtModified;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private String creator;

}
