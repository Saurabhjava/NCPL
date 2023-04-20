package com;

public interface Soundable {
	int num=10;
	public abstract void play();
	void pause();
	void stop();
}
interface Recordable {
	void startRecording();
}
class Mobile implements Soundable , Recordable{

	@Override
	public void play() {
		System.out.println("Play Music With Mobile");		
	}

	@Override
	public void pause() {
		System.out.println("Pause Music With Mobile");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop Music With Mobile");		
	}

	@Override
	public void startRecording() {
		// TODO Auto-generated method stub
		
	}
	
}
class MusicSystem implements Soundable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}