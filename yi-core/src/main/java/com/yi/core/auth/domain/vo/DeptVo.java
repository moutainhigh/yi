/*
 * Powered By [yihz-framework]
 * Web Site: yihz
 * Since 2018 - 2018
 */

package com.yi.core.auth.domain.vo;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yi.core.auth.domain.simple.DeptSimple;
import com.yihz.common.convert.domain.VoDomain;
import com.yihz.common.json.serializer.JsonTimestampSerializer;

/**
 * 部门
 * 
 * @author lemosen
 * @version 1.0
 * @since 1.0
 *
 */
public class DeptVo extends VoDomain implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	// columns START
	/**
	 * 部门ID
	 */
	@Max(9999999999L)
	private int id;
	/**
	 * GUID
	 */
	@Length(max = 32)
	private String guid;
	/**
	 * 上级部门
	 */
	private DeptSimple parent;
	/**
	 * 下级部门
	 */
	private Set<DeptSimple> children;
	/**
	 * 部门编码
	 */
	@Length(max = 16)
	private String deptNo;
	/**
	 * 部门名称
	 */
	@NotBlank
	@Length(max = 16)
	private String deptName;
	/**
	 * 部门描述
	 */
	@Length(max = 32)
	private String description;
	/**
	 * 创建时间
	 */
	@JsonSerialize(using = JsonTimestampSerializer.class)
	private Date createTime;
	/**
	 * 删除（0否1是）
	 */
	private Integer deleted;
	/**
	 * 删除时间
	 */
	private Date delTime;
	// columns END
	// /**
	// * 用户集合
	// */
	// private Set<UserVo> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public DeptSimple getParent() {
		return parent;
	}

	public void setParent(DeptSimple parent) {
		this.parent = parent;
	}

	public Set<DeptSimple> getChildren() {
		return children;
	}

	public void setChildren(Set<DeptSimple> children) {
		this.children = children;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getDelTime() {
		return delTime;
	}

	public void setDelTime(Date delTime) {
		this.delTime = delTime;
	}

	// public Set<UserVo> getUsers() {
	// return users;
	// }
	//
	// public void setUsers(Set<UserVo> users) {
	// this.users = users;
	// }
}