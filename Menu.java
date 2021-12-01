package Pholon;

import java.util.Scanner;
import Pholon.*;

public class Menu {
	private int MaMon;
	private int MaThit;
	private int MaTo;
	String[][] ToPho = new String[100][5]; // mảng 2 chiều chứa các tô phở đã gọi
	static int x, y;
	static int dem, demmon;
	static int money;
	static int tongtien, tongtien1;
	String[] Order = new String[6];
	String[][] Mongoithem = new String[1000][2]; // mảng 2 chiều chứa các món gọi thêm và số lượng mỗi món
	String[] To = new String[3]; // mảng 1 chiều chứa tên các loại tô

	public Menu() {
		x = 0;
		y = 0;
		dem = 0;
		demmon = 0;
		money = 0;
		tongtien = 0;
		tongtien1 = 0;
	}

	public void HoaDon() {
	}

	public void hoadon() {
	}

	// nhập các món ăn chính
	public void MonChinh() {
		int to1 = 0, to2 = 0, to3 = 0;
		int q = 1;
		String[] Thit = new String[5];
		Thit[0] = "Tai";
		Thit[1] = "Nam";
		Thit[2] = "Gau";
		Thit[3] = "Gan";
		Thit[4] = "Bo vien";
		To[0] = "To nho";
		To[1] = "To lon";
		To[2] = "To dac biet";
		Scanner Sc = new Scanner(System.in);
		while (q == 1) {
			System.out.println(
					"Co 3 loai to : \n001. To nho - 002. To lon - 003. To dac biet \nCo 5 loai thit : \n0.Tai - 1.Nam - 2.Gau - 3.Gan - 4.Bo vien");
			System.out.println("Nhap ma to :");
			MaTo = Sc.nextInt();
			if (MaTo == 001) {
				int a, b;
				System.out.println("Nhap 2 ma thit : ");
				a = Sc.nextInt();
				b = Sc.nextInt();
				ToPho[x][0] = To[0];
				ToPho[x][1] = Thit[a];
				ToPho[x][2] = Thit[b];
				x++;
				to1++;
				dem++;
			} else if (MaTo == 002) {
				int a, b, c;
				System.out.println("Nhap 3 ma thit : ");
				a = Sc.nextInt();
				b = Sc.nextInt();
				c = Sc.nextInt();
				ToPho[x][0] = To[1];
				ToPho[x][1] = Thit[a];
				ToPho[x][2] = Thit[b];
				ToPho[x][3] = Thit[c];
				x++;
				to2++;
				dem++;
			} else if (MaTo == 003) {
				int a, b, c, d;
				System.out.println("Nhap 4 ma thit : ");
				a = Sc.nextInt();
				b = Sc.nextInt();
				c = Sc.nextInt();
				d = Sc.nextInt();
				ToPho[x][0] = To[2];
				ToPho[x][1] = Thit[a];
				ToPho[x][2] = Thit[b];
				ToPho[x][3] = Thit[c];
				ToPho[x][4] = Thit[d];
				x++;
				to3++;
				dem++;
			} else
				System.out.println("Ma to khong hop le ! Nhap lai !");
			System.out.println("\n");
			System.out.println("Tiep tuc goi them khong ? \n1.Goi them          2.Khong goi");
			q = Sc.nextInt();
		}
	}

	// nhập các món gọi thêm
	public void MonGoiThem() {
		int p = 0, quest = 0;
		Order[0] = "Quay";
		Order[1] = "Hot ga";
		Order[2] = "Banh pho them";
		Order[3] = "Tiet";
		Order[4] = "Tiet hot ga";
		Order[5] = "Thit them";
		Scanner Sc = new Scanner(System.in);
		System.out.println("Goi mon an them khong ? \n1.Goi          2.Khong goi");
		quest = Sc.nextInt();
		while (quest == 1) {
			int quay = 0, hotga = 0, tiet = 0, tiethotga = 0, banhpho = 0, thitthem = 0;
			System.out.println(
					"Cac mon an them co the goi :\n 0.Quay - 1.Hot ga  - 2.Banh pho them - 3.Tiet - 4.Tiet hot ga  - 5.Thit them");
			System.out.println("Nhap ma mon goi them :");
			MaMon = Sc.nextInt();
			if (MaMon == 0) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[0];
				Mongoithem[y][1] = p + "";
				quay++;
				demmon++;
				y++;
			} else if (MaMon == 1) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[1];
				Mongoithem[y][1] = p + "";
				hotga++;
				demmon++;
				y++;
			} else if (MaMon == 2) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[2];
				Mongoithem[y][1] = p + "";
				tiet++;
				demmon++;
				y++;
			} else if (MaMon == 3) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[3];
				Mongoithem[y][1] = p + "";
				tiethotga++;
				demmon++;
				y++;
			} else if (MaMon == 4) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[4];
				Mongoithem[y][1] = p + "";
				banhpho++;
				demmon++;
				y++;
			} else if (MaMon == 5) {
				System.out.println("Nhap so luong :");
				p = Sc.nextInt();
				Mongoithem[y][0] = Order[5];
				Mongoithem[y][1] = p + "";
				thitthem++;
				demmon++;
				y++;
			} else
				System.out.println("Ma mon goi them khong hop le ! Nhap lai !");
			System.out.println("\n");
			System.out.println("Tiep tuc goi mon an them khong ? \n 1.Goi them            2.Khong goi\r\n");
			quest = Sc.nextInt();
		}
	}

	// tính tổng tiền của món chính và món gọi thêm
	public void TinhTien() {
		System.out.println("\n");
		System.out.println("Cac mon da goi :\n");
		for (int i = 0; i <= dem; i++) {
			if (ToPho[i][0] == To[0]) {
				money += 45000;
				System.out.println("" + ToPho[i][0] + " ( " + ToPho[i][1] + "  " + ToPho[i][2] + " ) : " + money);
				tongtien += money;
				money = 0;
			}
			if (ToPho[i][0] == To[1]) {
				money += 60000;
				System.out.println("" + ToPho[i][0] + " ( " + ToPho[i][1] + "  " + ToPho[i][2] + "  " + ToPho[i][3]
						+ " ) : " + money);
				tongtien += money;
				money = 0;
			}
			if (ToPho[i][0] == To[2]) {
				money += 75000;
				System.out.println("" + ToPho[i][0] + " ( " + ToPho[i][1] + "  " + ToPho[i][2] + "  " + ToPho[i][3]
						+ "  " + ToPho[i][4] + " ) : " + money);
				tongtien += money;
				money = 0;
			}
		}
		System.out.println("Tong tien cua so to da goi : " + tongtien + "\n");
		for (int j = 0; j <= demmon; j++) {
			if (Mongoithem[j][0] == Order[0]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 5000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
			if (Mongoithem[j][0] == Order[1]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 5000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
			if (Mongoithem[j][0] == Order[2]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 10000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
			if (Mongoithem[j][0] == Order[3]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 10000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
			if (Mongoithem[j][0] == Order[4]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 15000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
			if (Mongoithem[j][0] == Order[5]) {
				int k = Integer.parseInt(Mongoithem[j][1]);
				money += 25000 * k;
				System.out.println("" + Mongoithem[j][0] + " : " + money);
				tongtien1 += money;
				money = 0;
			}
		}
		System.out.println("Tong tien cac mon an them da goi : " + tongtien1 + "\n");

	}

}