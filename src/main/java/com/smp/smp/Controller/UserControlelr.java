package com.smp.smp.Controller;

import com.smp.smp.Entity.User;
import com.smp.smp.Service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/smp")
public class UserControlelr {

    @Autowired
    UserService userService;
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value="当前页数",dataType="Integer", paramType = "query",example="1"),
            @ApiImplicitParam(name="size",value="本页条数",dataType="Integer", paramType = "query",example="1")})
    @GetMapping("/selectUsers")
    public Page<User> seleteUsers(Integer page,Integer size){
        Page<User> users = userService.selectUser(page, size);
        return users;
    }

    @PostMapping("/insertUser")
    @ApiImplicitParam(name="user",value="要插入的user",dataType="User", paramType = "query")
    public User insertUser(User user){
        User user1 = userService.insertUser(user);
        return user1;
    }

    @PutMapping("/updataUser")
    @ApiImplicitParam(name="user",value="要更新的user",dataType="User", paramType = "query")
    public User updataUser(User user){
        User user1 = userService.updataUser(user);
        return user1;
    }

    @DeleteMapping("/deleteUser")
    @ApiImplicitParam(name="id",value="要删除的user的id",dataType="Integer", paramType = "query")
    public User deleteUser(Integer id){
        User user = userService.deleteUser(id);
        return user;
    }

}
