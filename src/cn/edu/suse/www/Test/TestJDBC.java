package cn.edu.suse.www.Test;

import cn.edu.suse.www.Dao.SelectDatebaseSession;
import cn.edu.suse.www.Entity.UserInfo;

public class TestJDBC 
{

	public static void main(String[] args) 
	{
		//获得NetJavaSession对象
		SelectDatebaseSession session = new SelectDatebaseSession();
        //创建一个UserInfo对象
        UserInfo user = new UserInfo();
        //设置对象的属性
        user.setId(6988);
        user.setAge(44);
        user.setPwd("pwd");
        user.setName("champion");
        //将对象保存到数据库中
        String sql = session.getSaveObjectSql(user);
        System.out.println("保存对象的sql语句：" + sql);
        session.saveObject(user);
        //查找对象
        UserInfo userInfo = (UserInfo) session.getObject(
                "cn.edu.suse.www.Entity.UserInfo", 6988);
        System.out.println("获取到的信息：" + userInfo);

	}

}
