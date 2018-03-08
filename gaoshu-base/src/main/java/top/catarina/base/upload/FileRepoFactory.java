package top.catarina.base.upload;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Civin
 * @create 2018-01-22 19:59
 */
@Service
public class FileRepoFactory {

	private Map<String, FileRepo> fileRepos = new HashMap<>();

	private String repo = "absolute";

	public void addRepo(String key, FileRepo value) {
		fileRepos.put(key, value);
	}

	public FileRepo select() {
		return fileRepos.get(repo);
	}

	public String getRepo() {
		return repo;
	}

	public void setRepo(String repo) {
		this.repo = repo;
	}

}
