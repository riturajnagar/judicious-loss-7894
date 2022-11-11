package com.masai.Exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetails {
	private LocalDateTime dateTime;
	private String message;
	private String details;

	public MyErrorDetails(LocalDateTime dateTime, String message, String details) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.details = details;
	}

}
