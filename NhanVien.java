package Pholon;

import java.util.Random;
import java.util.Scanner;

public class NhanVien {
	private int MaNV;

	public NhanVien() {
		MaNV = 0;
	}

	// gọi 1 nhân viên ngẫu nhiên để đặt bàn hoặc tính tiền
	public void NhanVien() {
		Random rd = new Random();
		MaNV = rd.nextInt(100);
	}
}


