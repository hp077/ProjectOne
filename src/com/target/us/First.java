package com.target.us;

public class First {

public First() {
}
 
public static void main(String[] args) {
	One obj = new One();
	obj.setName("Harish");
	obj.setRollrNum(1234);
	System.out.println(obj.getName());
	System.out.println(obj.getRollrNum());
}

}