package com.quxuecangjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // 核心页面
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/service")
    public String service() {
        return "service";
    }
    @GetMapping("/custom")
    public String custom() {
        return "custom";
    }
    @GetMapping("/cartoon")
    public String cartoon() {
        return "cartoon";
    }
    @GetMapping("/ip")
    public String ip() {
        return "ip";
    }
    @GetMapping("/product")
    public String product() {
        return "product";
    }
    @GetMapping("/activity")
    public String activity() {
        return "activity";
    }
    @GetMapping("/feedback")
    public String feedback() {
        return "feedback";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    // 自然万物系列
    @GetMapping("/ziran")
    public String ziranIndex() {
        return "ziran/index";
    }
    @GetMapping("/ziran/ri")
    public String ziranRi() {
        return "ziran/ri";
    }
    @GetMapping("/ziran/yue")
    public String ziranYue() {
        return "ziran/yue";
    }
    @GetMapping("/ziran/shan")
    public String ziranShan() {
        return "ziran/shan";
    }
    @GetMapping("/ziran/shui")
    public String ziranShui() {
        return "ziran/shui";
    }
    @GetMapping("/ziran/huo")
    public String ziranHuo() {
        return "ziran/huo";
    }

    // 人与生活系列
    @GetMapping("/shenghuo")
    public String shenghuoIndex() {
        return "shenghuo/index";
    }
    @GetMapping("/shenghuo/ren")
    public String shenghuoRen() {
        return "shenghuo/ren";
    }
    @GetMapping("/shenghuo/shou")
    public String shenghuoShou() {
        return "shenghuo/shou";
    }
    @GetMapping("/shenghuo/kou")
    public String shenghuoKou() {
        return "shenghuo/kou";
    }
    @GetMapping("/shenghuo/yi")
    public String shenghuoYi() {
        return "shenghuo/yi";
    }
    @GetMapping("/shenghuo/mu")
    public String shenghuoMu() {
        return "shenghuo/mu";
    }

    // 动物世界系列
    @GetMapping("/dongwu")
    public String dongwuIndex() {
        return "dongwu/index";
    }
    @GetMapping("/dongwu/ma")
    public String dongwuMa() {
        return "dongwu/ma";
    }
    @GetMapping("/dongwu/yu")
    public String dongwuYu() {
        return "dongwu/yu";
    }
    @GetMapping("/dongwu/niao")
    public String dongwuNiao() {
        return "dongwu/niao";
    }
    @GetMapping("/dongwu/xiang")
    public String dongwuXiang() {
        return "dongwu/xiang";
    }

    // 手工教程页面
    @GetMapping("/handcraft/ziran/ri")
    public String riHandcraft() {
        return "handcraft/ziran/ri";
    }
    @GetMapping("/handcraft/ziran/yue")
    public String yueHandcraft() {
        return "handcraft/ziran/yue";
    }
    @GetMapping("/handcraft/ziran/shan")
    public String shanHandcraft() {
        return "handcraft/ziran/shan";
    }
    @GetMapping("/handcraft/ziran/shui")
    public String shuiHandcraft() {
        return "handcraft/ziran/shui";
    }
    @GetMapping("/handcraft/ziran/huo")
    public String huoHandcraft() {
        return "handcraft/ziran/huo";
    }
    @GetMapping("/handcraft/shenghuo/ren")
    public String renHandcraft() {
        return "handcraft/shenghuo/ren";
    }
    @GetMapping("/handcraft/shenghuo/shou")
    public String shouHandcraft() {
        return "handcraft/shenghuo/shou";
    }
    @GetMapping("/handcraft/shenghuo/kou")
    public String kouHandcraft() {
        return "handcraft/shenghuo/kou";
    }
    @GetMapping("/handcraft/shenghuo/yi")
    public String yiHandcraft() {
        return "handcraft/shenghuo/yi";
    }
    @GetMapping("/handcraft/shenghuo/mu")
    public String muHandcraft() {
        return "handcraft/shenghuo/mu";
    }
    @GetMapping("/handcraft/dongwu/ma")
    public String maHandcraft() {
        return "handcraft/dongwu/ma";
    }
    @GetMapping("/handcraft/dongwu/yu")
    public String yuHandcraft() {
        return "handcraft/dongwu/yu";
    }
    @GetMapping("/handcraft/dongwu/niao")
    public String niaoHandcraft() {
        return "handcraft/dongwu/niao";
    }
    @GetMapping("/handcraft/dongwu/xiang")
    public String xiangHandcraft() {
        return "handcraft/dongwu/xiang";
    }
}