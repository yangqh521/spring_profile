package others;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.recover.yqh.dao.IdeaInfoMapper;

public class BeanTest {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IdeaInfoMapper mapper = (IdeaInfoMapper)ac.getBean(IdeaInfoMapper.class);
		System.out.println("list >>> "+JSONObject.toJSONString(mapper.selecltIdeaInfosTop10()));
		
		
		
	}
}
