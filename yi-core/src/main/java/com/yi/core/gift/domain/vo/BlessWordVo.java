/*
 * Powered By [yihz-framework]
 * Web Site: yihz
 * Since 2018 - 2018
 */

package com.yi.core.gift.domain.vo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yihz.common.convert.domain.VoDomain;
import com.yihz.common.json.serializer.JsonTimestampSerializer;

/**
 * *
 * 
 * @author yihz
 * @version 1.0
 * @since 1.0
 *
 */
public class BlessWordVo extends VoDomain implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	// columns START
	/**
	 * 祝福语ID
	 */
	@Max(9999999999L)
	private int id;
	/**
	 * GUID
	 */
	@Length(max = 32)
	private String guid;
	/**
	 * 祝福语
	 */
	@NotBlank
	@Length(max = 127)
	private String word;
	/**
	 * 状态（0启用1禁用）
	 */
	@NotNull
	@Max(127)
	private Integer state;
	/**
	 * 备注
	 */
	@Length(max = 255)
	private String remark;
	/**
	 * 创建时间
	 */
	@JsonSerialize(using = JsonTimestampSerializer.class)
	private Date createTime;
	/**
	 * 删除（0否1是）
	 */
	@NotNull
	@Max(127)
	private Integer deleted;
	/**
	 * 删除时间
	 */
	@JsonSerialize(using = JsonTimestampSerializer.class)
	private Date delTime;
	// columns END

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getDelTime() {
		return this.delTime;
	}

	public void setDelTime(Date delTime) {
		this.delTime = delTime;
	}

}