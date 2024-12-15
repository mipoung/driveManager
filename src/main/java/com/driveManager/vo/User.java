package com.driveManager.vo;

public class User {
    // 필수 정보
    private Integer userNo;        // 사용자 No
    private String userName;	  // 사용자ID
    private String password;      // 비밀번호
    private String name;          // 사용자 이름
    private String email;         // 이메일
    private String phone;         // 전화번호
    private String address;       // 주소
    private String role;          // 사용자 역할 (예: USER, ADMIN)
    
    // 선택적인 정보
    private String birthDate;     // 생년월일
    private String gender;        // 성별
    private String profileImage;  // 프로필 이미지 경로
    private String registrationDate; // 가입일
    private String lastLoginDate;   // 마지막 로그인 일자
    private boolean isEnabled;     // 계정 활성화 여부
    private String snsId;         // SNS 아이디 (SNS 로그인 연동 시)

    public User() {}
    
    public Integer getUserNo() {
        return userNo;
    }
    

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    

    public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getSnsId() {
        return snsId;
    }

    public void setSnsId(String snsId) {
        this.snsId = snsId;
    }
}

