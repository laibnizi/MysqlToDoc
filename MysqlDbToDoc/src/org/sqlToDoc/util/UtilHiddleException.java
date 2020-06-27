package org.sqlToDoc.util;



/**
 * @author 42267
 * @version
 * @项目名称：MysqlDbToDoc   
 * @类名称：UtilHiddleException   
 * @类描述：      统一异常处理
 * @创建时间：2020年6月27日 下午12:34:18           
 */
public class UtilHiddleException {
	
	public static void hiddleException(Throwable e) {
		e.printStackTrace();
	}
}