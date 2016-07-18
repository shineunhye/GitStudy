package com.sist.chick;
/*
 * Singleton Pattern
 * 	-하나의 클래스에서 오직 하나의 객체만 생성하도록 하는 기법.
 * 	-클래스 외부의 누구도 객체를 생성하지 못하게 하는 기법.
 * 	-DB 연결, 네트웍 연결 등의 공유 자원에 접근할 때 사용하면 효율적임.
 * 		-정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 * 		-인스턴스를 만드는 메서드에 동기화하는 방법.
 * 	-오직 단일 자원(resource)만 가지고 있고, 단일 자원의 속성에 접근하는 것을 공유할 필요가 있을때 유용함.
 */
import java.awt.*;
public class ChickManager {
	//1)생성자를 private으로 생성=>다른 클래스에서 인스턴스 생성을 제한.
	private ChickManager(){
		makeChicks();
	}
	
	//2)해당 클래스를 private static 전역변수로 선언, 인스턴스 생성해서 할당.
	private static ChickManager instance ;
	
	//3)public static method를 통해서 전역변수를 return
	public static ChickManager getInstance(){
		if(instance==null){
			instance=new ChickManager();
			System.out.println("새로 생성");
		}
		else{
			System.out.println("이미 생성");
		}
		return instance; //무조건 객체를 한번만 생성할 수 있도록 
	}
	
	//GeneralChick 객체4개, RedChick 객체 2개를
	//각각 저장할 수 잇도록 배열 정의.
	private GeneralChick[] marr=new GeneralChick[4];
	private RedChick[] rarr=new RedChick[2];
	
	//Chick 객체를 생성하는 기능 제공 
	//원하는 시점 호출.
	private void makeChicks(){
		if(marr!=null){
			for(int i=0; i<marr.length; i++){
				marr[i]=new GeneralChick();
			}
		}
		
		if(rarr!=null){
			for(int i=0; i<rarr.length; i++){
				rarr[i]=new RedChick();
			}
		}
	}
	
	//모든 병아리 객체 정보를 출력하는 메서드
	public void displayAllChicks(Graphics g){
		if(marr!=null){
			for(int i=0; i<marr.length; i++){
				if(marr[i]!=null)
					marr[i].display(g);
			}
		}
		
		if(rarr!=null){
			for(int i=0; i<rarr.length; i++){
				if(rarr[i]!=null)
					rarr[i].display(g);
			}
		}
	}
	
	//나중에 구현한다.
	public void ppick(Graphics g){;}
	public void walk(Graphics g){;}
	
}







