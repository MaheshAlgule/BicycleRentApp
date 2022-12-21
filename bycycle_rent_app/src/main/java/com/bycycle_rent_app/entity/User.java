package com.bycycle_rent_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@TableGenerator(name = "userIdGen", table = "userid_gen", pkColumnName = "pk_col", allocationSize = 1, valueColumnName = "pk_val_col", pkColumnValue = "userId", initialValue = 10)
	@GeneratedValue(generator = "userIdGen", strategy = GenerationType.TABLE)
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNo;

}
