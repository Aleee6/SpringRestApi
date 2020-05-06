package com.alexbarna.rest.service.user;

import com.alexbarna.rest.service.role.RoleDto;

import java.util.Date;

public class UserDto {
    private Long id;
    private Boolean active;
    private String address;
    private String created;
    private Date createdAt;
    private String deleted;
    private Date deletedAt;
    private String deletedFlag;
    private String email;
    private String emailToken;
    private String lastLogin;
    private String name;
    private Boolean nextLoginChangePwd;
    private String password;
    private Boolean passwordExpired;
    private String phone;
    private String settlementId;
    private String tempPassword;
    private Boolean tempPasswordExpired;
    private String updated;
    private Date updatedAt;
    private String userType;
    private String username;
    private String settlementsBySettlementId;
    private Long userByCreatedId;
    private Long userByDeletedId;
    private Long userByUpdatedId;
    private RoleDto role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailToken() {
        return emailToken;
    }

    public void setEmailToken(String emailToken) {
        this.emailToken = emailToken;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNextLoginChangePwd() {
        return nextLoginChangePwd;
    }

    public void setNextLoginChangePwd(Boolean nextLoginChangePwd) {
        this.nextLoginChangePwd = nextLoginChangePwd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }

    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    public Boolean getTempPasswordExpired() {
        return tempPasswordExpired;
    }

    public void setTempPasswordExpired(Boolean tempPasswordExpired) {
        this.tempPasswordExpired = tempPasswordExpired;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSettlementsBySettlementId() {
        return settlementsBySettlementId;
    }

    public void setSettlementsBySettlementId(String settlementsBySettlementId) {
        this.settlementsBySettlementId = settlementsBySettlementId;
    }

    public Long getUserByCreatedId() {
        return userByCreatedId;
    }

    public void setUserByCreatedId(Long userByCreatedId) {
        this.userByCreatedId = userByCreatedId;
    }

    public Long getUserByDeletedId() {
        return userByDeletedId;
    }

    public void setUserByDeletedId(Long userByDeletedId) {
        this.userByDeletedId = userByDeletedId;
    }

    public Long getUserByUpdatedId() {
        return userByUpdatedId;
    }

    public void setUserByUpdatedId(Long userByUpdatedId) {
        this.userByUpdatedId = userByUpdatedId;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }
}
