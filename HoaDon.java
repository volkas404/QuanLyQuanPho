package Pholon;

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.*;
import java.io.*;

public class HoaDon extends Menu {

	private int MSHD;
	Menu Mn = new Menu();
	CodeTable CT = new CodeTable();
	NhanVien NV = new NhanVien();
	Random rd = new Random();
	Date date = java.util.Calendar.getInstance().getTime();
	BufferedWriter fw = null;
	FileWriter bw = null;

	public HoaDon(Menu Mn) {
		super();
		this.Mn = Mn;
	}

	@Override
	public void MonChinh() {
		super.MonChinh();
	}

	@Override
	public void MonGoiThem() {
		super.MonGoiThem();
	}

	@Override
	public void TinhTien() {
		super.TinhTien();
	}

	// Gọi món, xuất hóa đơn và thanh toán
	public void hoadon() {
		int MaSNVG;
		int MaSNVT;
		MSHD = rd.nextInt(100000);
		CT.CreateTable();
		int kiemtra;
		Scanner Sc = new Scanner(System.in);
		while (true) {
			for (int i = 0; i < Mn.ToPho.length; i++)
				Arrays.fill(Mn.ToPho[i], "");
			for (int i = 0; i < Mn.Mongoithem.length; i++)
				Arrays.fill(Mn.Mongoithem[i], "");
			System.out.println("Chon cong viec : \n1. Dat ban          2. Thong ke tinh trang ban");
			kiemtra = Sc.nextInt();
			// kiemtra = 1 đặt bàn
			if (kiemtra == 1) {
				CT.CodeTable();
				CT.CreateTable();
				Mn.MonChinh();
				Mn.MonGoiThem();
				Mn.TinhTien();
				System.out.println("\n-------- Hoa don -------- \n");
				System.out.println("  Ma so hoa don : " + MSHD);
				System.out.println("  Thoi gian : " + date);
				if (CT.MaBan == 1) {
					System.out.println("  Ma ban : " + CT.Id + " (Ban mot nguoi)");
				}
				if (CT.MaBan == 2) {
					System.out.println("  Ma ban : " + CT.Id + " (Ban nhieu nguoi)");
				}
				for (int i = 0; i < Mn.dem; i++) {
					System.out.println("  " + Mn.ToPho[i][0] + " ( " + Mn.ToPho[i][1] + "  " + Mn.ToPho[i][2] + "  "
							+ Mn.ToPho[i][3] + "  " + Mn.ToPho[i][4] + " ) ");
					if (Mn.ToPho[i][0] == "To nho") {
						System.out.println("\n  Gia : 45.000 dong / to ");
					}

					if (Mn.ToPho[i][0] == "To lon") {
						System.out.println("\n  Gia : 60.000 dong / to ");
					}
					if (Mn.ToPho[i][0] == "To dac biet") {
						System.out.println("\n  Gia : 75.000 dong / to ");
					}
					System.out.println("\n");
				}
				for (int i = 0; i < Mn.demmon; i++) {
					System.out.println("  " + Mn.Mongoithem[i][0] + " : " + Mn.Mongoithem[i][1]);
					if (Mn.Mongoithem[i][0] == Mn.Order[0]) {
						System.out.println("  Gia : 5.000 dong / phan ");
					}
					if (Mn.Mongoithem[i][0] == Mn.Order[1]) {
						System.out.println("  Gia : 5.000 dong / phan ");
					}
					if (Mn.Mongoithem[i][0] == Mn.Order[2]) {
						System.out.println("  Gia : 10.000 dong / phan ");
					}
					if (Mn.Mongoithem[i][0] == Mn.Order[3]) {
						System.out.println("  Gia : 10.000 dong / phan ");
					}
					if (Mn.Mongoithem[i][0] == Mn.Order[4]) {
						System.out.println("  Gia : 15.000 dong / phan ");
					}
					if (Mn.Mongoithem[i][0] == Mn.Order[5]) {
						System.out.println("  Gia : 25.000 dong / phan ");
					}
					System.out.println("\n");
				}
				MaSNVG = rd.nextInt(100);
				MaSNVT = rd.nextInt(100);
				System.out.println("-----------------------------------------");
				int tong = Mn.tongtien + Mn.tongtien1;
				System.out.println("Ma so nhan vien dat mon : " + MaSNVG);
				System.out.println("Ma so nhan vien tinh tien : " + MaSNVT);
				System.out.println("=========================================");
				System.out.println("Thanh tien : " + tong + "\n");
				// ghi hóa đơn lên file txt
				try {

					File file = new File(".\\listbill.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					bw = new FileWriter(file.getAbsoluteFile(), true);
					fw = new BufferedWriter(bw);
					fw.write("-------- Hoa don --------");
					fw.write("\r\n");
					fw.write("  Ma so hoa don : " + MSHD);
					fw.write("\r\n");
					fw.write("  Thoi gian : " + date);
					fw.write("\r\n");
					if (CT.MaBan == 1) {
						fw.write("  Ma ban : " + CT.Id + " (Ban mot nguoi)");
						fw.write("\r\n");
					}
					if (CT.MaBan == 2) {
						fw.write("  Ma ban : " + CT.Id + " (Ban nhieu nguoi)");
						fw.write("\r\n");
					}
					for (int i = 0; i < Mn.dem; i++) {
						fw.write("  " + Mn.ToPho[i][0] + " ( " + Mn.ToPho[i][1] + "  " + Mn.ToPho[i][2] + "  "
								+ Mn.ToPho[i][3] + "  " + Mn.ToPho[i][4] + " ) ");
						fw.write("\r\n");
					}
					for (int i = 0; i < Mn.demmon; i++) {
						fw.write("  " + Mn.Mongoithem[i][0] + " : " + Mn.Mongoithem[i][1]);
						fw.write("\r\n");
					}
					fw.write("-----------------------------------------\r\n");
					fw.write("Ma so nhan vien dat mon : " + MaSNVG + "\r\n");
					fw.write("Ma so nhan vien thanh toan : " + MaSNVT + "\r\n");
					fw.write("=========================================\r\n");
					fw.write("Thanh tien : " + tong + "\r\n");
					fw.write("\r\n");
					fw.write("\r\n");
					fw.write("\r\n");
					fw.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				Mn.dem = 0;
				Mn.demmon = 0;
				Mn.x = 0;
				Mn.y = 0;
				Mn.tongtien = 0;
				Mn.tongtien1 = 0;
				// kiemtra = 2 thống kê bàn trống và bàn đã có khách
			} else if (kiemtra == 2) {
				if (CT.MaBan == 1) {
					CT.CreateTable();
				}
				if (CT.MaBan == 2) {
					CT.CreateTable();
				}
				System.out.println("So ban nho dang trong : ");
				for (int i = 0; i < 30; i++) {
					if (CT.SLBanNho[i] == null)
						System.out.println("Ban so " + i);
				}
				System.out.println("\n");
				System.out.println("So ban nho dang co khach : \n");
				for (int i = 0; i < 30; i++) {
					if (CT.SLBanNho[i] == "a")
						System.out.println("Ban so " + i);
				}
				System.out.println("\n");
				System.out.println("So ban lon dang trong : ");
				for (int i = 0; i < 20; i++) {
					if (CT.SLBanLon[i] == null)
						System.out.println("Ban so " + i);
				}
				System.out.println("\n");
				System.out.println("So ban lon dang co khach : \n");
				for (int i = 0; i < 20; i++) {
					if (CT.SLBanLon[i] == "a")
						System.out.println("Ban so " + i);
				}
				System.out.println("\n");
			}
			break;
		}
	}

}
