package test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import test.user.bean.User;

@Controller
@RequestMapping("/mvc")
public class MVCController {

	/**
	 * 一个简单的springmvc例子
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		String message = "这个是要传递的数据";
		ModelAndView mad = new ModelAndView("hello");
		// 将数据存入modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful风格的用户操作api 删除用户信息 未实现业务逻辑
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ModelAndView deleteHello(@PathVariable String id) {
		// 你要实现的业务逻辑
		String message = "这个是要传递的数据deleteHello" + "====" + id;
		ModelAndView mad = new ModelAndView("userinfo");
		// 将数据存入modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful风格的用户操作api 更新用户信息 未实现业务逻辑
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public ModelAndView updateUserById(@PathVariable String id) {
		// 你要实现的业务逻辑
		String message = "这个是要传递的数据updateUserById" + "====" + id;
		ModelAndView mad = new ModelAndView("hello");
		// 将数据存入modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful风格的用户操作api 查询用户信息 未实现业务逻辑
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ModelAndView getUserById(@PathVariable String id) {
		// 你要实现的业务逻辑
		String message = "这个是要传递的数据getUserById" + "====" + id;
		ModelAndView mad = new ModelAndView("hello");
		// 将数据存入modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful风格的用户操作api 新增用户信息 未实现业务逻辑
	 */
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ModelAndView addUser(User user) {
		// 你要实现的业务逻辑
		String message = "这个是要传递的数据createUser" + "====" + user.getUserName()
				+ "====" + user.getUserId() + "====" + user.userAge;
		System.out.println(message);
		ModelAndView mad = new ModelAndView("userinfo");
		// 将数据存入modelMap
		mad.addObject("message", message);
		return mad;

	}

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		System.out.println(b += (c-- / ++a));
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			count += i;
		}
		System.out.println(count);
		int t[] = new int[10];

		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.out.println(str1 == str2);

		int i=1,j=10; 
	    do{ 
	           if(i++>--j) continue; 
	     }while(i<5); 
	    System.out.println(i+"==="+j);
	    
       

	}

}
