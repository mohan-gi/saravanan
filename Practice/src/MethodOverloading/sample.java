package MethodOverloading;

import String.string;

public final class sample {
	
	public final static String a="mohan";
	public final static void employeeInfo() {
System.out.println("Emp Information");
	}
	public static void employeeInfo(int empId) {
System.out.println("Employee is is"+ empId);
	}
	public static void employeeInfo(int age,String name) {
System.out.println("Employee name is "+a +"Employee age"+age);
	}
	public static void main(String[] args) {
		//sample abc = new sample();
		employeeInfo();
		employeeInfo(794355);
		employeeInfo(20, "raj");
	}

}
