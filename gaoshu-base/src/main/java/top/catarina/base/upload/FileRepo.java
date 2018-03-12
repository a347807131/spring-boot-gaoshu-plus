/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package top.catarina.base.upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author langhsu
 * @apiNote 方法统一返回的是filenameutils生成的3级目录文件名
 */
public interface FileRepo {

	String storeAndScale(File file) throws Exception;

	String storeAndScale(File file,int maxWidth) throws Exception;

	/**
	 * 保存临时图片
	 * - 临时图片不会生成复杂的多级目录
	 * @return 生成的三级目录文件名
	 */
	String temp(MultipartFile file) throws IOException;

	/**
	 * 将文件流临时保存
	 * @param in 输入流
	 * @return 生成的三级目录文件名
	 */
	String temp(InputStream in) throws Exception;

	/**
	 * 保存压缩后的临时图片
	 * @return 生成的三级目录文件名
	 */
	String tempScale(MultipartFile file, int maxWidth) throws Exception;


	/**
	 * 存储图片
	 * @throws IOException
	 */
	String store(MultipartFile file) throws IOException;
	
	/**
	 * 存储图片
	 * @throws IOException
	 */
	String store(File file) throws IOException;
	
	/**
	 * 存储压缩图片
	 */
	String storeScale(MultipartFile file, int maxWidth) throws Exception;
	
	/**
	 * 存储压缩图片
	 */
	String storeScale(File file, int maxWidth) throws Exception;

	/**
	 * 存储压缩图片
	 */
	String storeScale(File file, int width, int height) throws Exception;
	
	/**
	 * 获取图片大小
	 *
	 * @param storePath 绝对文件路径
	 * @return 长度为2的int型数组 w宽 h高
	 */
	int[] imageSize(String storePath);

	/**
	 * 存储路径
	 */
	void deleteFile(String storePath);
}
