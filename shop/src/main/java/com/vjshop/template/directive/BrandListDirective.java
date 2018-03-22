
package com.vjshop.template.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.vjshop.Filter;
import com.vjshop.Order;
import com.vjshop.entity.TBrand;
import com.vjshop.service.TBrandService;
import com.vjshop.util.FreeMarkerUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 模板指令 - 品牌列表
 * 
 * @author VJSHOP Team
 * @version 4.0
 */
@Component("brandListDirective")
public class BrandListDirective extends BaseDirective {

	/** "商品分类ID"参数名称 */
	private static final String PRODUCT_CATEGORY_ID_PARAMETER_NAME = "productCategoryId";

	/** "类型"参数名称 */
	private static final String TYPE_PARAMETER_NAME = "type";

	/** 变量名称 */
	private static final String VARIABLE_NAME = "brands";

	@Autowired
	private TBrandService brandService;

	/**
	 * 执行
	 * 
	 * @param env
	 *            环境变量
	 * @param params
	 *            参数
	 * @param loopVars
	 *            循环变量
	 * @param body
	 *            模板内容
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Long productCategoryId = FreeMarkerUtils.getParameter(PRODUCT_CATEGORY_ID_PARAMETER_NAME, Long.class, params);
		TBrand.Type type = FreeMarkerUtils.getParameter(TYPE_PARAMETER_NAME, TBrand.Type.class, params);
		Integer count = getCount(params);
		List<Filter> filters = getFilters(params, TBrand.class, TYPE_PARAMETER_NAME);
		if (type != null){
			filters.add(Filter.eq("t_brand.type", type.ordinal()));
		}
		List<Order> orders = getOrders(params);
		boolean useCache = useCache(env, params);
		List<TBrand> brands = brandService.findList(productCategoryId, count, filters, orders, useCache);
		setLocalVariable(VARIABLE_NAME, brands, env, body);
	}

}