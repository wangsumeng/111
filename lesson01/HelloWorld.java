//	这是单行注释
//	package : 这是包名
package com.msr.lesson01;
/*
 * 	这是一个类
 * 	类的结构 :  修饰符  class 类名{}
 * 	public : 表示公共的,是一个修饰符,是权限修饰符
 */
public class HelloWorld {
	
	/*
	 * 	这是一个主函数
	 * 	主函数 : 是程序的入口,是和JVM约定好的JVM的入口.
	 * 	static : 表示静态的
	 * 	void : 函数没有返回值
	 * 	main : 函数名
	 * 	String : 代表字符串 : 凡是""中间的内容都属于字符串
	 * 	[] : 代表数组
	 * 	args : arguments : 参数
	 * 	args是一个标识符(凡是自己可以起名字的地方都属于标识符)
	 */
	public static void main(String[] aa) {
		//	这回死一个输出语句 
		System.out.println("helloworld");//字符串
		System.out.println("helloworld");
		System.out.println(123);//	整数
		System.out.println(35.66);//	小数/浮点型数据
		System.out.println(true);//		布尔类型/boolean类型
		System.out.println(false);
		System.out.println('a');//	是一个字符,只能是一个字符
		System.out.println('武');//	一个汉字也是一个字符
		System.out.println('\u0000');
		System.out.println(' ');
		System.out.println("over");
		
		/*
		 * 	起名规则 :
		 * 		1. 只能使用0~9/a~z大小写/_/$这64个字符来命名.
		 * 		2. 数字不能开头
		 * 		3. 严格区分大小写	abc与ABC
		 * 		4. 禁止使用汉字和空格以及关键字
		 * 
		 * 	起名规范 : 
		 * 		1. 见名知意			Car   Cat  Dog   God
		 * 		2. 遵守驼峰命名法
		 * 			a. 类名/接口名每个单词首字母大写
		 * 				AaaBbbCcc
		 * 			b. 变量/函数第一个单词小写,从第二个单词开始大写
		 * 				aaaBbbCcc
		 * 
		 * 	编码格式 : 统一使用 : UTF-8
		 */
	}
}
