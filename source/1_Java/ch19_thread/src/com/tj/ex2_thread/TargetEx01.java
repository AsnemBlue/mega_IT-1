package com.tj.ex2_thread;
// "�ȳ��ϼ��� 10��"�ϴ� target����
public class TargetEx01 extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("�ȳ��ϼ���");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
	}
}