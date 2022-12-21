package com.bycycle_rent_app.dto;

import com.bycycle_rent_app.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class UserDTO {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNo;


	public static UserDTO UserToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail(user.getEmail());
		userDTO.setFirstName(user.getFirstName());
		userDTO.setLastName(user.getLastName());
		userDTO.setPhoneNo(user.getPhoneNo());
		userDTO.setUserId(user.getUserId());
		return userDTO;
	}

	public static User UserDTOToUser(UserDTO userDTO) {
		User user = new User();
		user.setEmail(userDTO.getEmail());
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setPhoneNo(userDTO.getPhoneNo());
		user.setUserId(userDTO.getUserId());
		return user;
	}
}
