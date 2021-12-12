package org.kostagram.model;

import java.io.Serializable;

public class MemberVO implements Serializable{
    private static final long serialVersionUID = 894080600901728582L;
    private String memberId;
    private String password;
    private String email;
    private String name;
    private String profileImg;
    private String profileImgPath;
    private String introduce;
    private String registerDate;
    public MemberVO() {
        super();
    }
    
    public MemberVO(String memberId) {
		super();
		this.memberId = memberId;
	}

	public MemberVO(String memberId, String password, String email, String name, String registerDate) {
        super();
        this.memberId = memberId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.registerDate = registerDate;
    }

    public MemberVO(String memberId, String password, String email, String name, String profileImg, String profileImgPath, String introduce,
            String registerDate) {
        super();
        this.memberId = memberId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.profileImg = profileImg;
        this.profileImgPath = profileImgPath;
        this.introduce = introduce;
        this.registerDate = registerDate;
    }
    
    public MemberVO(String memberId, String password, String name) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.name = name;
	}

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getProfileImgPath() {
        return profileImgPath;
    }

    public void setProfileImgPath(String profileImgPath) {
        this.profileImgPath = profileImgPath;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "MemberVO [memberId=" + memberId + ", password=" + password + ", email=" + email + ", name=" + name
                + ", profileImg=" + profileImg + ", profileImgPath=" + profileImgPath + ", introduce=" + introduce
                + ", registerDate=" + registerDate + "]";
    }
	public MemberVO(String memberId,String password) {
		super();
		this.password = password;
		this.memberId = memberId;
	}
}
