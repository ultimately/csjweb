package com.csj.csjweb.controller;

import com.alibaba.fastjson.JSON;
import com.csj.csjweb.config.BaseRequest;
import com.csj.csjweb.config.EagleEye;
import com.csj.csjweb.mapper.PermissionRoleMapper;
import com.csj.csjweb.model.PermissionRole;
import com.csj.csjweb.service.PermissionRoleService;
import com.csj.csjweb.util.SmsMessageRequest;
import com.csj.csjweb.util.TableResultResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/api")
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private PermissionRoleMapper permissionRoleMapper;

    @Autowired
    private PermissionRoleService permissionRoleService;

    @EagleEye(count = 1,encrypted = true,time = 60000)
    @ApiOperation(value="测试API接口", notes="")
    @RequestMapping(value = "/userPermission" , method = RequestMethod.POST)
    public String userPermission(@RequestBody(required = true) SmsMessageRequest smsMessageRequest){
	    return JSON.toJSONString(permissionRoleService.getUser());
    }

    @ApiOperation(value="测试API接口", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "limit", value = "limit", required = true, dataType = "int"),
            @ApiImplicitParam(name = "page", value = "page", required = true, dataType = "String")
    })
    @EagleEye(encrypted =false,count = 1,time=1000)
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    @ResponseBody
    public TableResultResponse<Object> page(@RequestParam(defaultValue = "2") int limit, @RequestParam(defaultValue = "1")int page, String name){
        Example example = new Example(PermissionRole.class);
        if(StringUtils.isNotBlank(name))
            example.createCriteria().andLike("name", "%" + name + "%");
        Page<Object> result = PageHelper.startPage(page, limit);
        permissionRoleMapper.selectByExample(example);
        return new TableResultResponse<Object>(result.getTotal(),result.getResult());
    }

}