
package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 *  Auto generated, do not modify this file.
 */
@SuppressWarnings("serial")
public class BaseUser<M extends BaseUser<M>> extends JbootModel<M> implements IBean {

	public static final String ACTION_ADD = "user:add";
	public static final String ACTION_DELETE = "user:delete";
	public static final String ACTION_UPDATE = "user:update";

	@Override
	protected String addAction() {
		return ACTION_ADD;
	}

	@Override
	protected String deleteAction() {
		return ACTION_DELETE;
	}

	@Override
	protected String updateAction() {
		return ACTION_UPDATE;
	}

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}

	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setRealname(java.lang.String realname) {
		set("realname", realname);
	}

	public java.lang.String getRealname() {
		return getStr("realname");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}

	public java.lang.String getSalt() {
		return getStr("salt");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setEmailStatus(java.lang.String emailStatus) {
		set("email_status", emailStatus);
	}

	public java.lang.String getEmailStatus() {
		return getStr("email_status");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setMobileStatus(java.lang.String mobileStatus) {
		set("mobile_status", mobileStatus);
	}

	public java.lang.String getMobileStatus() {
		return getStr("mobile_status");
	}

	public void setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
	}

	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setGender(java.lang.String gender) {
		set("gender", gender);
	}

	public java.lang.String getGender() {
		return getStr("gender");
	}

	public void setRole(java.lang.String role) {
		set("role", role);
	}

	public java.lang.String getRole() {
		return getStr("role");
	}

	public void setSignature(java.lang.String signature) {
		set("signature", signature);
	}

	public java.lang.String getSignature() {
		return getStr("signature");
	}

	public void setContentCount(java.lang.Long contentCount) {
		set("content_count", contentCount);
	}

	public java.lang.Long getContentCount() {
		return getLong("content_count");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}

	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

	public void setQq(java.lang.String qq) {
		set("qq", qq);
	}

	public java.lang.String getQq() {
		return getStr("qq");
	}

	public void setWechat(java.lang.String wechat) {
		set("wechat", wechat);
	}

	public java.lang.String getWechat() {
		return getStr("wechat");
	}

	public void setWeibo(java.lang.String weibo) {
		set("weibo", weibo);
	}

	public java.lang.String getWeibo() {
		return getStr("weibo");
	}

	public void setFacebook(java.lang.String facebook) {
		set("facebook", facebook);
	}

	public java.lang.String getFacebook() {
		return getStr("facebook");
	}

	public void setLinkedin(java.lang.String linkedin) {
		set("linkedin", linkedin);
	}

	public java.lang.String getLinkedin() {
		return getStr("linkedin");
	}

	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}

	public java.util.Date getBirthday() {
		return get("birthday");
	}

	public void setCompany(java.lang.String company) {
		set("company", company);
	}

	public java.lang.String getCompany() {
		return getStr("company");
	}

	public void setOccupation(java.lang.String occupation) {
		set("occupation", occupation);
	}

	public java.lang.String getOccupation() {
		return getStr("occupation");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setZipcode(java.lang.String zipcode) {
		set("zipcode", zipcode);
	}

	public java.lang.String getZipcode() {
		return getStr("zipcode");
	}

	public void setSite(java.lang.String site) {
		set("site", site);
	}

	public java.lang.String getSite() {
		return getStr("site");
	}

	public void setGraduateschool(java.lang.String graduateschool) {
		set("graduateschool", graduateschool);
	}

	public java.lang.String getGraduateschool() {
		return getStr("graduateschool");
	}

	public void setEducation(java.lang.String education) {
		set("education", education);
	}

	public java.lang.String getEducation() {
		return getStr("education");
	}

	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}

	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	public void setIdcardtype(java.lang.String idcardtype) {
		set("idcardtype", idcardtype);
	}

	public java.lang.String getIdcardtype() {
		return getStr("idcardtype");
	}

	public void setIdcard(java.lang.String idcard) {
		set("idcard", idcard);
	}

	public java.lang.String getIdcard() {
		return getStr("idcard");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setCreateSource(java.lang.String createSource) {
		set("create_source", createSource);
	}

	public java.lang.String getCreateSource() {
		return getStr("create_source");
	}

	public void setLogged(java.util.Date logged) {
		set("logged", logged);
	}

	public java.util.Date getLogged() {
		return get("logged");
	}

	public void setActivated(java.util.Date activated) {
		set("activated", activated);
	}

	public java.util.Date getActivated() {
		return get("activated");
	}

}
