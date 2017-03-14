package com.nekoxy.test.rd;

public class Random {
	int random;
	int yun;
	int chufa=0;
	public void duang(){
		for(int i=0;i<100;i++){
			random=(int)(Math.random()*100);
			if(random<10){
				for(int j=0;j<5;j++){
					yun=(int)(Math.random()*100);
					if(yun<20){
						chufa++;
					}
				}
			}
		}
		System.out.println("触发次数为"+chufa);
	}

}
