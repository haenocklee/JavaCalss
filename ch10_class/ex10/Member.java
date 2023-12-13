package ch10_class.ex10;

import java.util.Scanner;

public class Member {
    /**
     * 회원 정보 클래스
     * 회원 정보
     *    - 이메일(memberEmail)
     *    - 비밀번호(memberPassword)
     *    - 이름(memberName)
     *    - 전화번호(memberMobile)
     *  getter/setter
     *  생성자 2가지
     *  로그인 처리 메서드
     *    name: memberLogin
     *    parameter: memberEmail, memberPassword
     *    return type: boolean
     *    실행내용: 이메일, 비밀번호가 일치하면 true,
     *              일치하지 않으면 false 리턴
     */

//    회원 정보 클래스
//     * 회원 정보
//     *    - 이메일(memberEmail)
//     *    - 비밀번호(memberPassword)
//     *    - 이름(memberName)
//     *    - 전화번호(memberMobile)
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

//    getter/setter


    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }
//    *  생성자 2가지
    //기본생성자
    public Member(){}
    //모든 필드를 매개변수로 하는 생성자
    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

//    로그인 처리 메서드
//     *    name: memberLogin
//     *    parameter: memberEmail, memberPassword
//     *    return type: boolean
//     *    실행내용: 이메일, 비밀번호가 일치하면 true,
//            *              일치하지 않으면 false 리턴
    public boolean memberLogin(String memberEmail,String memberPassword){
        //.equals()를 ==로쓰는실수를 했습니다. ... 조심합시다.
        if( getMemberEmail().equals(memberEmail) && getMemberPassword().equals(memberPassword)){
            return true;
        }else{
            return false;
        }
    }
}
