package com.recover.yqh.dao;

import java.util.List;

import com.recover.yqh.entity.IdeaInfo;

public interface IdeaInfoMapper {
    int deleteByPrimaryKey(Integer ideaId);

    int insert(IdeaInfo record);

    int insertSelective(IdeaInfo record);

    IdeaInfo selectByPrimaryKey(Integer ideaId);

    int updateByPrimaryKeySelective(IdeaInfo record);

    int updateByPrimaryKey(IdeaInfo record);
    
    List<IdeaInfo> selecltIdeaInfosTop10();
    
}