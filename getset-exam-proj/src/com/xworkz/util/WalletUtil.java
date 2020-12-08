package com.xworkz.util;

import com.xworkz.root.Wallet;

public class WalletUtil {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Wallet wal = new Wallet();
		wal.setName("2 fold");
		wal.setCost(899);
		wal.setBrand("Baggit");
		System.out.println(wal.getName()+ " " + wal.getBrand()+ " "+ wal.getCost()+" ");

	}

}
