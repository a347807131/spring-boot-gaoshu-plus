/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package top.catarina.base.upload.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.catarina.base.context.AppContext;
import top.catarina.base.utils.FileNameUtils;
import top.catarina.base.utils.FileTypeUtils;
import top.catarina.base.utils.ImageUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author langhsu
 */
@Service
@Slf4j
public class FileRepoImpl extends AbstractFileRepo {

	@Autowired
	private AppContext context;

	@Override
	public String temp(InputStream in) throws IOException {
		String name = FileNameUtils.genPathAndFileName(FileTypeUtils.getType(in));
		String path = context.getTempDir() + name;
		File temp = new File(context.getRoot() + path);
		checkDirAndCreate(temp);
		FileUtils.copyInputStreamToFile(in, temp);
		return name;
	}

	@Override
	public String temp(MultipartFile file) throws IOException {
		validateFile(file);
		return temp(file.getInputStream());
	}

	@Override
	public String tempScale(MultipartFile file, int maxWidth) throws Exception {
		validateFile(file);

		String pathAndFilename = temp(file);
		String root = context.getRoot();
		String tempDir=root+context.getTempDir();
		//目标文件
		String source = tempDir + pathAndFilename;
		pathAndFilename=FileNameUtils.genPathAndFileName("jpg");
		String dest=tempDir+pathAndFilename;
		// 根据临时文件生成略缩图
		ImageUtils.resize(source, dest, maxWidth);
		return pathAndFilename;
	}

	@Override
	public String store(MultipartFile file) throws IOException {
		validateFile(file);
		String path = FileNameUtils.genPathAndFileName(getExt(file.getOriginalFilename()));
		File temp = new File(context.getRoot() + context.getOrigDir() + path);
		checkDirAndCreate(temp);
		file.transferTo(temp);
		return path;
	}

	@Override
	public String store(File file) throws IOException {
		String root = context.getRoot();
		String origDir = context.getOrigDir();
		String path = FileNameUtils.genPathAndFileName(getExt(file.getName()));
		File dest = new File(root + origDir + path);
		checkDirAndCreate(dest);
		FileUtils.copyFile(file, dest);
		return path;
	}

	@Override
	public String storeScale(MultipartFile file, int maxWidth) throws Exception {
		validateFile(file);
		String root = context.getRoot();
		String path = FileNameUtils.genPathAndFileName(getExt(file.getOriginalFilename()));
		File temp = new File(root + context.getTempDir() + path);
		checkDirAndCreate(temp);
		file.transferTo(temp);
		// 根据临时文件生成略缩图
		String dest = root +context.getThumbsDir()+ path;
		ImageUtils.resize(temp.getAbsolutePath(), dest, maxWidth);

		return path;
	}

	@Override
	public String storeScale(File file, int maxWidth) throws Exception {
		String pathAndFileName = FileNameUtils.genPathAndFileName(getExt(file.getName()));
		String dest =context.getRoot()+context.getOrigDir()+pathAndFileName;

		ImageUtils.resize(file.getAbsolutePath(), dest, maxWidth);
		return pathAndFileName;
	}

	@Override
	public String storeScale(File file, int width, int height) throws Exception {
		validateFile(file);
		String pathAndFileName = FileNameUtils.genPathAndFileName(getExt(file.getName()));
		String dest =context.getRoot()+context.getOrigDir()+pathAndFileName;
		ImageUtils.resize(file.getAbsolutePath(), dest, width,height);
		return pathAndFileName;
	}

	@Override
	public int[] imageSize(String storePath) {
		String root = context.getRoot();

		File dest = new File(root + storePath);
		int[] ret = new int[2];

		try {
			// 读入文件
			BufferedImage src = ImageIO.read(dest);
			int w = src.getWidth();
			int h = src.getHeight();

			ret = new int[]{w, h};

		} catch (IOException e) {
			e.printStackTrace();
		}

		return ret;
	}

	@Override
	public void deleteFile(String storePath) {
		String root = context.getRoot();

		File file = new File(root + storePath);

		// 文件存在, 且不是目录
		if (file.exists() && !file.isDirectory()) {
			file.delete();
			log.info("fileRepo delete " + storePath);
		}
	}

	@Override
	public String getKey() {
		return "absolute";
	}
}
