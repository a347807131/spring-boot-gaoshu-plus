package top.catarina.base.utils;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

public class FileNameUtils {
	private static String YYYYMM = "/yyyy/MMdd/";
	private static String DDHHMMSS = "ddHHmmss";
	private static String YYYYMMDDHHMMSS = "/yyyy/MMdd/ddHHmmss";
	public static final char[] N36_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	public static String genPathName() {
		return DateFormatUtils.format(new Date(), YYYYMM);
	}

	public static String genFileName() {
		return DateFormatUtils.format(new Date(), DDHHMMSS) + RandomStringUtils.random(4, N36_CHARS);
	}

	public static String genFileName(String ext) {
		return genFileName() + "." + ext;
	}

	/**
	 * 根据文件类型生成
	 * @param ext 猴嘴
	 */
	public static String genPathAndFileName(String ext) {
		return DateFormatUtils.format(new Date(), YYYYMMDDHHMMSS) + RandomStringUtils.random(4, N36_CHARS) + "." + ext;
	}
}

