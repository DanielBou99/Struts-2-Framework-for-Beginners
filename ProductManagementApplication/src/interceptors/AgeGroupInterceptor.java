package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("AgeGroupInterceptor - destroy() called");
	}

	@Override
	public void init() {
		System.out.println("AgeGroupInterceptor - init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("AgeGroupInterceptor - Pre-processing");
		ValueStack stack = ai.getStack();
		Integer price = (Integer) stack.findValue("productPrice");
		String name = stack.findString("productName");
		
		System.out.println("AgeGroupInterceptor - price before = " + price);
		System.out.println("AgeGroupInterceptor - name before = " + name);
		
		stack.set("productName", "INTERCEPTOR");
		stack.set("productPrice", 1);
		
		
		System.out.println("AgeGroupInterceptor - price after = " + price);
		System.out.println("AgeGroupInterceptor - name after = " + name);
		
		String result = ai.invoke();
		
		System.out.println("AgeGroupInterceptor - Post-processing");
		
		return result;
	}
	
	

}
