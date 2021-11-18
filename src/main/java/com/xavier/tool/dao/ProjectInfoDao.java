package com.xavier.tool.dao;

import com.xavier.tool.entity.ProjectInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProjectInfoDao extends JpaRepository<ProjectInfo,String> {
}
