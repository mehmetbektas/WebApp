package com;

public class ServiceFacade {
	KisiDAO kisiDAO;
	
	private static ServiceFacade instance = new ServiceFacade();
	
	public static ServiceFacade instance(){
		/*
		if (instance == null) {
			instance = new ServiceFacade();
		}*/
		return instance;
	}
	
	public void start(){
		kisiDAO = new KisiDAO();
	}
	
	public void kayitEkle(Kisi kisi){
		kisiDAO.kayitEkle(kisi);
	}
	
}
