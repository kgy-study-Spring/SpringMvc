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
	 * һ���򵥵�springmvc����
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		String message = "�����Ҫ���ݵ�����";
		ModelAndView mad = new ModelAndView("hello");
		// �����ݴ���modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful�����û�����api ɾ���û���Ϣ δʵ��ҵ���߼�
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ModelAndView deleteHello(@PathVariable String id) {
		// ��Ҫʵ�ֵ�ҵ���߼�
		String message = "�����Ҫ���ݵ�����deleteHello" + "====" + id;
		ModelAndView mad = new ModelAndView("userinfo");
		// �����ݴ���modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful�����û�����api �����û���Ϣ δʵ��ҵ���߼�
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public ModelAndView updateUserById(@PathVariable String id) {
		// ��Ҫʵ�ֵ�ҵ���߼�
		String message = "�����Ҫ���ݵ�����updateUserById" + "====" + id;
		ModelAndView mad = new ModelAndView("hello");
		// �����ݴ���modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful�����û�����api ��ѯ�û���Ϣ δʵ��ҵ���߼�
	 */
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public ModelAndView getUserById(@PathVariable String id) {
		// ��Ҫʵ�ֵ�ҵ���߼�
		String message = "�����Ҫ���ݵ�����getUserById" + "====" + id;
		ModelAndView mad = new ModelAndView("hello");
		// �����ݴ���modelMap
		mad.addObject("message", message);
		return mad;

	}

	/**
	 * restful�����û�����api �����û���Ϣ δʵ��ҵ���߼�
	 */
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ModelAndView addUser(User user) {
		// ��Ҫʵ�ֵ�ҵ���߼�
		String message = "�����Ҫ���ݵ�����createUser" + "====" + user.getUserName()
				+ "====" + user.getUserId() + "====" + user.userAge;
		System.out.println(message);
		ModelAndView mad = new ModelAndView("userinfo");
		// �����ݴ���modelMap
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
