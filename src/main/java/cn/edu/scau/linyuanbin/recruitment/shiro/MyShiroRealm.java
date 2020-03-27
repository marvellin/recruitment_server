/*
package cn.edu.scau.linyuanbin.recruitment.shiro;

*/
/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 21:51 2020/3/26
 *//*

*/
/*import com.google.gson.JsonObject;
import com.test.cbd.service.UserService;
import com.test.cbd.vo.SysPermission;
import com.test.cbd.vo.SysRole;
import com.test.cbd.vo.UserInfo;*//*

import cn.edu.scau.linyuanbin.recruitment.domain.User;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;


public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService service;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals){
//        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Session session = SecurityUtils.getSubject().getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        // 用户的角色集合
        Set<String> roles = new HashSet<>();
//        roles.add(user.getRoleList().get(0).getRole());
        roles.add(user.getRole());
        authorizationInfo.setRoles(roles);
        return authorizationInfo;
    }

    */
/*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();
//        System.out.println(token.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
//        UserInfo userInfo = userInfoService.findByUsername(username);
        User user = service.getUserByemail(username);
        // Subject subject = SecurityUtils.getSubject();
        //Session session = subject.getSession();
        //session.setAttribute("role",userInfo.getRoleList());
//        System.out.println("----->>userInfo="+userInfo);
        if (user == null) {
            return null;
        }
        */
/*if (user.getState() == 1) { //账户冻结
            throw new LockedAccountException();
        }*//*

        String credentials = user.getPassword();
        System.out.println("credentials="+credentials);
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getEmail(), //用户名
                credentials, //密码
                credentialsSalt,
                getName()  //realm name
        );
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("USER_SESSION", user);
        return authenticationInfo;
    }

}
*/
