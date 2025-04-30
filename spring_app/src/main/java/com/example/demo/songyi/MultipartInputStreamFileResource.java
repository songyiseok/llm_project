package com.example.demo.songyi;

import java.io.InputStream;

import org.springframework.core.io.InputStreamResource;

public class MultipartInputStreamFileResource extends InputStreamResource{
	 private final String filename; 
	    public MultipartInputStreamFileResource(InputStream inputStream, String filename) {
	        super(inputStream);
	        this.filename = filename;
	    }

	    @Override
	    public String getFilename() {
	        return this.filename;
	    }

	    @Override
	    public long contentLength() {
	        return -1; // 알 수 없을 경우 -1
	    }
}