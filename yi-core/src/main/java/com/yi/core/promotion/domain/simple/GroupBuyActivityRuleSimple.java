/*
 * Powered By [yihz-framework]
 * Web Site: yihz
 * Since 2018 - 2018
 */

package com.yi.core.promotion.domain.simple;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yi.core.commodity.domain.simple.CommoditySimple;
import com.yihz.common.convert.domain.SimpleDomain;

/**
 * *
 *
 * @author yihz
 * @version 1.0
 * @since 1.0
 */
public class GroupBuyActivityRuleSimple extends SimpleDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// columns START
	/**
	 *
	 */
	@Max(9999999999L)
	private int id;
	/**
	 * 编号
	 */
	@Length(max = 32)
	private String guid;
	/**
	 * 团购ID
	 */
	@NotNull
	private GroupBuyActivitySimple groupBuyActivity;
	/**
	 * 商品ID
	 */
	@NotNull
	private CommoditySimple commodity;
	/**
	 * 商品名称
	 */
	@Length(max = 128)
	private String commodityName;
	/**
	 * 成团数量
	 */
	@NotNull
	@Max(9999999999L)
	private int groupBuyQuantity;
	/**
	 * 注水数
	 */
	@Max(9999999999L)
	private int injectWater;
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

	public GroupBuyActivitySimple getGroupBuyActivity() {
		return groupBuyActivity;
	}

	public void setGroupBuyActivity(GroupBuyActivitySimple groupBuyActivity) {
		this.groupBuyActivity = groupBuyActivity;
	}

	public CommoditySimple getCommodity() {
		return commodity;
	}

	public void setCommodity(CommoditySimple commodity) {
		this.commodity = commodity;
	}

	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public int getGroupBuyQuantity() {
		return this.groupBuyQuantity;
	}

	public void setGroupBuyQuantity(int groupBuyQuantity) {
		this.groupBuyQuantity = groupBuyQuantity;
	}

	public int getInjectWater() {
		return this.injectWater;
	}

	public void setInjectWater(int injectWater) {
		this.injectWater = injectWater;
	}

}