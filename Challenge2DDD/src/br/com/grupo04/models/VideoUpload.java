package br.com.grupo04.models;

import java.io.File;
import java.time.LocalDateTime;

public class VideoUpload {
	
	private String id;
	private String nome;
	private LocalDateTime data;
	private File upload;	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public VideoUpload() {}
	
	public VideoUpload(String id, String nome, LocalDateTime data, File upload) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.upload = upload;
	}
	
}
