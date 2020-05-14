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

	/** 170数据异常 */
	DATA_FORMAT_FAIL                   	(17000, "data.format.fail"),
	DATA_ARITHMETIC_ERROR              	(17001, "data.arithmetic.error"),
	DATA_TYPE_FORMAT_ERROR             	(17002, "data.type.format.error"),

	/** 240用户管理 */
	USER_NOT_EXIST						(24000, "user.not.exist"),
	USER_EXIST							(24001, "user.exist"),
	USER_DISABLED						(24002, "user.disabled"),
	USER_LOCKED							(24003, "user.locked"),
	USER_USERNAME_NOT_NULL				(24004, "user.username.not.null"),
	USER_PASSWORD_NOT_NULL				(24005, "user.password.not.null"),
	USER_USERNAME_PASSWORD_ERROR       	(24006, "user.username.password.error"),
	USER_ROLE_ID_NOT_NULL       		(24007, "user.role.id.not.null"),
	USER_ID_NOT_NULL       				(24008, "user.id.not.null"),
	USER_PASSOWRD_NOT_SAME       		(24009, "user.passowrd.not.same"),
	USER_OLD_PASSOWRD_ERROR       		(24010, "user.old.passowrd.error"),
	USER_NOT_DELETE       				(24011, "user.not.delete"),
	USER_LOCKED_KEEP_WAITING			(24012, "user.locked.keep.waiting"),
	USER_NO_PERMISSION_ADD				(24013, "user.no.permission.add"),
	USER_NO_PERMISSION_UPDATE			(24014, "user.no.permission.update"),
	USER_NO_PERMISSION_DELETE			(24015, "user.no.permission.delete"),
	USER_NO_PERMISSION_OPERATION		(24016, "user.no.permission.operation"),

	/** 241角色管理 */
	ROLE_NOT_EXIST						(24100, "role.not.exist"),
	ROLE_EXIST							(24101, "role.exist"),
	ROLE_NAME_EXIST						(24102, "role.name.exist"),
	ROLE_ID_NOT_NULL					(24103, "role.id.not.null"),
	ROLE_NAME_NOT_NULL					(24104, "role.name.not.null"),
	ROLE_CREATE_FAIL					(24105, "role.create.fail"),
	ROLE_UPDATE_FAIL					(24106, "role.update.fail"),
	ROLE_DELETE_FAIL					(24107, "role.delete.fail"),
	ROLE_USER_EXIST_NOT_DELETE			(24108, "role.user.exist.not.delete"),
	ROLE_NOT_DELETE						(24109, "role.not.delete"),

	/** 242权限管理 */
	PERMISSION_NOT_EXIST							(24200, "permission.not.exist"),
	PERMISSION_EXIST								(24201, "permission.exist"),
	PERMISSION_MODULE_NOT_EXIST						(24202, "permission.module.not.exist", "tip.id"),
	PERMISSION_MODULE_ID_NOT_NULL					(24203, "permission.module.id.not.null"),
	PERMISSION_MODULE_TYPE_ERROR					(24204, "permission.module.type.error"),
	PERMISSION_LINK_TYPE_ERROR						(24205, "permission.link.type.error"),
	PERMISSION_MONITOR_GROUP_TYPE_ERROR				(24206, "permission.monitor.group.type.error"),
	PERMISSION_SITE_INSTANCE_LINK_LABEL_NOT_NULL	(24207, "permission.site.instance.link.label.not.null"),
	PERMISSION_OBJECT_NOT_AUTH						(24208, "permission.object.not.auth", "tip.id"),
	PERMISSION_SERVER_NOT_AUTH						(24209, "permission.server.not.auth", "tip.id"),
	PERMISSION_INSTANCE_NOT_AUTH					(24210, "permission.instance.not.auth", "tip.id"),
	PERMISSION_LINK_LABEL_NOT_AUTH					(24211, "permission.link.label.not.auth", "tip.id"),
	PERMISSION_SITE_NOT_AUTH						(24212, "permission.site.not.auth", "tip.id"),
	PERMISSION_MONITOR_GROUP_NOT_AUTH				(24213, "permission.monitor.group.not.auth", "tip.id"),
	PERMISSION_MONITOR_GROUP_CATALOG_NOT_AUTH		(24214, "permission.monitor.group.catalog.not.auth", "tip.id"),

	/** 243权限管理 */
	TOKEN_NOT_EXIST						(24300, "token.not.exist"),
	TOKEN_EXIST							(24301, "token.exist"),
	TOKEN_CREATE_FAIL					(24302, "token.create.fail"),
	TOKEN_INTERNAL_NOT_EXIST			(24303, "token.internal.not.exist"),

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

	/** 370导入导出文件相关 */
	FILE_IMPORT_FAIL   					(37000,"file.import.fail"),
	FILE_FORMAT_ERROR					(37001,"file.format.error"),
	FILE_HEAD_ERROR						(37002,"file.head.error"),
	FILE_DATA_NOT_FOUND					(37003,"file.data.not.found"),

	EMAIL_ERROR						(400000,"email.error"),
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
