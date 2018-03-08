package top.catarina.base.utils;

/**
 * @author Civin
 * @create 2018-02-20 16:19
 */


import top.catarina.base.lang.TypeFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件类型判断类
 */
public class FileTypeUtils {

	/**
	 * 将文件头转换成16进制字符串
	 *
	 * @param b 原生byte
	 * @return 16进制字符串
	 */
	private static String bytesToHexString(byte[] b) {

		StringBuilder stringBuilder = new StringBuilder();
		if (b == null || b.length <= 0) {
			return null;
		}
		for (int i = 0; i < b.length; i++) {
			int v = b[i] & 0xFF;
			String str = Integer.toHexString(v);
			if (str.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(str);
		}
		return stringBuilder.toString();
	}

	/**
	 * 得到文件头
	 *
	 * @return 文件头
	 * @throws IOException
	 */
	private static String getFileContent(InputStream inputStream) throws IOException {

		byte[] b = new byte[28];
		inputStream.read(b, 0, 28);
		return bytesToHexString(b);
	}

	/**
	 * 判断文件类型
	 *
	 * @return 文件类型
	 */
	public static String getType(InputStream inputStream) throws IOException {

		String fileHead = getFileContent(inputStream);
		if (fileHead == null || fileHead.length() == 0) {
			return null;
		}

		fileHead = fileHead.toUpperCase();

		TypeFile[] fileTypes = TypeFile.values();
		for (TypeFile type : fileTypes) {
			if (fileHead.startsWith(type.getValue())) {
				return type.toString().toLowerCase();
			}
		}
		return null;
	}

	public static String getType(String filePath) throws IOException {
		return getType(new FileInputStream(filePath));
	}
}
