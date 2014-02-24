package com.ews.enterprise.integration;

public class FileProcessingContext {
	private String fileName;
	private String externalFileID;

	public final String getFileName() {
		return fileName;
	}

	public final void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	public final String getExternalFileID() {
		return externalFileID;
	}

	public final void setExternalFileID(final String externalFileID) {
		this.externalFileID = externalFileID;
	}
}
