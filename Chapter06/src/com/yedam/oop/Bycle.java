package com.yedam.oop;

public class Bycle {
	//void안에 리턴문이 잇는것
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
		boolean isLeftGas() {
			if(gas == 0) {
				System.out.println("가스가 없습니다.");
				return false;
			}
			System.out.println("gas가 있습니다.");
			return true;
		}
		
		
		void run() {
			while(true) {
				if(gas>0) {
					System.out.println("과속합니다.(gas잔량 : "+gas +")");
					gas --;
				}else if(gas<0){System.out.println("폭파합니다.(gas잔량 : "+gas +")");
				}else{
					System.out.println("멈춥니다.(gas잔량 : "+gas +")");
					return;
				}
			}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
