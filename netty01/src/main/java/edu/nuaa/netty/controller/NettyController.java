package edu.nuaa.netty.controller;

import edu.nuaa.netty.server.NettyServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author brain
 * @version 1.0
 * @date 2023/5/30 19:46
 */
@RestController
@RequestMapping(value = "/nettyserver",method = RequestMethod.GET)
public class NettyController {
    @Resource
    private NettyServer nettyServer;
    @RequestMapping("/localAddress")
    public String localAddress(){
        return "nettyServer localAddress " + nettyServer.getChannel().localAddress();
    }
    @RequestMapping("/isOpen")
    public String isOpen() {
        return "nettyServer isOpen " + nettyServer.getChannel().isOpen();
    }
}
