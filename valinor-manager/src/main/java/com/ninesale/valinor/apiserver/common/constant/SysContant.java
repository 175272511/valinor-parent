package com.ninesale.valinor.apiserver.common.constant;

public interface SysContant {
	/**
	 * 默认编码
	 */
	String DEFAULT_CHARSET = "UTF-8";

	/**
	 * 报表类型
	 * 
	 * @author hawk
	 *
	 */
	interface ReportType {
		/**
		 * 表格
		 */
		int TABLE = 1;
		/**
		 * 折线图
		 */
		int LINE = 2;
		/**
		 * 柱状图(竖直直方图)
		 */
		int BAR = 3;
		/**
		 * 长条图(水平直方图)
		 */
		int COLUMN = 4;
		/**
		 * 饼图
		 */
		int PIE = 5;

		/**
		 * 符合饼图，双层饼图
		 */
		int COMPOUND_PIE = 6;

		/**
		 * 多边形数量图（一个框里面显示一个数字，可以显示成三角形，正方形，三角形等等）
		 */
		int POLYGON = 7;

		/**
		 * 仪表图
		 */
		int METER = 8;

		/**
		 * 复合图，多坐标轴
		 */
		int MULTI_AXIS = 9;

		/**
		 * 条形堆叠图
		 */
		int STACKED_BAR = 10;

		/**
		 * 柱状堆叠图
		 */
		int STACKED_COLUMN = 11;

		/**
		 * 雷达图
		 */
		int RADAR = 12;

		/**
		 * 漏斗图
		 */
		int FUNNEL = 13;

		/**
		 * 散点图
		 */
		int SCATTER = 14;

		/**
		 * 气泡图
		 */
		int BUBBLE = 15;

		/**
		 * 自定义报表
		 */
		int CUSTOM_REPORT = 100;
	}

	/**
	 * 多边形数量图类型
	 * 
	 * @author hawk
	 *
	 */
	interface PolyGonType {

	}

	/**
	 * 控件类型
	 * 
	 * @author hawk
	 *
	 */
	interface FacterType {
		/**
		 * 文本域
		 */
		int TEXT = 1;
		/**
		 * 日期值
		 */
		int DATE = 2;
		/**
		 * 下拉列表 多值
		 */
		int SELECT = 3;
	}

	/**
	 * 控件值类型
	 * 
	 * @author hawk
	 *
	 */
	interface FacterValueType {
		/**
		 * 字符
		 */
		int STRING_TYPE = 1;
		/**
		 * 整型
		 */
		int INT_TYPE = 2;

	}

	/**
	 * 字符串运算符类型
	 * 
	 * @author hawk
	 *
	 */
	interface FacterSymbolType {
		int MULTI_MATCH = 1;

		int VAL_CONTAIN = 2;

		int VAL_EQUAL = 3;

		int PRE_MATCH = 4;
	}

	/**
	 * 数据库类型
	 * 
	 * @author hawk
	 *
	 */
	interface DatabaseType {
		int MYSQL = 1;
		int ORACLE = 2;
		int SQLSERVER = 3;
	}

	/**
	 * 资源类型，对应权限表中字段类型1：菜单 2：按钮(包含页面上非菜单区域的所有点击触发调用服务器操作的内容) 3：方法
	 */
	interface ResourceType {
		int R_MENU = 1;
		int R_BUTTON = 2;
		int R_METHOD = 3;
	}

	interface RoleType {
		/**
		 * 超级管理员
		 */
		int SUPER_ADMIN = 90;
		/**
		 * 云聚管理员
		 */
		int SYSTEM_ADMIN = 40;

		/**
		 * 云聚用户
		 */
		int YUNJU_USER = 30;
		/**
		 * 商户的管理员
		 */
		int NORMAL_ADMIN = 20;
		/**
		 * 普通用户
		 */
		int NORMAL_USER = 10;

	}
	
	interface UserType{
		/**
		 * 一般用户
		 */
		int NORMAL_USER = 1;
	}

	/**
	 * 表格字段类型
	 * 
	 * @author hawk
	 *
	 */
	interface TableFieldType {
		int NUM_TYPE = 1;
		int STRING_TYPE = 2;
	}

	/**
	 * 字符集类型
	 * 
	 * @author hawk
	 *
	 */
	interface CharacterType {
		int UTF8_TYPE = 1;
	}

	interface UpdateCycleType {
		// 每分钟
		int MINITUS_TYPE = 1;
		// 半小时
		int HALFHOUR_TYPE = 2;
		// 一小时
		int ONEHOUR_TYPE = 3;
		// 每天
		int EVERYDAY_TYPE = 4;
		// 每周
		int EVERYWEEK_TYPE = 5;
		// 每月
		int EVERYMONTH_TYPE = 6;
	}
	
	interface LoginType {
		String APP_LOGIN = "app";
	}
	
	interface BindType{
		//绑定微信
		int BIND_WEIXIN = 1;
		//绑定qq
		int BIND_QQ = 2;
		//绑定新浪
		int BIND_SINA = 3;
	}

}
