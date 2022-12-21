package com.bycycle_rent_app.utility;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ErrorInfo {

	private String message;
	private Integer errorcode;
	private LocalDateTime timestamp;
}
