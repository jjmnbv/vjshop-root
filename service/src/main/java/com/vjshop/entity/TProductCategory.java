
package com.vjshop.entity;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Transient;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity - 商品分类
 *
 * @author VJSHOP Team
 * @version 4.0
 */
public class TProductCategory implements Serializable, Comparable<TProductCategory>{

    private static final long serialVersionUID = -219858022;
    /** 树路径分隔符 */
    public static final String TREE_PATH_SEPARATOR = ",";

    /** 路径前缀 */
    private static final String PATH_PREFIX = "/goods/list";

    /** 路径后缀 */
    private static final String PATH_SUFFIX = ".jhtml";

    private Long      id;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private Long      version;
    private Integer   orders;
    private Integer   grade;
    private String    name;
    private String    seoDescription;
    private String    seoKeywords;
    private String    seoTitle;
    private String    treePath;
    private Long      parent;
    private String    img;

    private TProductCategory parentVO;

    /** 属性 */
    private List<TAttribute> attributes = new ArrayList<TAttribute>();

    private List<TProductCategory> children = new ArrayList<TProductCategory>();

    private List<TGoods> goods = new ArrayList<>();
    private List<TBrand> brands = new ArrayList<>();
    private List<TPromotion> promotions = new ArrayList<>();
    /** 参数 */
    private List<TParameter> parameters = new ArrayList<TParameter>();

    /** 规格 */
    private List<TSpecification> specifications = new ArrayList<TSpecification>();




    public TProductCategory() {}

    public TProductCategory(TProductCategory value) {
        this.id = value.id;
        this.createDate = value.createDate;
        this.modifyDate = value.modifyDate;
        this.version = value.version;
        this.orders = value.orders;
        this.grade = value.grade;
        this.name = value.name;
        this.seoDescription = value.seoDescription;
        this.seoKeywords = value.seoKeywords;
        this.seoTitle = value.seoTitle;
        this.treePath = value.treePath;
        this.parent = value.parent;
        this.img=value.img;
    }

    public TProductCategory(
        Long      id,
        Timestamp createDate,
        Timestamp modifyDate,
        Long      version,
        Integer   orders,
        Integer   grade,
        String    name,
        String    seoDescription,
        String    seoKeywords,
        String    seoTitle,
        String    treePath,
        Long      parent,
        String img
    ) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.version = version;
        this.orders = orders;
        this.grade = grade;
        this.name = name;
        this.seoDescription = seoDescription;
        this.seoKeywords = seoKeywords;
        this.seoTitle = seoTitle;
        this.treePath = treePath;
        this.parent = parent;
        this.img=img;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getOrders() {
        return this.orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @NotEmpty
    @Length(max = 200)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Length(max = 200)
    public String getSeoDescription() {
        return this.seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    @Length(max = 200)
    public String getSeoKeywords() {
        return this.seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    @Length(max = 200)
    public String getSeoTitle() {
        return this.seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getTreePath() {
        return this.treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    public Long getParent() {
        return this.parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public List<TProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<TProductCategory> children) {
        this.children = children;
    }

    public List<TGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<TGoods> goods) {
        this.goods = goods;
    }

    public List<TBrand> getBrands() {
        return brands;
    }

    public void setBrands(List<TBrand> brands) {
        this.brands = brands;
    }

    public List<TPromotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<TPromotion> promotions) {
        this.promotions = promotions;
    }

    public List<TAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<TAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<TParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<TParameter> parameters) {
        this.parameters = parameters;
    }

    public List<TSpecification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<TSpecification> specifications) {
        this.specifications = specifications;
    }

    public TProductCategory getParentVO() {
        return parentVO;
    }

    public void setParentVO(TProductCategory parentVO) {
        this.parentVO = parentVO;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductCategory (");

        sb.append(id);
        sb.append(", ").append(createDate);
        sb.append(", ").append(modifyDate);
        sb.append(", ").append(version);
        sb.append(", ").append(orders);
        sb.append(", ").append(grade);
        sb.append(", ").append(name);
        sb.append(", ").append(seoDescription);
        sb.append(", ").append(seoKeywords);
        sb.append(", ").append(seoTitle);
        sb.append(", ").append(treePath);
        sb.append(", ").append(parent);
        sb.append(", ").append(img);

        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TProductCategory that = (TProductCategory) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .toHashCode();
    }

    /**
     * 获取所有上级分类ID
     *
     * @return 所有上级分类ID
     */
    @Transient
    public Long[] getParentIds() {
        String[] parentIds = StringUtils.split(getTreePath(), TREE_PATH_SEPARATOR);
        Long[] result = new Long[parentIds.length];
        for (int i = 0; i < parentIds.length; i++) {
            result[i] = Long.valueOf(parentIds[i]);
        }
        return result;
    }

    /**
     * 实现compareTo方法
     *
     * @param tProductCategory
     *            排序对象
     * @return 比较结果
     */
    @Transient
    public int compareTo(TProductCategory tProductCategory) {
        if (tProductCategory == null) {
            return 1;
        }
        return new CompareToBuilder().append(getOrders(), tProductCategory.getOrders()).append(getId(), tProductCategory.getId()).toComparison();
    }

    /**
     * 获取路径
     *
     * @return 路径
     */
    @Transient
    public String getPath() {
        return getId() != null ? PATH_PREFIX + "/" + getId() + PATH_SUFFIX : null;
    }
}