package com.ninesale.valinor.apiserver.web.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.common.constant.SysContant;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.config.GetConfigResponse;
import com.ninesale.valinor.apiserver.web.model.config.GetConfigResponse.ConfigData;

/**
 * 
 * @author hawk2222
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController extends BaseController {

	@RequestMapping(value = "getconfig", method = RequestMethod.GET)
	public ClientBasicResponse getConfig() {

		GetConfigResponse resp = new GetConfigResponse();
		Map<String, List<ConfigData>> data = new LinkedHashMap<String, List<ConfigData>>();
		List<ConfigData> configDataList = null;

		/**
		 * 控件类型
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.FacterType.TEXT, "文本"));
		configDataList.add(new ConfigData(SysContant.FacterType.DATE, "日期"));
		configDataList.add(new ConfigData(SysContant.FacterType.SELECT, "下拉框"));
		data.put("facterType", configDataList);

		/**
		 * 控件值类型
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.FacterValueType.INT_TYPE, "整型"));
		configDataList.add(new ConfigData(SysContant.FacterValueType.STRING_TYPE, "字符串"));
		data.put("facterValueType", configDataList);

		/**
		 * 控件运算符类型
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.FacterSymbolType.VAL_EQUAL, "等于"));
		configDataList.add(new ConfigData(SysContant.FacterSymbolType.VAL_CONTAIN, "包含"));
		configDataList.add(new ConfigData(SysContant.FacterSymbolType.PRE_MATCH, "前匹配"));
		configDataList.add(new ConfigData(SysContant.FacterSymbolType.MULTI_MATCH, "多值匹配"));
		data.put("facterSymbolType", configDataList);

		/**
		 * 数据库类型
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.DatabaseType.MYSQL, "MySQL"));
		data.put("dbType", configDataList);

		/**
		 * 字符类型
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.CharacterType.UTF8_TYPE, "UTF-8"));
		data.put("characterType", configDataList);

		/**
		 * 报表类型配置
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.ReportType.TABLE, "表格"));
		configDataList.add(new ConfigData(SysContant.ReportType.LINE, "折线图"));
		configDataList.add(new ConfigData(SysContant.ReportType.BAR, "柱状图(竖直直方图)"));
		configDataList.add(new ConfigData(SysContant.ReportType.COLUMN, "条形图(水平直方图)"));
		configDataList.add(new ConfigData(SysContant.ReportType.PIE, "饼图"));
		configDataList.add(new ConfigData(SysContant.ReportType.COMPOUND_PIE, "复合饼图"));
		configDataList.add(new ConfigData(SysContant.ReportType.POLYGON, "多边形图"));
		configDataList.add(new ConfigData(SysContant.ReportType.METER, "仪表图"));
		configDataList.add(new ConfigData(SysContant.ReportType.MULTI_AXIS, "多坐标轴复合图"));
		configDataList.add(new ConfigData(SysContant.ReportType.STACKED_BAR, "条形堆叠图"));
		configDataList.add(new ConfigData(SysContant.ReportType.STACKED_COLUMN, "柱形堆叠图"));
		configDataList.add(new ConfigData(SysContant.ReportType.RADAR, "雷达图"));
		configDataList.add(new ConfigData(SysContant.ReportType.FUNNEL, "漏斗图"));
		configDataList.add(new ConfigData(SysContant.ReportType.SCATTER, "散点图"));
		configDataList.add(new ConfigData(SysContant.ReportType.CUSTOM_REPORT, "自定义图表"));
		data.put("reportType", configDataList);

		/**
		 * 报表类型配置
		 */
		configDataList = new ArrayList<ConfigData>();
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.MINITUS_TYPE, "每分钟"));
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.HALFHOUR_TYPE, "半小时"));
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.ONEHOUR_TYPE, "每小时"));
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.EVERYDAY_TYPE, "每天"));
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.EVERYWEEK_TYPE, "每周"));
		configDataList.add(new ConfigData(SysContant.UpdateCycleType.EVERYMONTH_TYPE, "每月"));
		data.put("updateCycleType", configDataList);

		resp.setData(data);
		return resp;
	}
}
