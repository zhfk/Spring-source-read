package com.tuling.setInject;


/**
 * Created by xsls on 2019/8/22.
 */
public class InstA {

	//@Autowired
	private InstB instB;

	public InstB getInstB() {
		return instB;
	}

	public void setInstB(InstB instB) {
		this.instB = instB;
	}

	public InstA(){
		System.out.println("InstA的构造方法.....");
	}

	@Override
	public String toString() {
		return "InstA{" +
				"instB=" + instB +
				'}';
	}
}
