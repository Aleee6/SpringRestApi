package com.alexbarna.rest.repository.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private Long id;
    private Boolean active;
    private String address;
    private String created;
    @Column(name = "created_at")
    private String createdAt;
    private String deleted;
    @Column(name = "deleted_at")
    private String deletedAt;
    @Column(name = "deleted_flag")
    private String deletedFlag;
    private String email;
    @Column(name = "email_token")
    private String emailToken;
    @Column(name = "last_login")
    private String lastLogin;
    private String name;
    @Column(name = "next_login_change_pwd")
    private String nextLoginChangePwd;
    private String password;
    @Column(name = "password_expired")
    private String passwordExpired;
    private String phone;
    @Column(name = "settlement_id")
    private String settlementId;
    @Column(name = "temp_password")
    private String tempPassword;
    @Column(name = "temp_password_expired")
    private String tempPasswordExpired;
    private String updated;
    @Column(name = "updated_at")
    private String updatedAt;
    @Column(name = "user_type")
    private String userType;
    private String username;
    @Column(name = "settlements_by_settlement_id")
    private String settlementsBySettlementId;
    @Column(name = "user_by_created_id")
    private String userByCreatedId;
    @Column(name = "user_by_deleted_id")
    private String userByDeletedId;
    @Column(name = "user_by_updated_id")
    private String userByUpdatedId;

    public UserEntity() {
    }

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
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

    public String getNextLoginChangePwd() {
        return nextLoginChangePwd;
    }

    public void setNextLoginChangePwd(String nextLoginChangePwd) {
        this.nextLoginChangePwd = nextLoginChangePwd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(String passwordExpired) {
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

    public String getTempPasswordExpired() {
        return tempPasswordExpired;
    }

    public void setTempPasswordExpired(String tempPasswordExpired) {
        this.tempPasswordExpired = tempPasswordExpired;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
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

    public String getUserByCreatedId() {
        return userByCreatedId;
    }

    public void setUserByCreatedId(String userByCreatedId) {
        this.userByCreatedId = userByCreatedId;
    }

    public String getUserByDeletedId() {
        return userByDeletedId;
    }

    public void setUserByDeletedId(String userByDeletedId) {
        this.userByDeletedId = userByDeletedId;
    }

    public String getUserByUpdatedId() {
        return userByUpdatedId;
    }

    public void setUserByUpdatedId(String userByUpdatedId) {
        this.userByUpdatedId = userByUpdatedId;
    }
}
