package Pholon;

import java.util.Scanner;
import Pholon.*;

public class CodeTable {
	static int MaBan;
	static int Id;
	String[] SLBanLon = new String[20];
	String[] SLBanNho = new String[30];

	// tạo bàn đang có khách
	public void CreateTable() {
		if (MaBan == 1) {
			SLBanNho[Id] = "a";
		}
		if (MaBan == 2) {
			SLBanLon[Id] = "a";
		}
	}

	// nhập loại bàn và mã bàn
	public void CodeTable() {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Co 2 loai ban :\n1. Ban mot người         2. Ban nhieu nguoi\n");
		System.out.println("Chon loai ban :");
		MaBan = Sc.nextInt();
		if (MaBan == 1) {
			boolean co = false;
			do {
				System.out.println("Ma ban cua khach la ( 0 - 29 ) : ");
				Id = Sc.nextInt();
				if (SLBanNho[Id] == "a") {
					co = true;
					System.out.println("Ban dang co khach !\nXin vui long chon ban khac !\n");
				} else
					co = false;
			} while (co);
		} else if (MaBan == 2) {
			boolean flag = false;
			do {
				System.out.println("Ma ban cua khach la ( 0 - 19 ) : ");
				Id = Sc.nextInt();
				if (SLBanLon[Id] == "a") {
					flag = true;
					System.out.println("Ban dang co khach !\nXin vui long chon ban khac !\n");
				} else
					flag = false;
			} while (flag);
		}
	}
}
