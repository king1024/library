package com.king.library.config.shiro;

import com.king.library.common.constants.StatusEnum;
import com.king.library.sys.pojo.SysResources;
import com.king.library.sys.pojo.SysRole;
import com.king.library.sys.pojo.SysUser;
import com.king.library.sys.service.SysResourcesService;
import com.king.library.sys.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

/**
 * @date: 2019/12/13 17:12
 * @author: duanyong
 * @desc:自定义Realm
 */
public class UserRealm extends AuthorizingRealm {
	private Logger logger = LoggerFactory.getLogger(UserRealm.class);

	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysResourcesService sysResourcesService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		SysUser user=(SysUser)principals.getPrimaryPrincipal();
		if("root".equals(user.getUserType())){
			List<SysResources> allResources = sysResourcesService.findAllResources();
			for (SysResources resources : allResources) {
				authorizationInfo.addStringPermission(resources.getPermission());
			}
		}else{
			for(SysRole role:user.getRoles()) {
				authorizationInfo.addRole(role.getName());
				for (SysResources resources : role.getSysResources()) {
					authorizationInfo.addStringPermission(resources.getPermission());
				}
			}
		}
//		Session session = SecurityUtils.getSubject().getSession();
//		//查询用户的权限
//		JSONObject permission = (JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);
//		logger.info("permission的值为:" + permission);
//		logger.info("本用户权限为:" + permission.get("permissionList"));
//		//为当前用户设置角色和权限
//		authorizationInfo.addStringPermissions((Collection<String>) permission.get("permissionList"));
		return authorizationInfo;
	}

	/**
	 * 验证当前登录的Subject
	 * LoginController.login()方法中执行Subject.login()时 执行此方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		String loginName = (String) authcToken.getPrincipal();
		// 获取用户密码
//		String password = new String((char[]) authcToken.getCredentials());
		SysUser user = sysUserService.getUserByName(loginName);
		if (user == null) {
			throw new UnknownAccountException("账号不存在！");
		}
		if (user.getStatus() != null && StatusEnum.DISABLE.getCode().equals(user.getStatus())) {
			throw new LockedAccountException("帐号已被锁定，禁止登录！");
		}
		//交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				user,
				user.getPassword(),
				//ByteSource.Util.bytes("salt"), salt=username+salt,采用明文访问时，不需要此句
				""
		);
//		//清除之前的授权信息
//		super.clearCachedAuthorizationInfo(authenticationInfo.getPrincipals());
//		//session中不需要保存密码
//		user.setPassword(null);
//		//将用户信息放入session中
//		SecurityUtils.getSubject().getSession().setAttribute(Constants.SESSION_USER_INFO, user);
		return authenticationInfo;
	}
}
