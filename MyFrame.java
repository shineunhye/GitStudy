package com.sist.ui;
import java.awt.*;

import com.sist.chick.ChickManager;
public class MyFrame extends Frame{
	public static final int FRAME_WIDTH=500;
	public static final int FRAME_HEIGHT=400;
	
	//싱글턴 패턴으로 설계된 ChickManager 클래스로부터 객체를 생성
	private ChickManager mgr=ChickManager.getInstance();
	
	public MyFrame(){
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		if(mgr!=null){
			mgr.displayAllChicks(g);
		}
	}
	
	
}
