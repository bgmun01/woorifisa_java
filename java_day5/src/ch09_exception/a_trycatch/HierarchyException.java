package ch09_exception.a_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HierarchyException {

	public static void main(String[] args) {
		String src = "./.project";

		try {
			FileInputStream input = new FileInputStream(src);
			int readData = -1;

			while ((readData = input.read()) != -1) {
				System.out.print((char) readData);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file 없음");
		} catch (IOException e) {
			System.out.println("io 실패");
		}

		System.out.println("파일 읽음 완료!");
	}
}
