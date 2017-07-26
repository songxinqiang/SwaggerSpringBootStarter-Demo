/**
 * <pre>
 * Copyright (c) 2017 阿信sxq(songxinqiang@vip.qq.com).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
/*
 * 创建时间：2017年7月24日--下午3:05:27
 * 作者：宋信强(阿信sxq, songxinqiang@vip.qq.com, https://my.oschina.net/songxinqiang)
 * <p>
 * 众里寻她千百度, 蓦然回首, 那人却在灯火阑珊处.
 * </p>
 */
package cn.songxinqiang.demo.swagger.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.songxinqiang.demo.swagger.model.User;

/**
 * 控制器演示
 *
 * @author 阿信sxq
 *
 */
@RestController
@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User userInfo(@RequestBody User user) {
        user.setPassword("test");
        return user;
    }

}
