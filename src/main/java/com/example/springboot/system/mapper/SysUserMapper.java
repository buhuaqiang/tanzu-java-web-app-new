package com.example.springboot.system.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.system.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import java.util.List;

/**
 * <p>
 * 用戶表 Mapper 接口
 * </p>
 *
 * @Author scott
 * @since 2018-12-20
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
	/**
	  * 通過用戶賬號查詢用戶信息
	 * @param username
	 * @return
	 */
	public SysUser getUserByName(@Param("username") String username);

	/**
	 *  根據部門Id查詢用戶信息
	 * @param page
	 * @param departId
	 * @return
	 */
	IPage<SysUser> getUserByDepId(Page page, @Param("departId") String departId, @Param("username") String username);


	/**
	 *  根據部門Ids,查詢部門下用戶信息
	 * @param page
	 * @param departIds
	 * @return
	 */
	IPage<SysUser> getUserByDepIds(Page page, @Param("departIds") List<String> departIds, @Param("username") String username);

	/**
	 * 根據角色Id查詢用戶信息
	 * @param page
	 * @param
	 * @return
	 */
	IPage<SysUser> getUserByRoleId(Page page, @Param("roleId") String roleId, @Param("username") String username);
	

	/**
	 * 根據手機號查詢用戶信息
	 * @param phone
	 * @return
	 */
	public SysUser getUserByPhone(@Param("phone") String phone);
	
	
	/**
	 * 根據郵箱查詢用戶信息
	 * @param email
	 * @return
	 */
	public SysUser getUserByEmail(@Param("email") String email);


    /**
     * 查詢 getUserByOrgCode 的Total
     *
     * @param orgCode
     * @param userParams 用戶查詢條件，可為空
     * @return
     */
    Integer getUserByOrgCodeTotal(@Param("orgCode") String orgCode, @Param("userParams") SysUser userParams);

    /**
     * @Author scott
     * @Date 2019/12/13 16:10
     * @Description: 批量刪除角色與用戶關系
     */
	void deleteBathRoleUserRelation(@Param("roleIdArray") String[] roleIdArray);

    /**
     * @Author scott
     * @Date 2019/12/13 16:10
     * @Description: 批量刪除角色與權限關系
     */
	void deleteBathRolePermissionRelation(@Param("roleIdArray") String[] roleIdArray);

	/**
	 * 查詢被邏輯刪除的用戶
	 */
	List<SysUser> selectLogicDeleted(@Param(Constants.WRAPPER) Wrapper<SysUser> wrapper);

	/**
	 * 還原被邏輯刪除的用戶
	 */
	int revertLogicDeleted(@Param("userIds") String userIds, @Param("entity") SysUser entity);

	/**
	 * 徹底刪除被邏輯刪除的用戶
	 */
	int deleteLogicDeleted(@Param("userIds") String userIds);

    /** 更新空字符串為null【此寫法有sql注入風險，禁止隨便用】 */
    @Deprecated
    int updateNullByEmptyString(@Param("fieldName") String fieldName);
    
	/**
	 *  根據部門Ids,查詢部門下用戶信息
	 * @param departIds
	 * @return
	 */
	List<SysUser> queryByDepIds(@Param("departIds") List<String> departIds, @Param("username") String username);
}
