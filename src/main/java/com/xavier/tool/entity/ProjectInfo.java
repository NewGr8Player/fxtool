package com.xavier.tool.entity;

import com.xavier.tool.entity.base.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 项目信息
 */
@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "tb_project_info")
public class ProjectInfo extends BaseEntity {

    /**
     * 项目路径
     */
    private String projectPath;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目备注
     */
    private String projectComment;
}
