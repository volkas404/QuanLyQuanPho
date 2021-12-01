package Pholon;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
import Pholon.*;

class Work {

	public static void main(String[] args) throws Exception {
		Menu Mn = new Menu();
		Menu HD = new HoaDon(Mn);
		int q = 0;
		Scanner Sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Lam viec    2.Xuat hoa don trong ngay");
			q = Sc.nextInt();
			// q = 1 thực hiện đặt bàn, thanh toán và xuất hóa đơn của bàn đó
			if (q == 1) {
				HD.hoadon();
			// q = 2 xuất tất cả hóa đơn đã thanh toán từ file txt
			} else if (q == 2) {
				File file = new File(".\\listbill.txt");
				Scanner sc = new Scanner(file);
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}

		}

	}
}


