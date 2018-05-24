package com.recover.yqh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.recover.yqh.dao.IdeaInfoMapper;
import com.recover.yqh.entity.IdeaInfo;


@Controller
@RequestMapping("/idea")
public class IdeaInfoController {

	
	@Autowired
	private IdeaInfoMapper ideaInfoMapper;
	
	@RequestMapping("/top")
	@ResponseBody
	public List<IdeaInfo> getTop10(){
		System.out.println(">>>>>>>>>>>>>>> get Top 10 of ideaInfo >>>>>>>>>>>>>>>");
		List<IdeaInfo> list = ideaInfoMapper.selecltIdeaInfosTop10();
		System.out.println("---------------------------------------------------------------------");
		if(list != null && list.size() > 0){
			for (IdeaInfo ideaInfo : list) {
				System.out.println( "IdeaId:" + ideaInfo.getIdeaId() + "， IdeaName: " + ideaInfo.getIdeaName());
			}
		}
		System.out.println("---------------------------------------------------------------------");
		return list;
	}
	
	
}
