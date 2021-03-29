package com.logical.classExamples;

public class OverloadMain {

	public static void main(String[] args) {
		OverLoadDemo demo=new OverLoadDemo();
		demo.test();
		demo.test(123.0);
		demo.test(125);
		demo.test(145.0, 745);
		demo.test(169, 178.012);
		demo.test(456, 321);

	}

}
