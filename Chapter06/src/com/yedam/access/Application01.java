package com.yedam.access;

public class Application01 {

	public static void main(String[] args) {
		Access ac =new Access();
		
		//default
		ac.basic="default";
		//public
		ac.free="public";
		//protected
		ac.parent="parent";
		//private
//		ac.privacy = "privacy"; private제한자는 해당하는 클래스에서만 사용가능
		ac.instead();
		ac.parent();
		ac.basic();
	}

}
