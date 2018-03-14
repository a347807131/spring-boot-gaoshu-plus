package top.catarina.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.catarina.base.utils.FileNameUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author Civin
 * @create 2018-02-15 10:58
 */
@Api("素材下载控制器")
@Controller
public class DownloadController extends BaseController {

	/**
	 * 素材文件下载接口
	 */
	@ApiOperation(value = "素材获取接口",notes = "前端直接根据attach信息中url获取素材")
	@GetMapping(value = {"/store/orig/{year}/{monthDay}/{name}","/store/thumbs/{year}/{monthDay}/{name}"})
	public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
		String uriPath = request.getRequestURI();
		return handle(appContext.getRoot()+uriPath);
	}

	/**
	 * 通过uri与相关目录获取文件的二进制码
	 * @param path 路径
	 * @return 二进制码
	 */
	private ResponseEntity<byte[]> handle(String path) throws IOException {
		String ext = path.split("[.]")[1];

		byte[] bytes = FileUtils.readFileToByteArray(new File(path));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", FileNameUtils.genFileName(ext));
		return new ResponseEntity<>(bytes,
				headers, HttpStatus.CREATED);
	}
}
