package com.song.p7.platform.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

/**
 * API接口错误码定义
 * 占位符表示方法: {0}, {1}
 * 为了支持国际化，占位符可以直接在国际化文件中定义，也可以在参数中定义，在参数中定义与占位符分隔符号是英文冒号
 * 
 * @author Jack
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum APIErrorCode {
	SUCCESS								(0, "success"),

	/**
	 * HTTP返回码
	 */
	/** 1xx(临时响应) */
	HTTP_CODE_100                      	(100, "http.code.100"),
	HTTP_CODE_101                      	(101, "http.code.101"),
	/** 2xx(成功) */
	HTTP_CODE_200                      	(200, "http.code.200"),
	HTTP_CODE_201                      	(201, "http.code.201"),
	HTTP_CODE_202                      	(202, "http.code.202"),
    HTTP_CODE_203                      	(203, "http.code.203"),
    HTTP_CODE_204                      	(204, "http.code.204"),
    HTTP_CODE_205                      	(205, "http.code.205"),
    HTTP_CODE_206                      	(206, "http.code.206"),
	/** 3xx(重定向) */
    HTTP_CODE_300                      	(300, "http.code.300"),
    HTTP_CODE_301                      	(301, "http.code.301"),
    HTTP_CODE_302                      	(302, "http.code.302"),
    HTTP_CODE_303                      	(303, "http.code.303"),
    HTTP_CODE_304                      	(304, "http.code.304"),
    HTTP_CODE_305                      	(305, "http.code.305"),
	/** 4xx(请求错误) */
    HTTP_CODE_400                      	(400, "http.code.400"),
    HTTP_CODE_401                      	(401, "http.code.401"),
    HTTP_CODE_403                      	(403, "http.code.403"),
    HTTP_CODE_404                      	(404, "http.code.404"),
    HTTP_CODE_405                      	(405, "http.code.405"),
    HTTP_CODE_406                      	(406, "http.code.406"),
    HTTP_CODE_407                      	(407, "http.code.407"),
    HTTP_CODE_408                      	(408, "http.code.408"),
    HTTP_CODE_409                      	(409, "http.code.409"),
    HTTP_CODE_410                      	(410, "http.code.410"),
    HTTP_CODE_411                      	(411, "http.code.411"),
    HTTP_CODE_412                      	(412, "http.code.412"),
    HTTP_CODE_413                      	(413, "http.code.413"),
    HTTP_CODE_414                      	(414, "http.code.414"),
    HTTP_CODE_415                      	(415, "http.code.415"),
    HTTP_CODE_416                      	(416, "http.code.416"),
    HTTP_CODE_417                      	(417, "http.code.417"),
	/** 5xx(服务器错误) */
    HTTP_CODE_500                      	(500, "http.code.500"),
    HTTP_CODE_501                      	(501, "http.code.501"),
    HTTP_CODE_502                      	(502, "http.code.502"),
    HTTP_CODE_503                      	(503, "http.code.503"),
    HTTP_CODE_504                      	(504, "http.code.504"),
    HTTP_CODE_505                      	(505, "http.code.505"),

	/**
	 * 业务逻辑错误码
	 */
	/** 100权限错误 */
	AUTH_NOT_LOGIN                     	(10000, "auth.not.login"),
	AUTH_LOGIN_FAIL                    	(10001, "auth.login.fail"),
	AUTH_LOGIN_TIMEOUT                 	(10002, "auth.login.timeout"),
	AUTH_NO_PERMISSION                 	(10003, "auth.no.permission"),

	/** 110参数错误 */
	PARAM_ERROR                        	(11000, "param.error"),
	PARAM_NOT_NULL                     	(11001, "param.not.null"),
	PARAM_FORMAT_ERROR                 	(11002, "param.format.error"),
	PARAM_REQUEST_TYPE_ERROR           	(11003, "param.request.type.error"),
	PARAM_TYPE_NOT_SUPPORT			   	(11004, "param.type.not.support"),
	PARAM_IP_ERROR						(11005, "param.ip.error"),
	PARAM_PORT_ERROR					(11006, "param.port.error"),
	PARAM_FIELD_NOT_SORTABLE			(11007, "param.field.not.sortable"),
	PARAM_SORTFIELD_NOT_EXIST			(11008, "param.sortfield.not.exist"),
	PARAM_TIME_NOT_NULL					(11009, "param.time.not.null"),
	PARAM_TIME_NOT_ZERO					(11010, "param.time.not.zero"),
	PARAM_GET_SUPPORT_URL				(11011, "param.get.support.url"),
    PARAM_LANGUAGE_NO_SUPPORT			(11012, "param.language.no.support", "tip.language"),
	PARAM_LANGUAGE_KEY_NOT_NULL			(11013, "param.language.key.not.null"),
	PARAM_LINK_LABEL_TRANSLATE_INSTANCE_NOT_NULL	(11014, "param.link.label.translate.instance.not.null"),
	PARAM_LINK_LABEL_TRANSLATE_TYPE_NOT_NULL		(11015, "param.link.label.translate.type.not.null"),

	/** 120文件操作错误 */
	FILE_NOT_EXIST                     	(12000, "file.not.exist"),
	FILE_PCAP_NOT_EXIST                	(12001, "file.pcap.not.exist"),
	FILE_NETFLOW_NOT_EXIST             	(12002, "file.netflow.not.exist"),
	FILE_WRITE_CONFIG_FAIL             	(12003, "file.write.config.fail"),
	FILE_CREATE_LICENSE_LINK_FAIL	   	(12004, "file.create.license.link.fail"),
	FILE_NO_PERMISSION	   				(12005, "file.no.permission"),
	FILE_UPLOAD_NULL					(12006, "file.upload.null"),
	FILE_SUFFIX_ERROR					(12007, "file.suffix.error"),

	/** 130脚本调用以及shell命令错误 */
	COMMAND_NOT_EXIST                  	(13000, "command.not.exist"),
	COMMAND_ERROR                      	(13001, "command.error"),
	COMMAND_EXEC_FAIL                  	(13002, "command.exec.fail"),
	COMMAND_NOT_NULL                  	(13003, "command.not.null"),

	/** 140网络连接错误 */
	NETWORK_CONNECTION_FAIL            	(14000, "network.connection.fail"),
	NETWORK_CONNECTION_TIMEOUT         	(14002, "network.connection.timeout"),
	NETWORK_HOST_UNKNOWN               	(14003, "network.host.unknown"),
	NETWORK_PROJECT_REQUEST_FAIL	   	(14004, "network.project.request.fail"),

	/** 150数据库错误 */
	DB_POSTGRESQL_CONNECTION_FAIL      	(15000, "db.postgresql.connection.fail"),
	DB_MONGODB_CONNECTION_FAIL         	(15001, "db.mongodb.connection.fail"),
	DB_TABLE_FIELD_NOT_EXIST           	(15002, "db.table.field.not.exist"),
	DB_SQL_ERROR	          		   	(15003, "db.sql.error"),
	DB_DATASOURCE_ERROR				   	(15004, "db.datasource.error"),
	DB_USERNAME_NOT_NULL				(15005, "db.username.not.null"),
	DB_PASSWORD_NOT_NULL				(15006, "db.password.not.null"),
	DB_NAME_NOT_NULL			   		(15007, "db.name.not.null"),
	DB_HOST_NOT_NULL			   		(15008, "db.host.not.null"),
	DB_MONGODB_DATASOURCE_NOT_EXIST		(15009, "db.mongodb.datasource.not.exist", "tip.host"),

	/** 160分析等相关程序错误（protoA/offline/procmon等） */
	ANALYSIS_DECODE_NULL			   	(16000, "analysis.decode.null"),
	ANALYSIS_START_FAIL					(16001, "analysis.start.fail"),
	ANALYSIS_STOP_FAIL					(16002, "analysis.stop.fail"),
	ANALYSIS_CONFIG_WRITE_FAIL			(16003, "analysis.config.write.fail"),
	ANALYSIS_PROCESS_EXIST				(16004, "analysis.process.exist"),
	PROCMON_START_FAIL					(16005, "procmon.start.fail"),
	PROCMON_STOP_FAIL					(16006, "procmon.stop.fail"),
	PROCMON_CONFIG_WRITE_FAIL			(16007, "procmon.config.write.fail"),
	MONGO_ARRG_ERROR					(16008, "mongo.arrg.error"),
	SWEEPER_CONFIG_WRITE_FAIL			(16009, "sweeper.config.write.fail"),
	ANALYSIS_RUN_NOT_EXECUTE			(16010, "analysis.run.not.execute"),
	COLLECTOR_NOT_START					(16011, "collector.not.start"),
	N0_PCAP_TRACE_FILE					(16012, "n0_pcap.trace.file"),
    ANALYSIS_EXEC_ERROR                 (16013, "analysis.exec.error"),
	ANALYSIS_STATUS_ERROR               (16014, "analysis.status.error"),
	COLLECTOR_CONFIG_WRITE_ERROR		(16015, "collector.config.write.error"),

	/** 170数据异常 */
	DATA_FORMAT_FAIL                   	(17000, "data.format.fail"),
	DATA_ARITHMETIC_ERROR              	(17001, "data.arithmetic.error"),
	DATA_TYPE_FORMAT_ERROR             	(17002, "data.type.format.error"),

	/** 180配置-探针 */
	SERVER_NOT_EXIST				   	(18000, "server.not.exist", "tip.id"),
	SERVER_NOT_FOUND				   	(18001, "server.not.found"),
	SERVER_EXIST				   		(18002, "server.exist"),
	SERVER_MANAGE_MAC_NOT_EXIST			(18003, "server.manage.mac.not.exist"),
	SERVER_ID_NOT_NULL					(18004, "server.id.not.null"),

	/** 190接口 */
	INSTANCE_NOT_EXIST				   	(19000, "instance.not.exist", "tip.id"),
	INSTANCE_SERVER_NOT_EXIST			(19001, "instance.server.not.exist"),
	INSTANCE_NOT_FOUND				   	(19002, "instance.not.found"),
	INSTANCE_EXIST				   		(19003, "instance.exist"),
	INSTANCE_GROUP_ERROR				(19004, "instance.group.error"),
	INSTANCE_UNBOUND_NETWORKCARD		(19005, "instance.unbound.networkcard"),
	INSTANCE_ENABLED_FAIL				(19006, "instance.enabled.fail"),
	INSTANCE_ID_NOT_NULL				(19007, "instance.id.not.null"),

	/** 195网卡 */
	NETWORKCARD_NOT_EXIST				(19500, "networkcard.not.exist"),
	NETWORKCARD_EXIST					(19501, "networkcard.exist"),
	NETWORKCARD_NOT_FOUND				(19502, "networkcard.not.found"),
	NETWORKCARD_BIND_EXCEED				(19503, "networkcard.bind.exceed"),
	NETWORKCARD_NOT_BIND				(19504, "networkcard.not.bind"),

	/** 200规则 */
	RULE_NOT_EXIST				   		(20000, "rule.not.exist"),
	RULE_NAME_SAME						(20001, "rule.name.same"),
	RULE_INSTANCE_NAME_SAME				(20002, "rule.instance.name.same"),
	RULE_TYPE_ERROR						(20003, "rule.type.error"),
	PROTOCOL_NOT_EXIST				   	(20004, "protocol.not.exist", "tip.protocol"),
	PROTOCOL_TYPE_ERROR				   	(20005, "protocol.type.error"),
	PROTOCOL_DEFAULT_MODEL_UNEDITABLE	(20006, "protocol.default.model.uneditable"),
	PROTOCOL_MODEL_NOT_EXIST			(20007, "protocol.model.not.exist"),
	RULE_IPPROTO_NULL					(20008, "rule.ipproto.null"),
	WELL_KNOWN_DATA_ERROR				(20009, "well.known.data.error"),
	RULE_IPPROTO_MATCH_ERROR			(20010, "rule.ipproto.match.error", "tip.ipproto.match.error"),
	RULE_RECORD_MODE_DATA_ERROR			(20011, "rule.record.mode.data.error"),
	RULE_DEFAULT_EXCEED_MAX_NUM			(20012, "rule.default.exceed.max.num"),

	/** 210拓扑 */

	/** 220站点 */
	SITE_NOT_EXIST						(220000, "site.not.exist", "tip.id"),
	SITE_EXIST							(220001, "site.exist"),
	SITE_PASS_LIMIT						(220002, "site.pass.limit"),
	SITE_IP_DUPLICATE					(220003, "site.ip.duplicate"),
	SITE_NAME_EXIST						(220004, "site.name.exist", "tip.name"),
	SITE_ID_NOT_NULL					(220005, "site.id.not.null"),

	/** 221链路层标签 */
	LINK_LABEL_NOT_EXIST				(221000, "link.label.not.exist", "tip.id"),
	LINK_LABEL_EXIST					(221001, "link.label.exist"),
	LINK_LABEL_DUPLICATE				(221002, "link.label.duplicate"),
	LINK_LABEL_ID_NOT_NULL				(221003, "link.label.id.not.null"),
	LINK_LABEL_VLAN_EXCEED_MAX_VALUE	(221004, "link.label.vlan.exceed.max.value", "tip.max.value"),

	/** 222内网管理 */
	INNER_IP_DUPLICATE					(222000, "inner.ip.duplicate"),

	/** 223主机管理 */

	/** 230告警、打分 */
	ALARM_NOT_EXIST											(230000, "alarm.not.exist"),
	ALARM_EXIST												(230001, "alarm.exist"),
	ALARM_TEMPLATE_NOT_EXIST								(230002, "alarm.template.not.exist"),
    ALARM_TEMPLATE_KPI_NOT_EXIST							(230003, "alarm.template.kpi.not.exist"),
    ALARM_TARGET_ID_NOT_NULL								(230004, "alarm.target.id.not.null"),
	ALARM_OBJECT_NOT_EXIST									(230005, "alarm.object.not.exist"),
    ALARM_ALGORITHM_NOT_NULL								(230006, "alarm.algorithm.not.null"),
    ALARM_PERIOD_ERROR										(230007, "alarm.period.error"),
	ALARM_OBJECT_KPI_NOT_EXIST								(230008, "alarm.object.kpi.not.exist"),
	ALARM_WRITE_CONFIG_FAIL									(230009, "alarm.write.config.fail"),
	ALARM_NOT_CONFIG										(230010, "alarm.not.config"),
	ALARM_RELOAD_FAIL										(230011, "alarm.reload.fail"),
	ALARM_NOT_SUPPORT_OBJECT								(230012, "alarm.not.support.object"),
	ALARM_BASELINE_THRES_NOT_NULL							(230013, "alarm.baseline.thres.not.null"),
	ALARM_THRESHOLD_THRES_NOT_NULL							(230014, "alarm.threshold.thres.not.null"),
	ALARM_BASELINE_HIGH_THRES_NOT_LESS_THAN_ONE_HUNDRED		(230015, "alarm.baseline.high.thres.not.less.than.one.hundred"),
	ALARM_BASELINE_LOW_THRES_NOT_LESS_THAN_ONE_HUNDRED		(230016, "alarm.baseline.low.thres.not.less.than.one.hundred"),
	ALARM_BASELINE_LOW_THRES_NOT_GREATER_THAN_ZERO			(230017, "alarm.baseline.low.thres.not.greater.than.zero"),
	ALARM_KPI_UNIT_ERROR									(230018, "alarm.kpi.unit.error", "tip.unit"),
	ALARM_LOW_THRES_NOT_GREATER_THAN_HIGH_THRES				(230019, "alarm.low.thres.not.greater.than.high.thres"),
	ALARM_TEMPLATE_NAME_EXIST								(230020, "alarm.template.name.exist"),
	ALARM_THRES_NOT_LESS_THAN_ZERO							(230021, "alarm.thres.not.less.than.zero"),
	ALARM_CONFIG_RULE_NOT_FOUND								(230022, "alarm.config.rule.not.found"),
	ALARM_OBJECT_TRAFFIC_KPI_NOT_EXIST                      (230023,"alarm.object.traffic.kpi.not.exist"),
	/** 231健康度打分 */

	/** 232告警转发相关 */
	SYSLOG_NOT_EXIST					(232000, "syslog.not.exist"),
	SYSLOG_EXIST                         (232001,"syslog.exist"),

	/** 240用户管理 */
	USER_NOT_EXIST						(240000, "user.not.exist"),
	USER_EXIST							(240001, "user.exist"),
	USER_DISABLED						(240002, "user.disabled"),
	USER_LOCKED							(240003, "user.locked"),
	USER_USERNAME_NOT_NULL				(240004, "user.username.not.null"),
	USER_PASSWORD_NOT_NULL				(240005, "user.password.not.null"),
	USER_USERNAME_PASSWORD_ERROR       	(240006, "user.username.password.error"),
	USER_ROLE_ID_NOT_NULL       		(240007, "user.role.id.not.null"),
	USER_ID_NOT_NULL       				(240008, "user.id.not.null"),
	USER_PASSOWRD_NOT_SAME       		(240009, "user.passowrd.not.same"),
	USER_OLD_PASSOWRD_ERROR       		(240010, "user.old.passowrd.error"),
	USER_NOT_DELETE       				(240011, "user.not.delete"),
	USER_LOCKED_KEEP_WAITING			(240012, "user.locked.keep.waiting"),
	USER_NO_PERMISSION_ADD				(240013, "user.no.permission.add"),
	USER_NO_PERMISSION_UPDATE			(240014, "user.no.permission.update"),
	USER_NO_PERMISSION_DELETE			(240015, "user.no.permission.delete"),
	USER_NO_PERMISSION_OPERATION		(240016, "user.no.permission.operation"),

	/** 241角色管理 */
	ROLE_NOT_EXIST						(241000, "role.not.exist"),
	ROLE_EXIST							(241001, "role.exist"),
	ROLE_NAME_EXIST						(241002, "role.name.exist"),
	ROLE_ID_NOT_NULL					(241003, "role.id.not.null"),
	ROLE_NAME_NOT_NULL					(241004, "role.name.not.null"),
	ROLE_CREATE_FAIL					(241005, "role.create.fail"),
	ROLE_UPDATE_FAIL					(241006, "role.update.fail"),
	ROLE_DELETE_FAIL					(241007, "role.delete.fail"),
	ROLE_USER_EXIST_NOT_DELETE			(241008, "role.user.exist.not.delete"),
	ROLE_NOT_DELETE						(241009, "role.not.delete"),

	/** 242权限管理 */
	PERMISSION_NOT_EXIST							(242000, "permission.not.exist"),
	PERMISSION_EXIST								(242001, "permission.exist"),
	PERMISSION_MODULE_NOT_EXIST						(242002, "permission.module.not.exist", "tip.id"),
	PERMISSION_MODULE_ID_NOT_NULL					(242003, "permission.module.id.not.null"),
	PERMISSION_MODULE_TYPE_ERROR					(242004, "permission.module.type.error"),
	PERMISSION_LINK_TYPE_ERROR						(242005, "permission.link.type.error"),
	PERMISSION_MONITOR_GROUP_TYPE_ERROR				(242006, "permission.monitor.group.type.error"),
	PERMISSION_SITE_INSTANCE_LINK_LABEL_NOT_NULL	(242007, "permission.site.instance.link.label.not.null"),
	PERMISSION_OBJECT_NOT_AUTH						(242008, "permission.object.not.auth", "tip.id"),
	PERMISSION_SERVER_NOT_AUTH						(242009, "permission.server.not.auth", "tip.id"),
	PERMISSION_INSTANCE_NOT_AUTH					(242010, "permission.instance.not.auth", "tip.id"),
	PERMISSION_LINK_LABEL_NOT_AUTH					(242011, "permission.link.label.not.auth", "tip.id"),
	PERMISSION_SITE_NOT_AUTH						(242012, "permission.site.not.auth", "tip.id"),
	PERMISSION_MONITOR_GROUP_NOT_AUTH				(242013, "permission.monitor.group.not.auth", "tip.id"),
	PERMISSION_MONITOR_GROUP_CATALOG_NOT_AUTH		(242014, "permission.monitor.group.catalog.not.auth", "tip.id"),

	/** 243权限管理 */
	TOKEN_NOT_EXIST						(243000, "token.not.exist"),
	TOKEN_EXIST							(243001, "token.exist"),
	TOKEN_CREATE_FAIL					(243002, "token.create.fail"),
	TOKEN_INTERNAL_NOT_EXIST			(243003, "token.internal.not.exist"),

	/** 250License */
	LICENSE_CHECK_SUCCESS				(250000, "license.check.success"),
	LICENSE_CHECK_FAIL					(250001, "license.check.fail"),
	LICENSE_EXPIRE						(250002, "license.expire"),
	LICENSE_NOT_SUPPORT_PERMANENT		(250003, "license.not.support.permanent"),
	LICENSE_NOT_SUPPORT_TEMPORARY		(250004, "license.not.support.temporary"),
	LICENSE_INFO_NULL					(250005, "license.info.null"),
	LICENSE_FILE_NOT_EXIST				(250006, "license.file.not.exist"),
	LICENSE_SUFFIX_ERROR				(250007, "license.suffix.error"),
	LICENSE_FILE_SIZE_ERROR				(250008, "license.file.size.error"),
	LICENSE_CHECK_FAIL_MSG				(250009, "license.check.fail.msg","tip.error"),

	/** 260定时任务 */
	JOB_NOT_EXIST 						(26000, "job.not.exist"),
	TRIGGER_NOT_EXIST 					(26001, "trigger.not.exist"),
	JOB_IS_RUNNING 						(26002, "job.is.running"),
	RUN_JOB_UNKNOW_ERROR 				(26003, "run.job.unknow.error"),
	JOB_NAME_NOT_NULL					(26004, "job.name.not.null"),
	JOB_GROUP_NAME_NOT_NULL				(26005, "job.group.name.not.null"),
	JOB_OPERATE_NOT_NULL				(26006, "job.operate.not.null"),

	/** 270日志管理 */

	/** 280第三方数据接口 */

	/** 290进程 */
	PROCESS_NOT_EXIST					(29000, "process.not.exist"),
	PROCESS_NO_PERMISSION				(29001, "process.no.permission"),
	PROCESS_CHROME_AND_DRIVER_EXIST				(29002, "process.chrome.and.driver.exist"),
	/** 300目录 */
	CATALOG_NOT_EXIST					(30000, "catalog.not.exist"),
	DIRECTORY_ALREADY_EXISTS			(30001, "directory.already.exists"),

	/** 301工作台 */
	WORKSPACE_NOT_EXIST					(30100, "workspace.not.exist"),

	/** 302仪表盘 */
	DASHBOARD_NOT_EXIST					(30200, "dashboard.not.exist"),
	DASHBOARD_FILTER_NOT_EXIST			(30201, "dashboard.filter.not.exist"),

	/** 303自定义图表 */
	CHART_NOT_EXIST						(30300, "chart.not.exist"),
	CHART_WORKSPACE_NOT_EXIST			(30301, "chart.workspace.not.exist"),
	CHART_PRECISION_NOT_NULL   			(30302, "chart.precision.not.null"),
	CHART_PRECISION_MUST_NULL   		(30303, "chart.precision.must.null"),
	CHART_TOP_TYPE_NOT_NULL 			(30304, "chart.top.type.not.null"),
	CHART_TOP_PRECISION_NOT_SECOND		(30305, "chart.top.precision.not.second"),
	CHART_TOP_PRECISION_MUST_NULL		(30306, "chart.top.precision.must.null"),
	CHART_KPI_NOT_NULL   			    (30307, "chart.kpi.not.null"),

	/** 304报表 */
	REPORT_NOT_EXIST					(30400, "report.not.exist"),
	REPORT_FILTER_NOT_EXIST				(30401, "report.filter.not.exist"),
	REPORT_PERIOD_TYPE_ERROR			(30402, "report.period.type.error"),
	REPORT_CATELOGID_IS_NULL			(30403, "report.catelogid.is.null"),
	REPORT_FILTER_ADD_ERROR			    (30404, "report.filter.add.error"),
	REPORT_GENERATRE_SNAPSHOT_AXIS_ERROR(30405, "report.generatre.snapshot.axis.error"),
	CATALOG_TYPE_ERROR                  (30406, "catalog.type.error"),
	CATALOG_IS_NULL                     (30407, "catalog.is.null"),

	/** 310KPI */
	KPI_TABLE_NOT_EXIST					(31000, "kpi.table.not.exist"),
	KPI_SQLGROUP_NOT_EXIST				(31001, "kpi.sqlgroup.not.exist", "tip.error"),
	KPI_SQLGROUP_BY_TIME_ERROR			(31002, "kpi.sqlgroup.by.time.error", "tip.error"),
	KPI_SQLGROUP_BY_OBJ_ERROR			(31003, "kpi.sqlgroup.by.obj.error", "tip.error"),
	KPI_SQLGROUP_ERROR					(31004, "kpi.sqlgroup.error", "tip.error"),
	KPI_NOT_FOUND						(31005, "kpi.not.found", "tip.kpi"),
	KPI_GROUP_COLUMN_NOT_NULL			(31006, "kpi.group.column.not.null"),
	KPI_PRECISION_ERROR					(31007, "kpi.precision.error"),
	KPI_POSTGRESQL_NOT_SUPPORT			(31008, "kpi.postgresql.not.support", "tip.kpi"),
	KPI_RULE_NOT_SECOND_DATA			(31009, "kpi.rule.not.second.data"),
	KPI_ORIGINAL_VALUE_NOT_NULL			(31010, "kpi.original.value.not.null"),
	KPI_PRECISION_NOT_NULL				(31011, "kpi.precision.not.null"),
	KPI_BANDWIDTH_NOT_NULL				(31012, "kpi.bandwidth.not.null"),
	KPI_EXPRESSION_PARAM_NOT_NULL		(31013, "kpi.expression.param.not.null"),
	KPI_SECOND_GROUP_NOT_SUPPORT		(31014, "kpi.second.group.not.support", "tip.group.column"),
	KPI_MINUTE_GROUP_NOT_SUPPORT		(31015, "kpi.minute.group.not.support", "tip.group.column"),
	KPI_MONGO_NOT_SUPPORT				(31016, "kpi.mongo.not.support"),
	KPI_DATA_NOT_GROUP_COLUMN			(31017, "kpi.data.not.group.column"),
	KPI_SECOND_NOT_SUPPORT				(31018, "kpi.second.not.support"),
	KPI_TIME_MUST_MICROSECOND			(31019, "kpi.time.must.microsecond", "tip.starttime.endtime"),
	KPI_NOT_SAME_TABLE					(31020, "kpi.not.same.table"),
	KPI_NOT_SUPPORT_SECOND				(31021, "kpi.not.support.second"),

	/** 320自定义配置custom.config */
	CUSTOM_CONFIG_NOT_RIGHT				(32000, "custom.config.not.right"),
	CUSTOM_CONFIG_NOT_EXIST   			(32001, "custom.config.not.exist"),
	CUSTOM_CONFIG_INSTANCE_NOT_EXIST   	(32002, "custom.config.instance.not.exist"),
	CUSTOM_CONFIG_REPEAT   				(32003, "custom.config.repeat"),
	CUSTOM_CONFIG_DISTRIBUTED_UPDATE   	(32004, "custom.config.distributed.update"),

	/** 330监控组 */
	MONITOR_GROUP_EXIST					(33000, "monitor.group.exist"),
	MONITOR_GROUP_NOT_EXIST				(33001, "monitor.group.not.exist", "tip.id"),
	MONITOR_GROUP_ID_NOT_NULL			(33002, "monitor.group.id.not.null"),
	MONITOR_GROUP_CATALOG_ID_NOT_NULL	(33003, "monitor.group.catalog.id.not.null"),
	MONITOR_GROUP_CATALOG_NOT_EXIST		(33004, "monitor.group.catalog.not.exist", "tip.id"),

	/** 340core分配 */
	INVALID_NETWORKCARD					(34000, "invalid.networkcard"),
	INVALID_INSTANCE					(34001, "invalid.instance"),
	INVALID_CORE_NUM					(34002, "invalid.core.num"),
	CORE_NUM_OVER_RANGE					(34003, "core.num.over.range"),
	CORE_ID_USED						(34004, "core.id.used"),
	CORE_UNASSIGNMENT					(34005, "core.unassignment"),
	CORE_NUM_WRONG						(34006, "core.num.wrong"),
	CORE_CRUB_NOT_FOUND					(34007, "core.crub.not.found"),
	BOUND_CORE_NOT_FOUND				(34008, "bound.core.not.found"),

	/** 350安全模块 */
	MDNDB_GEOIP_FILE_ERROR				(35000,"mdndb.geoip.file.error"),
	HOST_IP_EXIST_ERROR					(35001,"host.ip.exist.error"),
	HOST_NOT_EXIST_ERROR				(35002,"host.not.exist.error"),

	/** 360拓扑相关 */
	CANVAS_NOT_EXSIT					(36000, "canvas.not.exsit"),
	TOPO_NOT_EXSIT						(36001, "topo.not.exsit"),
	TOPO_TYPE_NOT_CUSTOM				(36002, "topo.type.not.custom"),
	TOPO_NODE_NO_SORT					(36003, "topo.node.no.sort"),
	TOPO_NODE_SAME_SORT					(36004, "topo.node.same.sort"),
	CANVAS_ERROR						(36005, "canvas.error"),
	NODE_WITH_RULEID_TYPE_ERROR			(36006, "node.with.ruleid.type.error"),
	CONTAINER_UNABLE_IN_CUSTOM			(36007, "container.unable.in.custom"),
	TOPO_NODE_NOT_EXSIT					(36008, "topo.node.not.exsit"),
	TOPO_KPI_CONFIG_SIZE_ERROR			(36009, "topo.kpi.config.size.error"),
	TOPO_TYPE_NOT_AUTO					(36010, "topo.type.not.auto"),
	CONTAINER_NODE_NO_KPI				(36011, "container.node.no.kpi"),
	CATALOG_NOT_TOPO_TYPE				(36012, "catalog.not.topo.type"),

	/** 370导入导出文件相关 */
	FILE_IMPORT_FAIL   					(37000,"file.import.fail"),
	FILE_FORMAT_ERROR					(37001,"file.format.error"),
	FILE_HEAD_ERROR						(37002,"file.head.error"),
	FILE_DATA_NOT_FOUND					(37003,"file.data.not.found"),

	/* 380 offline配置相关 */
	OFFLINE_CONFIG_IPRANGE_EMPTY		(38000,"offline.config.iprange.empty"),
	OFFLINE_PARAM_EMPTY					(38001,"offline.param.empty"),

	/** 390 七层相关 */
	APP_NOT_SUPPORT						(39000,"app.not.support"),

	/** 99999未知 */
	UNKNOWN_ERROR						(99999, "未知错误");
	
	private int code;				//错误码
	private String description;		//描述
	
	@JsonIgnore
	private String placeholder;		//占位符
	

	APIErrorCode(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	APIErrorCode(int code, String description, String placeholder) {
		this.code = code;
		this.description = description;
		this.placeholder = placeholder;
	}
	
}
