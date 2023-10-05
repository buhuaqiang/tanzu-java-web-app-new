package com.example.springboot.system.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用戶表
 * </p>
 *
 * @Author scott
 * @since 2018-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 登錄賬號
     */
    private String username;

    /**
     * 真實姓名
     */
    private String realname;

    /**
     * 密碼
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /**
     * md5密碼鹽
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String salt;

    /**
     * 頭像
     */
    private String avatar;

    /**
     * 生日
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 性別（1：男 2：女）
     */
    private Integer sex;

    /**
     * 電子郵件
     */
    private String email;

    /**
     * 電話
     */
    private String phone;

    /**
     * 部門code(當前選擇登錄部門)
     */
    private String orgCode;

    /**部門名稱*/
    private transient String orgCodeTxt;

    /**
     * 狀態(1：正常  2：凍結 ）
     */
    private Integer status;

    /**
     * 刪除狀態（0，正常，1已刪除）
     */
    private Integer delFlag;

    /**
     * 工號，唯一鍵
     */
    private String workNo;

    /**
     * 職務，關聯職務表
     */
    private String post;

    /**
     * 座機號
     */
    private String telephone;

    /**
     * 創建人
     */
    private String createBy;

    /**
     * 創建時間
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新時間
     */
    private Date updateTime;
    /**
     * 同步工作流引擎1同步0不同步
     */
    private Integer activitiSync;

    /**
     * 身份（0 普通成員 1 上級）
     */
    private Integer userIdentity;

    /**
     * 負責部門
     */
    private String departIds;

    /**
     * 多租戶id配置，編輯用戶的時候設置
     */
    private String relTenantIds;

    /**設備id uniapp推送用*/
    private String clientId;
}
