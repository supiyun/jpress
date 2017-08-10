
package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 *  Auto generated, do not modify this file.
 */
@SuppressWarnings("serial")
public class BaseContent<M extends BaseContent<M>> extends JbootModel<M> implements IBean {

	public static final String ACTION_ADD = "content:add";
	public static final String ACTION_DELETE = "content:delete";
	public static final String ACTION_UPDATE = "content:update";

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

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}

	public java.lang.String getText() {
		return getStr("text");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}

	public java.lang.String getSummary() {
		return getStr("summary");
	}

	public void setLinkTo(java.lang.String linkTo) {
		set("link_to", linkTo);
	}

	public java.lang.String getLinkTo() {
		return getStr("link_to");
	}

	public void setMarkdownEnable(java.lang.Boolean markdownEnable) {
		set("markdown_enable", markdownEnable);
	}

	public java.lang.Boolean getMarkdownEnable() {
		return get("markdown_enable");
	}

	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}

	public java.lang.String getThumbnail() {
		return getStr("thumbnail");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return getStr("module");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}

	public java.lang.String getStyle() {
		return getStr("style");
	}

	public void setUserId(java.math.BigInteger userId) {
		set("user_id", userId);
	}

	public java.math.BigInteger getUserId() {
		return get("user_id");
	}

	public void setAuthor(java.lang.String author) {
		set("author", author);
	}

	public java.lang.String getAuthor() {
		return getStr("author");
	}

	public void setUserEmail(java.lang.String userEmail) {
		set("user_email", userEmail);
	}

	public java.lang.String getUserEmail() {
		return getStr("user_email");
	}

	public void setUserIp(java.lang.String userIp) {
		set("user_ip", userIp);
	}

	public java.lang.String getUserIp() {
		return getStr("user_ip");
	}

	public void setUserAgent(java.lang.String userAgent) {
		set("user_agent", userAgent);
	}

	public java.lang.String getUserAgent() {
		return getStr("user_agent");
	}

	public void setParentId(java.math.BigInteger parentId) {
		set("parent_id", parentId);
	}

	public java.math.BigInteger getParentId() {
		return get("parent_id");
	}

	public void setObjectId(java.math.BigInteger objectId) {
		set("object_id", objectId);
	}

	public java.math.BigInteger getObjectId() {
		return get("object_id");
	}

	public void setOrderNumber(java.lang.Long orderNumber) {
		set("order_number", orderNumber);
	}

	public java.lang.Long getOrderNumber() {
		return getLong("order_number");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}

	public java.lang.Long getVoteUp() {
		return getLong("vote_up");
	}

	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}

	public java.lang.Long getVoteDown() {
		return getLong("vote_down");
	}

	public void setRate(java.lang.Integer rate) {
		set("rate", rate);
	}

	public java.lang.Integer getRate() {
		return getInt("rate");
	}

	public void setRateCount(java.lang.Long rateCount) {
		set("rate_count", rateCount);
	}

	public java.lang.Long getRateCount() {
		return getLong("rate_count");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setCommentStatus(java.lang.String commentStatus) {
		set("comment_status", commentStatus);
	}

	public java.lang.String getCommentStatus() {
		return getStr("comment_status");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}

	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

	public void setCommentTime(java.util.Date commentTime) {
		set("comment_time", commentTime);
	}

	public java.util.Date getCommentTime() {
		return get("comment_time");
	}

	public void setViewCount(java.lang.Long viewCount) {
		set("view_count", viewCount);
	}

	public java.lang.Long getViewCount() {
		return getLong("view_count");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}

	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setLng(java.math.BigDecimal lng) {
		set("lng", lng);
	}

	public java.math.BigDecimal getLng() {
		return get("lng");
	}

	public void setLat(java.math.BigDecimal lat) {
		set("lat", lat);
	}

	public java.math.BigDecimal getLat() {
		return get("lat");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}

	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}

	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}

	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

}
